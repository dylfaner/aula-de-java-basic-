package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class CursoemvideoLoianeGroiane3 {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int [] vetorA=new int[5];
 int [] vetorB=new int[vetorA.length];
 for(int i=0;i<vetorA.length;i++){
     System.out.println("informe o valor da posição:"+i);
 vetorA[i]=sc.nextInt();
 vetorB[i]=vetorA[i];
 }
System.err.println("vetor A=" );
    for(int i=0;i<vetorA.length;i++){
        System.out.println(vetorA[i]+"");
    }  
        System.out.print("vetor B=");
        for(int i=0;i<vetorB.length;i++){
            System.out.println(vetorB[i]+"");
        }
        System.out.println();
    }
}
