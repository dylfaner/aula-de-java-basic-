package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
      Scanner carne =new Scanner (System.in);
    int []vetorn=new int [10];
    for (int i=0;i<vetorn.length;i++){
        System.out.println("informe o valor de n="+i);
    vetorn[i]=carne.nextInt();
    }
        System.out.println();
        int soma =0;
        for(int i=0;i<vetorn.length;i++){
            System.out.println(vetorn[i]+"");
        soma+=vetorn[i];
        }
        System.out.println("a soma é "+soma);
    }
    
}
