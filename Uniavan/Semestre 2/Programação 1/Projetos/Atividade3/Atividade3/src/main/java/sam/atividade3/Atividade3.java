
package sam.atividade3;
import java.util.Scanner;

public class Atividade3 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        float notaAluno = 0;
        
        System.out.printf("Digite a nota final do aluno: ");
        notaAluno = scanner.nextFloat();
        
        if(notaAluno >= 7)
        {
            System.out.printf("===> Aluno Aprovado <===");
        }
        else if(notaAluno >= 6)
        {
            System.out.println("===> REC <===");
        }
        else
        {
            System.out.printf("===> Aluno Reprovado <===");
        }
    }
}
