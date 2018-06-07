package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner cafe=new Scanner(System.in);
    int []elemento=new int [10];
int qtd=0;
int qtd1=0;
    for(int i=0;i<elemento.length;i++){
elemento[i]= (int)Math.round(Math.random()*1);

if(elemento[i]==0){
qtd++;
}else{
qtd1++;
}
}
double porc0=(qtd*100)/elemento.length;
   double porc1=(qtd1*100)/elemento.length;
           System.out.println();
        System.out.println("informe o valor do elemento");
    for(int i=0;i<elemento.length;i++){
        System.out.println(elemento[i]+"");
     
    }
        System.out.println();
        System.out.println("o percentual de 0:"+porc0);
        System.out.println("o percentual de 1:"+ qtd1);
}
}
