
package vetor.matrizatividade6;

public class MatrizAtividade6 {

    public static void main(String[] args) 
    {
        int [][] mat = {
            { 12 , 76 , 45 , 77 , 29 } ,
            { 33 , 98 , 54 , 12 , 23 } ,
            { 69 , 28 ,  8 , 16 , 89 } ,
            { 23 , 12 , 40 , 94 , 11 } };
        
        int[] vet = new int[5];
        
        int k = 0;
        
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<4; j++)
            {
                if(mat[j][i] > vet[k])
                {
                    vet[k] = mat[j][i];
                }
            }
            
            k++;
        }
        
        System.out.println("\n\nOs maiores valores são\n\n");
        
        for(int i = 0; i<5; i++)
        {
            System.out.printf("\t[] %d []\t", vet[i]);
        }
        
        //---------------------------------------------------------------
        int soma = 0;
        
        for(int i = 0; i<4; i++)
        {
            for(int j = i; j<(5-i); j++)
            {
                soma += mat[i][j];
            }
        }
        
        System.out.printf("\n\n\n\n[] %d []", soma);
    }
}
