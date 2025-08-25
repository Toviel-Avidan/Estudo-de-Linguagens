/*
 * Lista Simplesmente Encadeada sem ordenacao
 *
 * Evandro Luis Viapiana - 17/08/2025
 */

package toviel.lse_sem_ordenacao;

import Classes.*;
import java.util.Scanner;

public class LSE_sem_ordenacao
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        // cria o descritor para a lista do tipo lista e iniciliza a listam de nome futebolSabado
        Lista futebolSabado = new Lista();
        
        char opcao;
        String valor;

        do {
            System.out.println("\n\nLISTA SIMPLESMENTE ENCADEADA SEM ORDENACAO");
            System.out.println("\nM E N U\n-------\n");
            System.out.println("F - Incluir uma informacao no fim da lista");
            System.out.println("C - Consultar uma informacao");
            System.out.println("R - Retirar uma informacao da lista");
            System.out.println("M - Mostra a lista na tela");
            System.out.println("X - Encerrar o programa");
            System.out.print("\nSua opcao : ");

            opcao = Character.toUpperCase(entrada.next().charAt(0));

            switch (opcao) {
                case 'F':
                    System.out.println("\nINCLUSAO NO FIM DA LISTA\n");

                    System.out.print("\nDigite o valor a ser incluido : ");

                    valor = entrada.next().toUpperCase();

                    if( futebolSabado.incluirFim( valor ) )                    
                        System.out.println("\n\nInclusao efetuada");
                    else
                        System.out.println("\n\n*** ERRO : Inclusao nao efetuada");

                    break;

                case 'C':
                    System.out.println("\nCONSULTA\n");
                    
                    System.out.println("\nDigite a informação para consulta: ");
                    
                    valor = entrada.next().toUpperCase();
                    
                    if(futebolSabado.consultarValor( valor ))
                    {
                        System.out.println("\nA informação foi encontrada");
                    }
                    else
                    {
                        System.out.println("\nA informação não foi encontrada");
                    }
                    
                    break;

                case 'R':
                    System.out.println("\nRETIRADA\n");
                    
                    System.out.println("\nDigite a informação para retirar: ");
                    
                    valor = entrada.next().toUpperCase();
                    
                    if(futebolSabado.retirarValor( valor ))
                    {
                        System.out.println("\nA informação foi retirada");
                    }
                    else
                    {
                        System.out.println("\nA informação não foi encontrada");
                    }
                    break;                  

                case 'M':
                    System.out.println("\nMOSTRA\n");

                    if ( futebolSabado.estaVazia() )
                        System.out.println("\n\nLista Vazia...");
                    else
                        futebolSabado.exibirLista();
                    
                    break;
            }
        } while (opcao != 'X');
    }
}