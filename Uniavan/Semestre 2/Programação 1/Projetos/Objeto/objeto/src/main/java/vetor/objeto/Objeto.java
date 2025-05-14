
package vetor.objeto;
import java.util.Scanner;

class Aluno{
    //atributos
    private int    matricula;
    private String nome;
    private double media;
    
    //métodos
    //construtor mesmo nome da classe
    public Aluno(){
        this.matricula = 0;
        this.nome = "Desconhecido";
        this.media = 0.0;
        
    }
    
    public Aluno(int mat, String nome, double med){
        this.matricula = mat;
        this.nome = nome;
        this.media = med;
    }
    
    //Gets pegar valor e devolver / ler
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getMedia(){
        return this.media;
    }
    
    //Sets muda o valor
    public void setMatricula( int matricula ){
        this.matricula = matricula;
    }
    
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public void setMedia( double media ){
        this.media = media;
    }
    
    private String statusAluno(){
        
        if(this.media >= 7)
        {
            return "APROVADO";
        }
        else if(this.media < 6)
        {
            return "REPROVADO";
        }
        else
        {
            return "RECUPERAÇÃO";
        }
    }
    
    //possivel acessar statusAluno
    public void mostraAluno(){
        System.out.println(this.matricula + "- - -" +
                           this.nome      + "- - -" +
                           this.media     + "- - -" +
                           this.statusAluno() );
    }
}


public class Objeto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner( System.in );
        
        Aluno a = new Aluno();
        
        /* não estando privado
        a.nome = "Evandro";
        a.media = 9.9;
        System.out.println("Matricula: " + a.matricula );
        */

        a.mostraAluno();
        
        Aluno b = new Aluno( 1428 , "Evandro" , 9.0 );
        
        b.mostraAluno();
        
        System.out.println("Digite a matricula: ");
        int matricula = entrada.nextInt();
        
        entrada.nextLine();
        
        System.out.println("Digite o nome: ");
        String nome = entrada.next();
        
        System.out.println("Digite a media: ");
        double media = entrada.nextDouble();
        
        Aluno c = new Aluno( matricula , nome , media);
        
        c.mostraAluno();
        
        //Get e Set--------------------------------------------
        
        System.out.println("\n\nA matricula do Aluno c: " + c.getMatricula());
        
        c.setNome("Pedro");
        
        System.out.println("\n\nO Nome do Aluno c: " + c.getNome());
        
    }
}
