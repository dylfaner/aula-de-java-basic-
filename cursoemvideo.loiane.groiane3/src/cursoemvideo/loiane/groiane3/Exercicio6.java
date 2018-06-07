package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
double []vetorn1=new double[10];
double []vetorn2=new double [vetorn1.length];
double[]vetorn3=new double[vetorn1.length];
        System.out.println("informe o valor de cada posição");
        for(int i=0;i<vetorn3.length;i++){
            System.out.println("informe o valor "+i);
    vetorn1[i]=sc.nextDouble();
        }
        System.out.println();
        System.out.println("informe  valor o posição do vetor n1");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
        }
        
        System.out.println();
        System.out.println("informe o valor da posição do vetor n2");
        for(int i=0;i<vetorn2.length;i++){
            System.out.println(vetorn2[i]+"");
            vetorn2[i]=sc.nextDouble();
        }
        System.out.println();
        DecimalFormat df=new DecimalFormat("###,###.##");
        for(int i=0;i<vetorn3.length;i++){
            vetorn3[i]=vetorn1[i]+ vetorn2[i];
            System.out.println(vetorn3[i]+"");
        }
        System.out.println();
         System.out.println("informe  valor o posição do vetor n1=");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println(vetorn1[i]+"");
    }
        System.out.println();
        System.out.println("informe  valor o posição do vetor n2=");
        for(int i=0;i<vetorn2.length;i++){
            System.out.println(vetorn2[i]+"");
        }
        System.out.println();
     System.out.println("informe  valor o posição do vetor n3");
        for(int i=0;i<vetorn3.length;i++){
            System.out.println(vetorn3[i]+"");
        }
}
}