package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
         Scanner cofee=new Scanner (System.in);
int []vetorn1=new int [10];
int []vetorn2=new int [vetorn1.length];
double []vetorn3=new double[vetorn1.length];
        System.out.println("informe o valor do cada posição");
for(int i=0;i<vetorn1.length;i++){
    System.out.println("informe o valor de vetor de n1 :"+i);
    vetorn1[i]=cofee.nextInt();
}
     System.out.println();
        System.out.println("informe o valor do vetor n1");
    for(int i=0;i<vetorn1.length;i++){
        System.out.println(vetorn1[i]+"");
    }
        System.out.println("informe o valor do vetor n2 ");
        for(int i=0;i<vetorn2.length;i++){
  vetorn2[i]=cofee.nextInt();
        }
        System.out.println();
        for(int i=0;i<vetorn3.length;i++){
        System.out.println(vetorn3[i]+"");
            vetorn3[i]=vetorn1[i] * vetorn2[i];
        }
        System.out.println();
        System.out.println("informe o valor de n1");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
    }
        System.out.println();
        System.out.println("informe o valor de n2");
        for(int i=0;i<vetorn2.length;i++){
            System.out.println(vetorn2[i]+"");
        }
        System.out.println();
        System.out.println("a soma dos vetores é :");
        for(int i=0;i<vetorn3.length;i++){
            System.out.println(vetorn3[i]+"");
        }
    }
    }
    

