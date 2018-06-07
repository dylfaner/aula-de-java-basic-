package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner foi=new Scanner (System.in);
        int []vetora=new int [10];
        for(int i=0;i<vetora.length;i++){
        System.out.println("informe o valor de cada posição:"+i);
    vetora[i]=foi.nextInt();
        }
    int soma=0;
    int impar=0;
        for(int i=0;i<vetora.length;i++){
    if(vetora[i] %2!=0){
    soma+=vetora[i];
    impar++;
    }
    }
        System.out.println();
        System.out.println("informe o valor de A=");
        for(int i=0;i<vetora.length;i++){
            System.out.println(vetora[i]+"");
        }
        System.out.println();
        System.out.println("a soma é "+soma);
        System.out.println("a média é "+soma/impar);
    }
    
}
