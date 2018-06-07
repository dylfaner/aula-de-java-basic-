package cursoemvideo.loiane.groiane3;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner copo = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("informe o valor de " + (i + 1));
            vetorA[i] = copo.nextDouble();

        }
    }
}
