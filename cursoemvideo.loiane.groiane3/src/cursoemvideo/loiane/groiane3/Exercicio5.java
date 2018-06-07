package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
double []vetorn1=new double[10];
double []vetorn2= new double [vetorn1.length];
        System.out.println("informe o valor de cada posição ");
        for(int i=0;i<vetorn1.length;i++){
            System.out.println("informe o valor "+i);
        vetorn1[i]=sc.nextDouble();
        vetorn2[i]=vetorn1[i]*i;
        }
        System.out.println("o valor do vetor n1 é :");
    for(int i=0;i<vetorn1.length;i++){ 
        System.out.println(vetorn1[i]+"");
    }
        System.out.println();
        DecimalFormat df=new DecimalFormat("###,###.##");
        System.out.println("o valor de vetor n2 é :");
    for(int i=0;i<vetorn2.length;i++){
        System.out.println(df.format(vetorn2[i])+"");
        System.out.println();
    }
    }
}
