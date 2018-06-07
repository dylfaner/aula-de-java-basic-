package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner copo=new Scanner (System.in);
int []vetorn1=new int [10];
       for(int i=0;i<vetorn1.length;i++){
           System.out.println("informe o valor de n1 :"+i);
       vetorn1[i]=copo.nextInt();
       }
    int qtdpar=0;
       for(int i=0;i<vetorn1.length;i++){
    if(vetorn1[i] % 2 == 0 ){
   qtdpar++;
    }
    }
       System.out.println();
        System.out.println("informe o valor de n1:");
        for(int i=0;i<vetorn1.length;i++){
            System.out.print(vetorn1[i]+"");
        }
        System.out.println("quantidades de pares é "+qtdpar);
    }
   
}
