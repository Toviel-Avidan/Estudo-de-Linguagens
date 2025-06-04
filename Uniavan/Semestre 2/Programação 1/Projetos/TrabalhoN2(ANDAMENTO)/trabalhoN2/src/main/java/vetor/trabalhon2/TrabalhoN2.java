//NOMES DOS ALUNOS: Samuel Rozini Hirt, Thiago Hoff, Nicolas Santos Escandiel

package vetor.trabalhon2;

import Classes.*;
import java.util.Scanner;


public class TrabalhoN2 {
    
    public class Constantes {
    public static final int PROD_MAX = 3;
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        Produto[] produtos = new Produto[Constantes.PROD_MAX];
        
        char escolhaMenu = 'A';
        
        int falha = 2;
        
        int    tempCodigo;
        String tempNome;
        double tempPreco;
        int    tempQtd;
        
        int temp = 0;
        int existe = 0;
        
        
        while( escolhaMenu != 'f' && escolhaMenu != 'F' )
        {
            System.out.printf("\n\n\n[]=========================[MENU PRINCIPAL]=========================[]\n\n\n");
            
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
                        
                        existe = 0;
                        
                        while(true)
                        {
                            System.out.printf("\n[]==[Digite o codigo do produto]=[entre 1 e 999]: ");
                            tempCodigo = entrada.nextInt(); 
                        
                            if(tempCodigo >= 1 && tempCodigo <= 999)
                            {
                                break;
                            }
                            else
                            {
                                System.out.printf("\n[]==[O numero digitado foi invalido, tente novamente]\n");
                            }
                        }
                        
                        for(int i = 0; i < Constantes.PROD_MAX; i++)
                        {
                            if(produtos[i] != null)
                            {
                                if(produtos[i].getCodigoProduto() == tempCodigo)
                                {
                                    System.out.printf("\n[]==[O codigo digitado ja existe digite novamente]");
                                    existe = 1;
                                    break;
                                }
                            }
                        }
                        
                        if(existe == 0)
                            break;
                    }
                    
                    entrada.nextLine();
                        
                    System.out.printf("\n[]==[Digite o nome do produto]: ");
                    tempNome = entrada.nextLine();
                    
                    while(true)
                    {
                    
                        System.out.printf("\n[]==[Digite o preco do produto]: ");
                        tempPreco = entrada.nextDouble();
                        
                        if(tempPreco > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.printf("\n[]==[O preco digitado foi invalido, tente novamente]\n");
                        }
                    }
                    
                    while(true)
                    {
                        
                        System.out.printf("\n[]==[Digite a quantidade do produto]: ");
                        tempQtd = entrada.nextInt(); 
                        
                        if(tempQtd > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.printf("\n[]==[A quantidade digitado foi invalida, tente novamente]\n");
                        }
                    }
                    
                    falha = 1;
                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] == null)
                        {
                            produtos[i] = new Produto(tempCodigo, tempNome, tempPreco, tempQtd );
                            falha = 0;
                        }
                    }
                    
                    if(falha == 1)
                    {
                        System.out.printf("\n[]==[Nao existe espaço para novos produtos]");
                    }
             
                break;

                case 'M':
                case 'm':
                    
                    falha = 1;
                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] != null)
                        {
                            produtos[i].exibirInfoProduto(); 
                            falha = 0;
                        }
                    }
                    
                    if(falha == 1)
                        System.out.printf("\n[]===[Nenhum produto foi encontrado]");
                        
                break;
                    
                case 'Q':
                case 'q':
                    
                    System.out.printf("\n[]==[Qual o codigo do produto que deseja verificar?]: ");
                    tempCodigo = entrada.nextInt();
                    
                    falha = 1;

                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] != null)
                        {
                            if(produtos[i].getCodigoProduto() == tempCodigo)
                            {
                                System.out.printf("\n[]=[A quantidade atual do produto escolhido e]: " + produtos[i].getQtdProdutoEstoque() );
                                falha = 0;
                                break;
                            }
                        }
                    }
                    
                    if(falha == 1)
                        System.out.printf("\n[]===[O produto nao foi encontrado]");
                        
                break;
                    
                case 'V':
                case 'v':
                    
                    System.out.printf("\n[]==[Qual o codigo do produto que deseja vender?]: ");
                    tempCodigo = entrada.nextInt();
                    
                    falha = 1;
                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] != null)
                        {
                            if(produtos[i].getCodigoProduto() == tempCodigo)
                            {
                                
                                while(true)
                                {
                                    System.out.printf("\n[]==[Produto encontrado, quanto deseja vender?]: ");
                                    temp = entrada.nextInt();
                                    
                                    if(temp <= 0)
                                    {
                                        System.out.printf("\n[]==[Valor invalido digite novamente]");
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                
                                if(produtos[i].getQtdProdutoEstoque() >= temp)
                                {
                                    produtos[i].venderProduto(temp);
                                    System.out.printf("\n[]==[O produto foi vendido]");
                                    falha = 0;
                                    break;
                                }
                                else
                                {
                                    System.out.printf("\n[]==[O produto esta sem estoque para a compra]");
                                    falha = 0;
                                    break;
                                }
                            }
                        }
                    }
                    
                    if(falha == 1)
                        System.out.printf("\n[]===[O produto nao foi encontrado]");
                        
                break;
                    
                case 'R':
                case 'r':
                    
                    System.out.printf("\n[]==[Qual o codigo do produto que deseja reabastecer?]: ");
                    tempCodigo = entrada.nextInt();
                    
                    falha = 1;
                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] != null)
                        {
                            if(produtos[i].getCodigoProduto() == tempCodigo)
                            {
                                
                                while(true)
                                {
                                    System.out.printf("\n[]==[Produto encontrado, quanto deseja reabastecer?]: ");
                                    temp = entrada.nextInt();
                                    
                                    if(temp <= 0)
                                    {
                                        System.out.printf("\n[]==[Valor invalido digite novamente]");
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                
                                produtos[i].reabastecerProduto(temp);
                                System.out.printf("\n[]==[O produto foi reabastecido]");
                                falha = 0;
                                break;
                            }
                        }
                    }
                    
                    if(falha == 1)
                        System.out.printf("\n[]===[O produto nao foi encontrado]");
                        
                break;
                    
                case 'D':
                case 'd':
                    
                    System.out.printf("\n[]==[Qual o codigo do produto que deseja aplicar o desconto?]: ");
                    tempCodigo = entrada.nextInt();
                    
                    falha = 1;
                    
                    for(int i = 0; i < Constantes.PROD_MAX; i++)
                    {
                        if(produtos[i] != null)
                        {
                            if(produtos[i].getCodigoProduto() == tempCodigo)
                            {
                                
                                while(true)
                                {
                                    System.out.printf("\n[]==[Produto encontrado, quanto desconto deseja aplicar?]=[entre 1 e 90 porcento]: ");
                                    temp = entrada.nextInt();
                                    
                                    if(temp >= 1 && temp <= 90)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.printf("\n[]==[Valor invalido digite novamente]");
                                    }
                                }
                                
                                produtos[i].aplicarDesconto(temp);
                                System.out.printf("\n[]==[O desconto foi aplicado]");
                                falha = 0;
                                break;
                            }
                        }
                    }
                    
                    if(falha == 1)
                        System.out.printf("\n[]===[O produto nao foi encontrado]");
                        
                break;
                    
                case 'F':
                case 'f':
                        
                break;
                
                default:
                    
                    System.out.printf("\n\n\n[]==[ESCOLHA INVALIDA TENTE NOVAMENTE]\n\n");
                    
                break;
            }
        }
    }
}
