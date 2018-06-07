package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio4 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int []vetorA =new int[15];
double []vetorB=new double [vetorA.length];
    System.out.println("informe o seu valor");
for( int i=0;i<vetorA.length;i++){
    System.out.println("informe  o valor da sua posição"+i);
vetorA[i]=sc.nextInt();
 vetorB[i]=Math.sqrt(vetorA[i]);
    }
    System.out.println("o valor de A ");
    for(int i=0;i<vetorA.length;i++){
    System.out.println(vetorA[i]+"");
    }
    System.out.println();
    DecimalFormat df= new DecimalFormat("###,###.##");
    System.out.println(" o valor de B ");
    for(int i=0;i<vetorB.length;i++){
    System.out.println(df.format(vetorB[i])+"");
     }
System.out.println();
     }   
}
