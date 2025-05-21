
package vetor.trabalhon1versaoobjeto;

import Classes.*;
import java.util.Scanner;

public class TrabalhoN1VersaoObjeto {
    
    public static void calculaMedia( Aluno[] vetAlunos , float[] pesos )
    {
        for( Aluno a : vetAlunos )
        {
            float[] notas;
            
            notas = a.getNotas();
            
            float media;
            
            if( a.getQtdeNotas() == 2)
            {
                media = ( notas[0] + notas[1] ) / 2;
            }
            else
            {
                media = ( notas[0]*pesos[0] +
                          notas[1]*pesos[1] +
                          notas[2]*pesos[2] ) / 10;
            }
            
            System.out.print( "\nAluno: " + a.getNome() + "\nMedia: " + media );
        }
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        // O idela é fazer a leitura no teclado
        float[] pesos = { 3.0f , 3.0f , 4.0f };
        
        System.out.print("Quantidade de alunos : ");
        int qtdeAlunos = entrada.nextInt();
        
        Aluno[] vetAlunos = new Aluno[ qtdeAlunos ];
        
        for( int i = 0 ; i < qtdeAlunos ; i++)
        {
            System.out.print("Digite o matricula do aluno: ");
            int tempMatricula = entrada.nextInt();
            
            entrada.nextLine(); // Limpa buffer do teclado
            
            System.out.print("Digite o nome do aluno: ");
            String tempNome = entrada.nextLine();
            
            System.out.print("Digite a quantidade de notas do aluno: ");
            int tempQtdeNotas = entrada.nextInt();
            
            float[] tempNotas = new float[ tempQtdeNotas ];
            
            for(int j = 0 ; j < tempQtdeNotas ; j++)
            {
                System.out.print("Digite a nota: ");
                tempNotas[ j ] = entrada.nextFloat();
            }
            
            vetAlunos[ i ] = new Aluno( tempMatricula , tempNome , tempQtdeNotas , tempNotas );
            
            System.out.println("\n*** Inclusao efetuada");
        }
        
        for(Aluno a : vetAlunos )
        {
            a.exibirDados();
        }
        
        calculaMedia( vetAlunos , pesos );
    }
}
