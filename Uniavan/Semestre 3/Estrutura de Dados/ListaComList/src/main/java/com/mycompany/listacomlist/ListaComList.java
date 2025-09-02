
package com.mycompany.listacomlist;

import java.util.List;
import java.util.LinkedList;


public class ListaComList {

    public static void main(String[] args) {
        
        List <String> lista;
        lista = new LinkedList <String>();
        
        lista.add("Carne");
        lista.add("Ovo");
        lista.add("Leite");
        
        lista.add( 2 , "Pao" );
        lista.add( 0 , "Suco");
        
        System.out.println("\nTamanho: " + lista.size() );
        
        if(lista.isEmpty() )
        {
            System.out.println("Lista esta vazia");
        }
        else
        {
            for( String str : lista )
            {
                System.out.print( str + " --> ");
            }
            System.out.print("null");
        }
        
        if( lista.contains( "Pao" ) )
        {
            System.out.println("\nElemento encontrado");
            System.out.println("Esta na posicao : " + lista.indexOf("Pao") );
        }  
        else
        {
            System.out.println("\nElemento nao encontrado");
        }
        
    }
}
