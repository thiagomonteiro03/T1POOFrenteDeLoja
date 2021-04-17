import java.util.ArrayList;

public class CatalogoProdutos {

    private ArrayList<Produto> produtos;

    public CatalogoProdutos() 
    {
        produtos = new ArrayList<Produto>();
    }
    
    public boolean cadastraProduto(Produto p){
        if (p == null)
            return false;

        produtos.add(p);
        return true;
    }

    public Produto getProduto(int codigo) {
        for (int i = 0; i < produtos.size(); i++) 
        {
            Produto item = produtos.get(i);

            if (item.getCodigo() == codigo)
                return item;
        }
        return null;
    }

    @Override
    public String toString() {
        return "CatalogoProdutos [produtos=" + produtos + "]";
    }

    public ArrayList<Produto> getProdutosLista() {
        return produtos;
    }
    
}
