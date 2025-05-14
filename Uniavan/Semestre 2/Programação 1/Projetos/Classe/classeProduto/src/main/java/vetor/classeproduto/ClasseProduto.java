

package vetor.classeproduto;
import java.util.Scanner;

class Produto{
    private String nomeProduto;
    private int codigoProduto;
    private double precoProduto;
    private int quantidadeProduto;


        public Produto(){
            nomeProduto = "Desconhecido";
            codigoProduto = 0000;
            precoProduto = 0.0;
            quantidadeProduto = 0000;
        }

        public Produto(String nome, int codigo, double preco, int quantidade){
            nomeProduto = nome;
            codigoProduto = codigo;
            precoProduto = preco;
            quantidadeProduto = quantidade;
        }

        public String getNome(){
            return this.nomeProduto;
        }

        public int getCodigo(){
            return this.codigoProduto;
        }

        public double getPreço(){
            return this.precoProduto;
        }

        public int getQuantidade(){
            return this.quantidadeProduto;
        }

        public void setNome( String nome ){
            this.nomeProduto = nome;
        }

        public void setCodigo( int codigo ){
            this.codigoProduto = codigo;
        }

        public void setPreco( double preco ){
            this.precoProduto = preco;
        }

        public void setQuantidade( int quantidade ){
            this.quantidadeProduto = quantidade;
        }
        
        public void exibirInformacoes(){
            System.out.println("Nome do Produto: " + this.nomeProduto);
            System.out.println("Codigo do Produto: " + this.codigoProduto);
            System.out.println("Preço do Produto: " + this.precoProduto);
            System.out.println("Quantidade do Produto: " + this.quantidadeProduto);
        }
        
        public void atualizarEstoque(int quantidade){
            this.quantidadeProduto = (this.quantidadeProduto + 10);
        }
    }

public class ClasseProduto {

        public static void main(String[] args) {

            Scanner entrada = new Scanner( System.in );
            
            System.out.println("Digite o Nome do Produto: ");
            String nome = entrada.next();
            
            entrada.nextLine();
            
            System.out.println("Digite o Codigo do Produto: ");
            int codigo = entrada.nextInt();
            
            System.out.println("Digite o Preço do Produto: ");
            double preco = entrada.nextDouble();
            
            System.out.println("Digite o Quantidade do Produto: ");
            int quantidade = entrada.nextInt();
            
            Produto a = new Produto(nome , codigo , preco , quantidade);
            
        }
}
