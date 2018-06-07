package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sofa=new Scanner(System.in); 
    int []vetora=new int [10];
    for(int i=0;i<vetora.length;i++){
        System.out.println("informe o valor da posição:"+i);
    vetora[i]=sofa.nextInt();
    }
    double impar=0;
    for(int i=0;i<vetora.length;i++){
    if(vetora[i]%2!=0){
    impar++;
    }
    }
    double par=vetora.length-impar;
    double percpar=(par*100)/vetora.length;
    double percimpar=100-percpar;
        System.out.println("informe o valor de A:");
    for(int i=0;i<vetora.length;i++){
        System.out.println(vetora[i]+"");
    }
        System.out.println("percentual:"+percpar+ "números par são:");
        System.out.println("percentual:"+percimpar+ "números impar são:");
    }
}


