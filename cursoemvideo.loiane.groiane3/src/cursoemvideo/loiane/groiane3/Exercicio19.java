package cursoemvideo.loiane.groiane3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner copo=new Scanner (System.in);
    double []nota1=new double [10];
    double []nota2=new double [nota1.length];
    double []resultado=new double[nota1.length];
    for(int i=0;i<nota1.length;i++){
        System.out.println("informe as nota1 dos alunos:"+(i+1));
     nota1[i]=copo.nextDouble();
        System.err.println("informe as nota2 dos alunos:"+(i+1));
  nota2[i]=copo.nextDouble();
    resultado[i]=(nota1[i] + nota2[i])/2;
    }
        System.out.println("nota1=:");
  for(int i=0;i<nota1.length;i++){
      System.out.println(nota1[i]+"");
  }
        System.out.println();
        
        System.out.println("nota 2=:");
        for(int i=0;i<nota2.length;i++){
            System.out.println(nota2[i]+"");
        }
        System.out.println();
        DecimalFormat df=new DecimalFormat("###,###.##");
        System.out.println("resultado=:");
        for(int i=0;i<resultado.length;i++){
            System.out.print(resultado[i]+"");
         
         
        if(resultado[i] >=7){
            System.out.println(resultado[i]+"esse aluno esta aprovado");
        }else {
            System.out.println(resultado[i]+"esse aluno esta resprovado");
        }
        }
        System.out.println("a nota 1 é :"+nota1);
        System.out.println("a nota 2 é :"+nota2);
        System.out.println("o resultado é :"+resultado);
    }
}
