//NOMES DOS ALUNOS: Samuel Rozini Hirt, Thiago Hoff, Nicolas Santos Escandiel

package Classes;

public class Produto {
    // Atributos da classe
    private int    codigoProduto;
    private String nomeProduto;
    private double precoProduto;
    private int    qtdProdutoEstoque;
    
    
    // Metodo construtor
    public Produto( int codigoProduto, String nomeProduto, double precoProduto, int qtdProdutoEstoque )
    {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdProdutoEstoque = qtdProdutoEstoque;
    }
    
    // Gets
    public int getCodigoProduto()
    {
        return this.codigoProduto;
    }
    
    public String getNomeProduto()
    {
        return this.nomeProduto;
    }
    
    public double getPrecoProduto()
    {
        return this.precoProduto;
    }
    
    public int getQtdProdutoEstoque()
    {
        return this.qtdProdutoEstoque;
    }
    
    // Sets
    public void setCodigoProduto( int codigoProduto )
    {
        this.codigoProduto = codigoProduto;
    }
    
    public void setNomeProduto( String nomeProduto )
    {
        this.nomeProduto = nomeProduto;
    }
    
    public void setPrecoProduto( double precoProduto )
    {
        this.precoProduto = precoProduto;
    }
    
    public void setQtdProdutoEstoque( int qtdProdutoEstoque )
    {
        this.qtdProdutoEstoque = qtdProdutoEstoque;
    }
    
    public void exibirInfoProduto()
    {
        System.out.printf("\n[]==========[Informacoes do Produto]==========[]\n");
        System.out.printf("\n[]==[Codigo  ]: " + this.codigoProduto );
        System.out.printf("\n");
        System.out.printf("\n[]==[Nome    ]: " + this.nomeProduto );
        System.out.printf("\n");
        System.out.printf("\n[]==[Preco   ]: " + this.precoProduto );
        System.out.printf("\n");
        System.out.printf("\n[]==[Quantidade no Estoque]: " + this.qtdProdutoEstoque );
        System.out.printf("\n\n[]==================================================[]\n");
    }
    
    public void aplicarDesconto( int desconto )
    {
        desconto = (1 - desconto/100);
        this.precoProduto = (this.precoProduto*desconto);
    }
    
    public void venderProduto( int venda )
    {
        this.qtdProdutoEstoque = (this.qtdProdutoEstoque-venda);
    }
    
    public void reabastecerProduto( int reabastecimento )
    {
        this.qtdProdutoEstoque = (this.qtdProdutoEstoque+reabastecimento);
    }
}
