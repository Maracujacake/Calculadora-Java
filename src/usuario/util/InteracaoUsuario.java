package usuario.util;
import java.util.Scanner;

// Classe para interação com o usuário.
public class InteracaoUsuario {
    private static Scanner scanner = new Scanner(System.in); // Inicializa um objeto Scanner para entrada do usuário.
    char resposta;

    // Método para verificar se o usuário deseja continuar
    public static boolean perguntarSeDesejaContinuar() {
        System.out.print("Deseja continuar? (S/N): ");
        char resposta = scanner.next().charAt(0); // Variável para armazenar a resposta do usuário.
        return (resposta == 'S' || resposta == 's'); // return true se o usuário deseja continuar, false caso contrário.
    }

    // Fecha o Scanner
    public static void fecharScanner() {
        scanner.close();
    }
}
