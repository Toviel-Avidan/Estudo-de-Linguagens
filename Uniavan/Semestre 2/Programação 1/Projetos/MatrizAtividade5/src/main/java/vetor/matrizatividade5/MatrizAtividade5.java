
package vetor.matrizatividade5;
import java.util.Scanner;

public class MatrizAtividade5 {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.printf("\n\nDigite o valor que estara na linha %d e coluna %d: ", (i+1), (j+1));
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.printf("\n\nOs valores digitados foram\n\n");
        
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.printf("\n\nO valor digitado na linha %d e coluna %d foi", (i+1), (j+1));
                System.out.printf("\n[] %d []\n", matriz[i][j]);
            }
        }
        
    }
}
