package com.mycompany.listamercado;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaMercado {
    
    // Classe para representar um item da lista
    static class Produto {
        String nome;
        String unidade;
        double quantidade;
        
        Produto(String nome, String unidade, double quantidade) {
            this.nome = nome;
            this.unidade = unidade;
            this.quantidade = quantidade;
        }
    }

    public static void main(String[] args) {
        
        List<Produto> lista = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        char opcao = '0';
        
        while (opcao != '4') {
            System.out.println("\n[]=====[] Lista de Compras []=====[]");
            System.out.println("1. [Adicionar item]");
            System.out.println("2. [Remover item]");
            System.out.println("3. [Listar itens]");
            System.out.println("4. [Sair]");
            System.out.print("[Escolha uma opção]: ");
            opcao = entrada.next().charAt(0);
            
            switch (opcao) {
                
                case '1':
                    
                    entrada.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = entrada.nextLine();
                    System.out.print("Digite a unidade (ex: kg, un, etc.): ");
                    String unidade = entrada.nextLine();
                    System.out.print("Digite a quantidade: ");
                    double quantidade = entrada.nextDouble();
                    lista.add(new Produto(nome, unidade, quantidade));
                    System.out.println("Produto adicionado com sucesso.");
                    
                break;
                
                case '2':

                    entrada.nextLine();
                    
                    System.out.print("Digite o nome do produto para remover: ");
                    
                    String nomeRemover = entrada.nextLine();
                    boolean removido = false;
                    
                    for (Produto produto : lista) 
                    {
                        if (produto.nome.equalsIgnoreCase(nomeRemover)) 
                        {
                            lista.remove(produto);
                            System.out.println("Produto removido com sucesso.");
                            removido = true;
                            break;
                        }
                    }
                    
                    if (removido == false) 
                    {
                        System.out.println("Produto não encontrado.");
                    }
                    
                break;
                
                case '3':

                    System.out.println("\nItens na lista de compras:");
                    
                    if (lista.isEmpty()) 
                    {                       
                        System.out.println("A lista está vazia.");    
                    } 
                    else 
                    {
                        for (Produto produto : lista) 
                        {
                            System.out.println(" []===[] " + produto + " []===[] ");
                        }
                    }
                    
                break;
                
                case '4':

                    System.out.println("Saindo...");
                    
                break;
                
                default:
                    
                    System.out.println("Opção inválida. Tente novamente.");
                    
                break;
            }
        }
        
        entrada.close();
    }
}
