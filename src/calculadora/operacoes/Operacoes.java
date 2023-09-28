package calculadora.operacoes;

/*
Classe que realiza operações matemáticas básicas.

Realiza uma operação matemática com base em dois números e um operador.
numero1 O primeiro número.
numero2 O segundo número.
operador O operador da operação a ser feita (+, -, *, /).
return O resultado da operação.
throws ArithmeticException Não permite uma divisão feita por zero.
throws IllegalArgumentException Se o operador não for válido
 */

public class Operacoes {
    public double operacoesCalculadora(double numero1, double numero2, char operador) {
        double resultado = 0.0;
        switch (operador){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 == 0){
                    throw new ArithmeticException("Divisão por 0 não é permitido.");
                }
                resultado = numero1 / numero2;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
        return resultado;
    }

}
