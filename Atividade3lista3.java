import java.util.Scanner;

public class Atividade3lista3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //coeficientes
        System.out.println("Digite o valor de 'a':");
        double a = entrada.nextDouble();

        System.out.println("Digite o valor de 'b':");
        double b = entrada.nextDouble();

        System.out.println("Digite o valor de 'c':");
        double c = entrada.nextDouble();

        // Calculando delta
        double delta = b * b - 4 * a * c;

        // Verificando coeficientes
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raizReal = -c / b;
            System.out.println("Valor da raiz real: " + raizReal);
        } else {
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                double raizUnica = -b / (2 * a);
                System.out.println("Valor da raiz: " + raizUnica);
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Valor da primeira raiz: " + raiz1);
                System.out.println("Valor da segunda raiz: " + raiz2);
            }
        }

        entrada.close();
    }
}