package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner pipoca =new Scanner(System.in);
        double []vetork=new double[10];
for(int i =0;i<vetork.length;i++){
System.out.println("informe o valor de :"+(i+1));
   vetork[i]=pipoca.nextDouble();  
}
double idade=0;
 for(int i=0;i<vetork.length;i++){
        if(vetork[i]>idade){
        idade++;
        }
        }
        System.out.println("informe o valor de K:");
        for(int i=0;i<vetork.length;i++){
            System.out.println(vetork[i]+"");
        }
        System.out.println("idade maior que 35:"+idade);
    }
}