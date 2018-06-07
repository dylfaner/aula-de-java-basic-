package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio9 {
public static void main(String[] args) {
Scanner popo=new Scanner (System.in);
      int []vetorn1=new int [10];
      int []vetorn2=new int [vetorn1.length];
      double []vetorn3=new double[vetorn1.length];
        System.out.println("informe o valor de cada posição do vetor:");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println("informe o valor de :"+i);
            vetorn1[i]=popo.nextInt();
            }
        System.out.println();
        System.out.println("informe o valor do vetor n1:");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
        }
        System.out.println();
        System.out.println("informe o valor do vetor n2:");
        for(int i=0;i<vetorn2.length;i++){
            vetorn2[i]=popo.nextInt();
            System.out.println(vetorn2[i]+"");
        }
        System.out.println();
        
       for(int i=0;i<vetorn3.length;i++){
           System.out.println(vetorn3[i]+"");
       vetorn3[i]=vetorn1[i] / vetorn2[i];
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
       DecimalFormat df=new DecimalFormat("###,###.##");
        System.out.println("o resultado dos vetores são:");
    for(int i=0;i<vetorn3.length;i++){
        System.out.println(df.format(vetorn3[i])+"");
    
          }
    }
    }
    

