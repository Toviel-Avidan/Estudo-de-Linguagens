
package vetor.arrayatividadesala4;

public class ArrayAtividadeSala4 {

    public static void main(String[] args) 
    {
        int[] valores = {1, 2, 3, 4, 5};
        int placeHolder = 0;
        
        for(int i = 0; i<5; i++)
        {
            System.out.printf("\nO valor na posicao %d sera %d", i, valores[i]);
        }
        
        placeHolder = valores[2];
        valores[2] = valores[3];
        valores[3] = placeHolder;
        
        System.out.printf("\n\nValor Atualizado\n\n");
        
        for(int i = 0; i<5; i++)
        {
            System.out.printf("\nO valor na posicao %d sera %d", i, valores[i]);
        }
    }
}
