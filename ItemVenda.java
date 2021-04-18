public class ItemVenda {
    
    private Produto produto;
    private double precoUnitarioCobrado;
    private int quantidade;
    private int numero;

    //foi adicionado receber numero no construtor
    public ItemVenda(Produto produto, double precoUnitarioCobrado, int quantidade, int numero) {
        this.produto = produto;
        this.precoUnitarioCobrado = precoUnitarioCobrado;
        this.quantidade = quantidade;
        this.numero = numero;
    }

    public double getValorItem(){
        double valor = precoUnitarioCobrado * quantidade;
        return valor;
    }

    public Produto getProduto() {
        return produto;
    }

    //foi adicionado getNumero do numero recebido no construtor
    public int getNumero() {
        return numero;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPrecoUnitarioCobrado() {
        return precoUnitarioCobrado;
    }

    public void setPrecoUnitarioCobrado(double precoUnitarioCobrado) {
        this.precoUnitarioCobrado = precoUnitarioCobrado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemVenda [numero=" + numero + ", precoUnitarioCobrado=" + precoUnitarioCobrado + ", produto=" + produto
                + ", quantidade=" + quantidade + "]";
    }
    
}
