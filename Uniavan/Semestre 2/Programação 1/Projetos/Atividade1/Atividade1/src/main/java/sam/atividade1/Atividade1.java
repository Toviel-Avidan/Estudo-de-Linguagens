
package sam.atividade1;
import java.util.Scanner;

public class Atividade1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int valorInt = 0;
        float valorFloat1 = 0;
        float valorFloat2 = 0;
        
        System.out.printf("Digite um numero inteiro: ");
        valorInt = scanner.nextInt();
        
        System.out.printf("O numero antecessor ao digitado sera: %d \n", (valorInt-1));
        System.out.printf("O numero sucessor ao digitado sera: %d \n", (valorInt+1));
        
        System.out.println("Agora digite dois numeros reais:\n\n");
        
        System.out.println("\nPrimeiro numero: ");
        valorFloat1 = scanner.nextFloat();
                
        System.out.println("\nSegundo numero: ");
        valorFloat2 = scanner.nextFloat();
        
        System.out.printf("\nA soma dos numeros sao: %.2f ", (valorFloat1 + valorFloat2));
        System.out.printf("\nA media dos numeros sao: %.2f ", ((valorFloat1 + valorFloat2)/2));
    }
}
