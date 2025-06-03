
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
        System.out.println("\n[]==========[Informações do Produto]==========[]\n");
        System.out.println("\nCodigo  : " + this.codigoProduto );
        System.out.println("\n[]=========================[]\n");
        System.out.println("\nNome    : " + this.nomeProduto );
        System.out.println("\n[]=========================[]\n");
        System.out.println("\nPreço   : " + this.precoProduto );
        System.out.println("\n[]=========================[]\n");
        System.out.println("\nQuantidade no Estoque: " + this.qtdProdutoEstoque );
        System.out.println("\n[]==================================================[]\n");
    }
    
    public void aplicarDesconto( int desconto )
    {
        desconto = (desconto/100);
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
