
package com.mycompany.exemplolista;

import java.util.Queue;
import java.util.LinkedList;

public class ExemploLista {

    public static void main(String[] args) {
        
        // Criar a fila
        Queue <String> fila = new LinkedList<>(); // Para int é 'Integer'
        
        fila.add("Fusca"); // Adiciona
        fila.add("Opala");
        fila.add("Chevette");
        
        for(String str : fila)
        {
            System.out.print(" []" + str);
        }
        System.out.println("\n");
        
        System.out.println("Informacao na frente da fila : " + fila.peek());
        
        System.out.println("Informacao na frente da fila removida : " + fila.remove());
        
        System.out.println("Informacao na frente da fila : " + fila.peek());
        
        System.out.println("\n\nInformacao retirada da fila : " + fila.poll());

        
    }
}
