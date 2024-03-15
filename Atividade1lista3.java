import java.util.Scanner;

public class Atividade1lista3 {
    public static void main(String[] args) {


 /*1.Escreva um algoritmo que leia 3 números a partir do teclado. O algoritmo deve apresentar:
     a. O maior número.
     b. O menor número.
     c. A média aritmética dos três números*/

        /*variaveis*/
        double nm, nm2, nm3, maior, menor, media;
        Scanner scanner = new Scanner(System.in);

        /*Recebendo os números*/
        System.out.println("Por Favor insira a primeiro número");
        nm = scanner.nextDouble();

        System.out.println("Por favor insira a sua segundo número");
        nm2 = scanner.nextDouble();

        System.out.println("Por favor insira a terciro número");
        nm3 = scanner.nextDouble();

        /*Setando o maior número*/
        maior = Math.max(nm, Math.max(nm2, nm3));
        System.out.println("o maior número é:" + maior);
      
        /*Setando o menor número*/
        menor = Math.min(nm, Math.max(nm2, nm3));
        System.out.println("o menor número é:" + menor);

        /*Setando a media*/
        media = (nm + nm2 + nm3) / 3;
        System.out.println("a media entre os números é:" + media);

        scanner.close();

    }
}