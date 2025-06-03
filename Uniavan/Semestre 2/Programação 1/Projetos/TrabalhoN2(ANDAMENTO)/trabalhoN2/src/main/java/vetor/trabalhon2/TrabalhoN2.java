//NOMES DOS ALUNOS: Samuel Rozini Hirt, Thiago Hoff, Nicolas Santos Escandiel

package vetor.trabalhon2;

import Classes.*;
import java.util.Scanner;

public class TrabalhoN2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        Produto[] produtos = new Produto[10];
        
        char escolhaMenu = 'A';
        
        int falha = 2;
        
        int    tempCodigo;
        String tempNome;
        double tempPreco;
        int    tempQtd;
        
        
        while( escolhaMenu != 'f' && escolhaMenu != 'F' )
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
            System.out.printf("==[Para encerrar o sistema]\n");
            
            System.out.printf("\n\n\t[]==[]: ");
            
            escolhaMenu = entrada.next().charAt(0);
            
            switch (escolhaMenu)
            {
                case 'I':
                case 'i':
                    
                    while(true)
                    {
                        
                        System.out.println("\n[]==[Digite o codigo do produto]=[entre 1 e 999]: ");
                        tempCodigo = entrada.nextInt(); 
                        
                        if(tempCodigo >= 1 && tempCodigo <= 999)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\n[]==[O numero digitado foi invalido, tente novamente]\n");
                        }
                    }
                    
                    while(true)
                    {
                        entrada.nextLine();
                        
                        System.out.println("[]==[Digite o nome do produto]: ");
                        tempNome = entrada.next();
                        break;
                    }
                    
                    while(true)
                    {
                    
                        System.out.println("[]==[Digite o preco do produto]: ");
                        tempPreco = entrada.nextDouble();
                        
                        if(tempPreco > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\n[]==[O preco digitado foi invalido, tente novamente]\n");
                        }
                    }
                    
                    while(true)
                    {
                        
                        System.out.println("[]==[Digite a quantidade do produto]: ");
                        tempQtd = entrada.nextInt(); 
                        
                        if(tempQtd > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("\n[]==[A quantidade digitado foi invalida, tente novamente]\n");
                        }
                    }
             
                break;

                case 'M':
                case 'm':
                    
                    falha = 1;
                    
                    for(int i = 0; i < 10; i++)
                    {
                        if(produtos[i] != null)
                        {
                            produtos[i].exibirInfoProduto(); 
                            falha = 0;
                        }
                    }
                    
                    if(falha == 1)
                        System.out.println("\n[]===[Nenhum produto foi encontrado]");
                        
                break;
                    
                case 'Q':
                case 'q':
                    
                    System.out.println("\n[]==[Qual o codigo do produto que deseja verificar?]: ");
                    tempCodigo = entrada.nextInt();
                    falha = 1;
                    
                    //VERIFICAÇÃO
                    
                    for(int i = 0; i < 10; i++)
                    {
                        if(produtos[i] != null)
                        {
                            if(produtos[i].getCodigoProduto() == tempCodigo)
                            {
                                System.out.println("\n[]=[A quantidade atual do produto escolhido e]: " + produtos[i].getQtdProdutoEstoque() );
                                falha = 0;
                            }
                        }
                    }
                    
                    if(falha == 1)
                        System.out.println("\n[]===[O produto nao foi encontrado]");
                        
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
                
                default:
                    
                    System.out.println("\n\n\n[]==[ESCOLHA INVALIDA TENTE NOVAMENTE]\n\n");
                    
                break;
            }
                    
        //produtos[ i ] = new Produto( tempMatricula , tempNome , tempQtdeNotas , tempNotas );
        }
    }
}
