package cursoemvideo.loiane.groiane3;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner panela = new Scanner(System.in);

        int[] positivo = new int[10];

        for (int i = 0; i < positivo.length; i++) {
            System.out.println("informe os valores do posistivos" + (i + 1));
            positivo[i] = panela.nextInt();
            if (positivo[i] % 2 != 0) {
                break;
            }
        }
    }
}
