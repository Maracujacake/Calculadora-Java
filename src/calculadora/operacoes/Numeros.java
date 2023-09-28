package calculadora.operacoes;

// Classe para representar dois números em uma operação matemática.
public class Numeros {
    private double numero1;
    private double numero2;

    // Construtor da classe Numeros
    public Numeros(double numero1, double numero2) {
        this.numero1 = numero1; // Primeiro número a ser armazenado.
        this.numero2 = numero2; // Segundo número a ser armazenado.
    }

    // Obtém o primeiro número armazenado.
    public double getNumero1() {
        return numero1; // Retorna o primeiro número.
    }

    // Define o valor do primeiro número.
    public void setNumero1(double numero1) {
        this.numero1 = numero1; // O valor do primeiro número.
    }

    // Obtém o segundo número armazenado.
    public double getNumero2() {
        return numero2; // Retorna o segundo número.
    }

    // Define o valor do segundo número
    public void setNumero2(double numero2) {
        this.numero2 = numero2; // O valor do segundo número.
    }
}
