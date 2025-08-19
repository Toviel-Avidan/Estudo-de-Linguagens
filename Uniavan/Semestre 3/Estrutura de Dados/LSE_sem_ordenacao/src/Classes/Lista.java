package Classes;

public class Lista {

    private Nodo inicio;    // Ponteiro para o início da lista
    private Nodo fim;       // Ponteiro para o fim da lista
    private int  tamanho;   // Quantidade de elementos na lista

    // ************************** Construtor: lista começa vazia
    public Lista() {
        this.inicio  = null;
        this.fim     = null;
        this.tamanho = 0;
    }

    // ************************** Método para incluir no fim da lista
    public boolean incluirFim( String valor ) {
        
        if ( valor == null ) return false;
        
        Nodo novo = new Nodo( valor );
        if ( novo == null ) return false;
        
        if ( this.inicio == null ) { // Lista vazia - será o único
            this.inicio = novo; 
            this.fim    = novo;
        } else {  // Lista não vazia - já tem informação no fim
            this.fim.elo = novo; // Quem era o último aponta para o novo que pass a ser o ultimo
            this.fim     = novo; // Atualiza o ponteiro fim
        }
        this.tamanho++;
        
        return true;
    }

    // ************************** Método para mostrar todos os elementos
    public void exibirLista() {
        Nodo it = this.inicio;
        while ( it != null) {
            System.out.print( it.info + " -> ");
            it = it.elo;
        }
        System.out.println("null");
    }

    // ************************** Getter do tamanho
    public int getTamanho() {
        return this.tamanho;
    }
    
    // ************************** Metodo para saber se esta vazia ou nao
    public boolean estaVazia()
    {
        if ( this.inicio == null )
            return true;
        else
            return false;
    }

    public boolean consultarValor( String valor ) 
    {
        
        Nodo it = this.inicio;
        while ( it != null) 
        {
            if(it.info.equals(valor))
            {
                return true;
            }
            else
            {
               it = it.elo; 
            }
        }
        
        return false;
    }
    
    public boolean retirarValor( String valor ) 
    {
        
        Nodo ant = this.inicio;
        
        Nodo it = this.inicio;
        
        while ( it != null) 
        {
            if(it.info.equals(valor))
            {
                
                if(it == this.inicio)
                {
                    it.info = null;
                    this.inicio = it.elo;
                }
                
                if(it.elo == null)
                {
                    it.info = null;
                    it.elo = null;
                
                    ant.elo = null;
                    
                }
                
                if(it.elo != null)
                {
                    it.info = null;
                    ant.elo = it.elo;
                }
                
                this.tamanho--;
                return true;
            }
            else
            {
                ant = it;
                it = it.elo; 
            }
        }
        
        return false;
    }
}
