package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
int []vetorn1=new int [10];
int []vetorn2=new int [vetorn1.length];
double []vetorn3=new double [vetorn1.length];
        System.out.println("informe o valor de cada posição");
for(int i=0;i<vetorn1.length;i++){
    System.out.println("informe o valor de :"+i);
    vetorn1[i]=sc.nextInt();
}
        System.out.println();
        System.out.println("informe o valor do vetor n1");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
        }
        System.out.println();
        System.out.println("informe o valor da posição vetor n2 ");
        for(int i=0;i<vetorn2.length;i++){
        vetorn2[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<vetorn3.length;i++){
            System.out.println(vetorn3[i]+"");
        vetorn3[i]=vetorn1[i]- vetorn2[i];
        }
        System.out.println();
        System.out.println("informe o valor do vetor n1");
        for(int i=0;i< vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
        }
        System.out.println();
        System.out.println("informe o valor do vetor n2");
        for(int i=0;i<vetorn2.length;i++){
            System.out.println(vetorn2[i]+"");
        }
        System.out.println();
       System.out.println("a soma do resultado dos vetor é =");
    for(int i=0;i<vetorn3.length;i++){
        System.out.println(vetorn3[i]+"");
    }
    }
}
