import java.util.Scanner;

public class Atividade2lista3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lê o valor da compra e o valor pago
        System.out.println("Digite o valor da compra (em reais):");
        double valorCompra = entrada.nextDouble();

        System.out.println("Digite o valor pago (em reais):");
        double valorPago = entrada.nextDouble();

        // Calcula o troco
        double troco = valorPago - valorCompra;

        // Verificando se o valor pago é suficiente para a compra

        if (troco < 0) {
            System.out.println("Quantia insuficiente para realizar a compra.");
        } else {

            // Calculando o número de notas de cada valor
            int notas50 = (int) (troco / 50);
            troco %= 50;

            int notas20 = (int) (troco / 20);
            troco %= 20;

            int notas10 = (int) (troco / 10);
            troco %= 10;

            int notas5 = (int) (troco / 5);
            troco %= 5;

            int notas2 = (int) (troco / 2);
            troco %= 2;

            int notas1 = (int) troco;

            // resultado
            System.out.println("Troco a ser dado:");
            System.out.println(notas50 + " nota(s) de R$ 50,00");
            System.out.println(notas20 + " nota(s) de R$ 20,00");
            System.out.println(notas10 + " nota(s) de R$ 10,00");
            System.out.println(notas5 + " nota(s) de R$ 5,00");
            System.out.println(notas2 + " nota(s) de R$ 2,00");
            System.out.println(notas1 + " nota(s) de R$ 1,00");
        }

        
        entrada.close();
    }
}