package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner pao=new Scanner (System.in);
    int []vetora=new int  [10];
    for (int i=0;i<vetora.length;i++){
        System.out.println("informe o valor da posição:"+i);
    vetora[i]=pao.nextInt();
    }
   int soma=0;
    for(int i=0;i<vetora.length;i++){
 if(vetora[i] %5==0){
 soma+= vetora[i];
 }
    }
       System.out.println("o valor de A=");   
    for(int i=0;i<vetora.length;i++){
        System.out.println(vetora[i]+"");
    }  
        System.out.println();
        System.out.println("a soma é "+soma);  
    }
    
}
