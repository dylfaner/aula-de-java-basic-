package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sofa=new Scanner (System.in);
double []vetorn1=new double [10];
double []vetorn2=new double [vetorn1.length];
        for(int i=0;i<vetorn1.length;i++){
            System.out.println("informe o valor de ="+1);
        vetorn1[i]=sofa.nextDouble();
        vetorn2[i]=vetorn1[i]%2;
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
    }
        }