
package vetor.atividadefuncao;
import java.util.Scanner;

public class AtividadeFuncao {

    public static float calcularImc(float peso, float altura)
    {
        float imc = 0;
        
        imc = peso/(altura*altura);
        
        return imc;
    }
    
    public static void classificacaoImc(float imc)
    {
        if(imc >= 40)
        {
            System.out.println("\n\nObesidade Grave");
        }
        else if(imc >= 30)
        {
            System.out.println("\nObesidade");
        }
        else if(imc >= 25)
        {
            System.out.println("\nSobrepeso");
        }
        else if(imc >= 18.5)
        {
            System.out.println("\nNormal");
        }
        else
        {
            System.out.println("\nMagreza");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        float peso = 0;
        float altura = 0;
        float imc = 0;
        
        System.out.println("\nQual o peso da pessoa? ");
        peso = entrada.nextFloat();
        
        System.out.println("\nQual a altura da pessoa? ");
        altura = entrada.nextFloat();
        
        imc = calcularImc(peso , altura);
        
        System.out.println("\nO imc da pessoa sera " + imc);
        
        classificacaoImc(imc);
    }
}
