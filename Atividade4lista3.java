import java.util.Scanner;

public class Atividade4lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Escolhendo o calculo 
        System.out.println("Escolha a operação:");
        System.out.println("1 - Calcular perímetro do círculo");
        System.out.println("2 - Calcular área do círculo");
        System.out.println("3 - Calcular volume da esfera");

        int operacao = scanner.nextInt();

        switch (operacao) {

            //calculo perimetro
            case 1:
                System.out.println("Digite o raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                double perimetroCirculo = 2 * Math.PI * raioCirculo;
                System.out.println("Perímetro do círculo: " + perimetroCirculo);
                break;
            //calculo area
            case 2:
                System.out.println("Digite o raio do círculo:");
                double raioCirculo2 = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo2, 2);
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            //calculo volume
            case 3:
                System.out.println("Digite o raio da esfera:");
                double raioEsfera = scanner.nextDouble();
                double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioEsfera, 3);
                System.out.println("Volume da esfera: " + volumeEsfera);
                break;
            default:
                System.out.println("Código de operação inválido.");
        }

        scanner.close();
    }
}