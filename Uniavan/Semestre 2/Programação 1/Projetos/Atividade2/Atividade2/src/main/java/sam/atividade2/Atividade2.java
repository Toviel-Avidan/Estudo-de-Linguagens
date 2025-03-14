
package sam.atividade2;

import java.util.Scanner;

public class Atividade2 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int valorInt = 0;
        double valorDouble = 0;
        
        System.out.printf("\nDigite um valor inteiro: ");
        valorInt = scanner.nextInt();
        
        System.out.printf("\nDigite um valor decimal: ");
        valorDouble = scanner.nextDouble();
        
        System.out.printf("\nValor do inteiro: %d", valorInt);
        System.out.printf("\nValor do decimal: %.2f", valorDouble);
        
        valorDouble = valorInt;
        System.out.println("\n\nValor apos transferencia:\n");
        
        System.out.printf("\nValor do inteiro: %d", valorInt);
        System.out.printf("\nValor do decimal: %.2f", valorDouble);
    }
}
