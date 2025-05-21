
package Classes;

public class Aluno {
    // Atributos da classe
    private int     matricula;
    private String  nome;
    private int     qtdeNotas; // Opcional
    private float[] notas;
    
    // Metodo construtor
    public Aluno( int matricula , String nome , int qtdeNotas , float[] notas)
    {
        this.matricula = matricula;
        this.nome      = nome;
        this.qtdeNotas = qtdeNotas;
        this.notas     = notas;
    }
    
    // Gets
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getQtdeNotas()
    {
        return this.qtdeNotas;
    }
    
    public float[] getNotas()
    {
        return this.notas;
    }
    
    // Sets
    public void setMatricula( int matricula )
    {
        this.matricula = matricula;
    }
    
    public void setNome( String nome )
    {
        this.nome = nome;
    }
    
    public void setQtdeNotas( int qtdeNotas )
    {
        this.qtdeNotas = qtdeNotas;
    }
    
    public void setNotas( float[] notas )
    {
        this.notas = notas;
    }
    
    public void exibirDados()
    {
        System.out.println("\n--------------------\n");
        System.out.println("Matricula               : " + this.matricula );
        System.out.println("Nome                    : " + this.nome );
        System.out.println("Quantidade de Notas     : " + this.qtdeNotas );
        System.out.print("Notas                   : ");
        for( float n : notas )
        {
            System.out.print( n + "  ");
        }
        System.out.println("\n\n--------------------\n");
    }
}
