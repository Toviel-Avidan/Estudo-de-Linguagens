//Samuel Rozini Hirt
//Thiago Hoff
//Nicolas Santos Escandiel

package vetor.trabalhon1java;
import java.util.Scanner;

public class TrabalhoN1Java {
    
    public static float media(float nota1, float nota2)
    {
        float notaMedia = 0;
        
        notaMedia = (nota1+nota2)/2;
        
        return notaMedia;
    }
    
    public static float media(int peso1, int peso2, int peso3, float nota1, float nota2, float nota3)
    {
        float notaMedia = 0;
        
        notaMedia = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/10;
        
        return notaMedia;
    }

    public static void main(String[] args) 
    {
        int peso1 = 0;
        int peso2 = 0;
        int peso3 = 0;
        int somaPeso = 0;
        
        int quantidadeAlunos = 0;
        int numeroDeNotas = 0;
        int quantidadeNotas2 = 0;
        int quantidadeNotas3 = 0;        
        
        Scanner entrada = new Scanner(System.in);
        
        while(true)
        {
            System.out.printf("\n[]Insira o primeiro peso: ");
            peso1 = entrada.nextInt();
            
            System.out.printf("\n[]Insira o segundo peso: ");
            peso2 = entrada.nextInt();
            
            System.out.printf("\n[]Insira o terceiro peso: ");
            peso3 = entrada.nextInt();
            
            somaPeso = peso1 + peso2 + peso3;
            
            if(somaPeso != 10)
            {
                System.out.printf("\n[]A soma dos pesos nao resultou em 10");
            }
            else
            {
                break;
            }
        }
        
        System.out.printf("\n[]Digite a quantidade de alunos na turma: ");
        quantidadeAlunos = entrada.nextInt();
        entrada.nextLine();
        
        String[] nomesAlunos = new String[quantidadeAlunos];
        
        float[][] notasAlunos = new float[quantidadeAlunos][3];
        
        float[] mediasAlunos = new float[quantidadeAlunos];
        
        for(int i = 0; i < quantidadeAlunos; i++)
        {
            System.out.printf("\n[]Digite o nome do aluno numero %d: ", (i+1));
            nomesAlunos[i] = entrada.nextLine();
            
            
            System.out.printf("\n[]Digite a quantidade de notas que ele possui: ");
            numeroDeNotas = entrada.nextInt();
            
            if(numeroDeNotas == 2)
            {
                System.out.printf("\n[]Digite a primeira nota do aluno %d: ", (i+1));
               notasAlunos[i][0] = entrada.nextFloat();
               
               System.out.printf("\n[]Digite a segunda nota do aluno %d: ", (i+1));
               notasAlunos[i][1] = entrada.nextFloat();
               
               
               notasAlunos[i][2] = -1;
            }
            else if(numeroDeNotas == 3)
            {
                System.out.printf("\n[]Digite a primeira nota do aluno %d: ", (i+1));
               notasAlunos[i][0] = entrada.nextFloat();
               
               System.out.printf("\n[]Digite a segunda nota do aluno %d: ", (i+1));
               notasAlunos[i][1] = entrada.nextFloat();
               
               System.out.printf("\n[]Digite a terceira nota do aluno %d: ", (i+1));
               notasAlunos[i][2] = entrada.nextFloat();
               
            }
            entrada.nextLine();
            
            if(notasAlunos[i][2] == -1)
            {
                mediasAlunos[i] = media(notasAlunos[i][0], notasAlunos[i][1]);
            }
            else
            {
                mediasAlunos[i] = media(peso1, peso2, peso3, notasAlunos[i][0], notasAlunos[i][1], notasAlunos[i][2]);
            }
        }
     
     float maiorMedia = 0;
     
     for(int i = 0; i < quantidadeAlunos; i++)
     {
        if(maiorMedia < mediasAlunos[i])
        {
            maiorMedia = mediasAlunos[i];
        }
        else
        {
            continue;
        }
     }
     
     for(int i = 0; i < quantidadeAlunos; i++)
     {
         if(notasAlunos[i][2] == -1)
         {
          System.out.printf("\n\n[]Nome %s \n[]Nota 1 %f \n[]Nota 2 %f \n[]Media Final %f ",nomesAlunos[i], notasAlunos[i][0],notasAlunos[i][1], mediasAlunos[i]);   
         }
         else
         {
          System.out.printf("\n\n[]Nome %s \n[]Nota 1 %f \n[]Nota 2 %f \n[]Nota 3 %f \n[]Media Final %f ",nomesAlunos[i], notasAlunos[i][0],notasAlunos[i][1],notasAlunos[i][2], mediasAlunos[i]);
         }
     }
     
        System.out.printf("\n\n[]A maior media foi %f ", maiorMedia);
     
    }
}
