//NOME: Samuel Rozini Hirt

package com.mycompany.samuelrh;

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class SamuelRH {
    
    record registro(int minuto, int tipo, int quantidade){
    }

    public static void main(String[] args) {
        
        Random random = new Random();
        int tipo = 0;
        int quantidade = 0;
        
        List <registro> eventos = new LinkedList<>();
        
        //eventos.add(new registro(1, 2, 4));
        
        for(int minuto = 1 ; minuto <= 200 ; minuto++)
        {

            tipo = random.nextInt(3);
            
            if(tipo == 0)
            {
                quantidade = 0;
            }
            else
            {
                quantidade = random.nextInt(10) + 1;
            }
            
            eventos.add(new registro(minuto, tipo, quantidade));

        }
        
        for(registro item : eventos){
            System.out.println(" [Minuto]: " + item.minuto +
                               " [Tipo]: " + item.tipo +
                               " [Quantidade]: " + item.quantidade);
        }
        
    }
}
