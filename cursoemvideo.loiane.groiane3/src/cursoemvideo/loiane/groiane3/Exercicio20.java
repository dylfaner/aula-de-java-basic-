
package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sofa=new Scanner (System.in);
double  []dolar=new double[10];
double cotacao;
        System.out.println("informe a cotação do dollar");
     cotacao=sofa.nextDouble();
    for(int i=0;i<dolar.length;i++){
    dolar[i]=cotacao *(i+1);
    }
        System.out.println();
        System.out.println("informe o dollar");
    for(int i=0;i<dolar.length;i++){
        System.out.println(dolar[i]+"");
    }
        System.out.println();
    }
}

