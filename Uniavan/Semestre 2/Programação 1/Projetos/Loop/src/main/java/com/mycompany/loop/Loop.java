
package com.mycompany.loop;
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int numDigitados = 0;
        int numPares = 0;
        
        float soma = 0;
                
        int numero = 0;
        
        while(true)
        {
            System.out.println("Digite um numero (Digite 0 para terminar): ");
            numero = scanner.nextInt();
            
            soma = soma+numero;
            
            if(numero == 0)
            {
                break;
            }
            
            if(numero % 2 == 0)
            {
                numPares++;
            }
            
            numDigitados++;
        }
        
        System.out.printf("\n\nForam digitados %d numeros", numDigitados);
        
        System.out.printf("\n\nA quantidade de numeros pares foram %d", numPares);
        
        System.out.printf("\n\nA quantidade de numeros impares foram %d", (numDigitados-numPares));
        
        System.out.printf("\n\nA media dos numeros são %.2f", (soma/numDigitados) );
        
    }
}
