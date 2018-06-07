package cursoemvideo.loiane.groiane3;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner chocolate =new Scanner (System.in);
    int []idade=new int [10];
    for(int i=0;i<idade.length;i++){
        System.out.println("informe a idade de cada pessoa :"+(i+1));
    idade[i]=chocolate.nextInt();
    }
    int menor=idade[0];
    int indexMenor=0;
    int maior=idade[0];
    int indexMaior=0;
            for(int i=0;i<idade.length;i++){
    if(idade[i]>maior){
     maior =idade[i];
     indexMaior=i;
    }else if (idade[i]<menor){
    menor=idade[i];
    indexMenor=i;
    }
    }   
  System.out.println("vetor de idade = :");
  for(int i=0;i<idade.length;i++){
        System.out.println(idade[i]+"");
    }
        System.out.println("maior idade é :"+maior);
        System.out.println("o indice da idade maior :"+indexMaior);
        System.out.println("a menor idade é "+menor);
        System.out.println("o indice da menor :"+indexMenor);
        
    }
    
}
