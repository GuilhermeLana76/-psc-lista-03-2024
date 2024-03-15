import java.util.Scanner;
import java.util.Random;

public class Atividade6lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        // Encontra o menor e o maior número
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        // Realiza o sorteio de um número aleatório entre o menor e o maior número
        int numeroSorteado = random.nextInt(maiorNumero - menorNumero + 1) + menorNumero;

        // Verifica se o número sorteado é par ou ímpar
        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " (par).");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " (ímpar).");
        }

        scanner.close();
    }
}