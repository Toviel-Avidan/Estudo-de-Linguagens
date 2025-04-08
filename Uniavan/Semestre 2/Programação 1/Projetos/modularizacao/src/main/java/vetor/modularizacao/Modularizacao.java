
package vetor.modularizacao;

public class Modularizacao 
{
    public static int somar(int... numeros)
    {
        int soma = 0;
        
        for (int num : numeros)
        {
            soma += num;
        }
        
        return soma;
    }
    
    public static int bemVindo( String nome , int idade )
    {
        int ano;
        
        System.out.println(nome + " tem " + idade + " anos\n");
        
        ano = 2025 - 88;
        
        return ano;
    }
    
    public static void main(String[] args) 
    {
        String valor;
        valor = "William";
        int anoNascimento;
        
        anoNascimento = bemVindo( valor , 88 );
        
        System.out.println("Nasceu em " + anoNascimento);
        
        System.out.println(somar( 2 , 6 , 8 , 10 ) );
        
        tchau();
        
    }
    
    public static void tchau()
    {
        System.out.println("Adeus ate logo");
    }
}
