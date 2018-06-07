package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio2 {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
int []vetorn1=new int [8];
int []vetorn2=new int [vetorn1.length];
    System.out.println("informe a posição:");
    for(int i=0;i<vetorn1.length;i++){
        System.out.println("informe o valor de :"+i);
    vetorn1[i]=sc.nextInt();
    vetorn2[i]=vetorn1[i]*2;
    }
    System.out.println("o vetor A = ");
    for(int i=1;i<vetorn1.length;i++){
    System.out.println("o valor do vetor A é "+vetorn1[i]);
    }
    System.out.println("o vetor B= ");    
for (int i=0;i<vetorn1.length;i++){
    System.out.println("o valor de B é "+vetorn1[i]);
      }
    System.out.println();
}
}


    
