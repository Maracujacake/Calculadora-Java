package main.calculadora;

import calculadora.operacoes.Numeros;
import calculadora.operacoes.Operacoes;
import usuario.util.InteracaoUsuario;

import java.util.Scanner;

// Classe principal da calculadora.
public class Calculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Inicializa um objeto Scanner para entrada do usuário.
        Numeros numeros = null; // Inicializa um objeto para armazenar números.
        Operacoes operacoes = new Operacoes(); // Inicializa um objeto para as operações matemáticas.
        boolean continuar = true; // Variável para controlar a continuidade do programa.

        // Loop principal que permite que o usuário faça cálculos repetidamente.
        while(continuar) {
            try {
                // Solicita que o usuário insira o primeiro número.
                System.out.println("Digite o primeiro número: ");
                while (!leitura.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número.");
                    leitura.next(); // Limpa a entrada inválida.
                }
                double numero1 = leitura.nextDouble();

                // Solicita que o usuário insira o operador.
                System.out.println("Digite o operador (+, -, *, /, p, r): ");
                System.out.println("O operador p representa potenciação enquanto r representa radiciação");
                char operador = leitura.next().charAt(0);
                double numero2 = 0;
                if(operador != 'r'){ // caso escolhido radiciação, aceita apenas 1 número

                    // Solicita que o usuário insira o segundo número.
                    System.out.println("Digite o segundo número: ");
                    while (!leitura.hasNextDouble()) {
                        System.out.println("Entrada inválida. Digite um número");
                        leitura.next(); // Limpa a entrada inválida.
                    }
                    
                     numero2 = leitura.nextDouble();
                    
                }

                // Cria um objeto Numeros para armazenar os números digitados pelo usuário.
                numeros = new Numeros(numero1, numero2);

                // Realiza o cálculo com base no operador inserido pelo usuário.
                double resultado = operacoes.operacoesCalculadora(numeros.getNumero1(), numeros.getNumero2(), operador);

                // Exibe o resultado.
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage()); // Exibe uma mensagem caso ocorra algum erro.
            }

            // Verifica se o usuário deseja continuar.
            if (!InteracaoUsuario.perguntarSeDesejaContinuar()){
                break;
            }
        }
        // Encerra o programa.
        System.out.println("Calculadora encerrada.");

        // Fecha o Scanner.
        InteracaoUsuario.fecharScanner();
    }
}
