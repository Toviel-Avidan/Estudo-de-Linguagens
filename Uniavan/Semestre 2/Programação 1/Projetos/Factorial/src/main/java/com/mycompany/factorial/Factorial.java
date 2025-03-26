
package com.mycompany.factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) 
    {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = 0;
        int soma = 1;
        
        System.out.println("Digite um numero: ");
        n = entrada.nextInt();
                
        for(; n>0 ; n--)
        {
            soma = soma*n;
        }
                
        System.out.printf("O fatorial é igual a %d", soma);
    }
}
