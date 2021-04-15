public class ItemVenda {
    
    private Produto produto;
    private double precoUnitarioCobrado;
    private int quantidade;
    
    public ItemVenda(Produto produto, double precoUnitarioCobrado, int quantidade) {
        this.produto = produto;
        this.precoUnitarioCobrado = precoUnitarioCobrado;
        this.quantidade = quantidade;
    }

    public double getValorItem(){
        double valor = precoUnitarioCobrado * quantidade;
        return valor;
    }

    public Produto getProduto() {
        return produto;
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
    
}
