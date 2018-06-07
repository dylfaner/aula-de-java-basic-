package cursoemvideo.loiane.groiane3;

import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner cafe = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[vetorA.length];
        for (int i=0;i< vetorA.length;i++) {
        System.out.println("informe o valor de :" + (i + 1));
        vetorA[i] = cafe.nextDouble();
    vetorB[i]=(vetorA[i]%2 ==0)? 1:0;
        }
        System.out.println("inforem o valor de A");
    for(int i=0;i< vetorA.length;i++){
        System.out.println(vetorA[i]+"");
    }
        System.out.println("informe o valor de B");
       for(int i=0;i <vetorB.length;i++){
        System.out.println(vetorB[i]+"");
    }
        System.out.println("");
    }
}
