package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sofa=new Scanner (System.in);
double []vetorp=new double[10];
for(int i=0;i<vetorp.length;i++){
    System.out.println("informe o valor de "+i);
vetorp[i]=sofa.nextDouble();
}
double soma=0;
double maior15=0;
double menor15=0;
double media=0;
double igual15=0;
for(int i=0;i<vetorp.length;i++){
    if(vetorp[i]==15){
        igual15++;
        }else if(vetorp[i]<maior15){
maior15+=vetorp[i];
menor15+=vetorp[i];
        }else {
        maior15+=vetorp[i];
        media+=vetorp[i];
        soma+=vetorp[i];
        }
 }
        System.out.println("informe o valor de P");
    
    for(int i=0;i<vetorp.length;i++){
        System.out.println(vetorp[i]+"");
    }
     System.out.println("a soma é a media são:"+soma/media);
        System.out.println("maiores que 15 são :"+maior15);
        System.out.println("os menores que 15 são :"+menor15);
        System.out.println("o valores iguais há 15 são :"+igual15);    
    }
}
