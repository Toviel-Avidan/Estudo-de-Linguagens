//NOMES DOS ALUNOS: Samuel Rozini Hirt, Thiago Hoff, Nicolas Santos Escandiel

package vetor.trabalhon2;

import Classes.*;
import java.util.Scanner;

public class TrabalhoN2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        Produto[] produtos = new Produto[10];
        
        char escolha = 'A';
        
        while( escolha != 'f' && escolha != 'F' )
        {
            System.out.printf("\n[]=========================[MENU PRINCIPAL]=========================[]\n\n\n");
            
            System.out.printf("\n[]==[Precione 'I']==");
            System.out.printf("==[Para incluir um produto]\n");
            
            System.out.printf("\n[]==[Precione 'M']==");
            System.out.printf("==[Para monstrar todos os produtos]\n");
            
            System.out.printf("\n[]==[Precione 'Q']==");
            System.out.printf("==[Para mostrar a quantidade em estoque de um produto]\n");
            
            System.out.printf("\n[]==[Precione 'V']==");
            System.out.printf("==[Para vender um produto]\n");
            
            System.out.printf("\n[]==[Precione 'R']==");
            System.out.printf("==[Para reabastecer um produto]\n");
            
            System.out.printf("\n[]==[Precione 'D']==");
            System.out.printf("==[Para aplicar desconto a um produto]\n");
            
            System.out.printf("\n[]==[Precione 'F']==");
            System.out.printf("==[Para encerrar sistema]\n");
            
            System.out.printf("\n\t[]==[]: ");
            
            escolha = entrada.next().charAt(0);
            
            switch (escolha)
            {
                case 'I':
                case 'i':
                        
                break;

                case 'M':
                case 'm':
                        
                break;
                    
                case 'Q':
                case 'q':
                        
                break;
                    
                case 'V':
                case 'v':
                        
                break;
                    
                case 'R':
                case 'r':
                        
                break;
                    
                case 'D':
                case 'd':
                        
                break;
                    
                case 'F':
                case 'f':
                        
                break;
            }
                    
        //produtos[ i ] = new Produto( tempMatricula , tempNome , tempQtdeNotas , tempNotas );
        }
    }
}
