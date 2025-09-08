
package com.mycompany.exemplopilha;

import java.util.Stack;

public class ExemploPilha {

    public static void main(String[] args) {
        
        //criacao
        Stack <String> pilha = new Stack<>();
        
        String aux;
        pilha.push("Evandro"); // Inserir na pilha
        pilha.push("Pedro");
        pilha.push("Ana");
        
        if(pilha.empty() ) // Retorna verdade se a pilha esta vazia
        { 
            System.out.println("\n\nPilha vazia\n");
        }
        else
        {
            System.out.println("Informacao no topo : " + pilha.peek() ); // Informacao no topo da pilha
            System.out.println("\n");
        }
        
        if(pilha.empty() )
        { 
            System.out.println("\n\nPilha vazia\n");
        }
        else
        {
            for(String str : pilha)
            {
                System.out.println(str);
            }
            
            System.out.println("\n----------\n");
            
            for(int i = pilha.size()-1 ; i >= 0 ; i--)
            {
                System.out.println(pilha.get(i));
            }
        }
        
        if(pilha.empty() )
        { 
            System.out.println("\n\nPilha vazia\n");
        }
        else
        {
            aux = pilha.peek();
            
            System.out.println("\nInformacao no topo : " + pilha.pop()); // Retira informacao do topo
            System.out.println("\nInformacao retirada : " + aux);
            System.out.println("\n");
            
            for(String str : pilha)
            {
                System.out.println(str);
            }
            
        }
    }
}
