public class ItemEstoque {
    private Produto produto;
    private int quantidade;

    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean baixaEstoque(int quantidade) {
        if (this.quantidade < quantidade) {
            System.out.println("Quantidade de baixa inválida.");
            return false;
        }

        this.quantidade -= quantidade;
        return true;
    }

    public boolean reposicaoEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade de reposição inválida.");
            return false;
        }

        this.quantidade += quantidade;
        return true;
    }
    
}
