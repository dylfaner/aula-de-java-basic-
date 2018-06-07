package cursoemvideo.loiane.groiane3;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner pipoca = new Scanner(System.in);
        double[] vetor = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("informe o valor de :" + (i + 1));
            vetor[i] = pipoca.nextDouble();
        }
        boolean palindromo = true;
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        System.out.println("informe o valor de A");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + "");
            if (palindromo) {
                System.out.println("palindromo");
            } else {
                System.out.println("não é palindromo");
            }
        }

    }
}
