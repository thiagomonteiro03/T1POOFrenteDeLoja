import java.util.ArrayList;

public class CatalogoProdutos {

    private ArrayList<Produto> produtos;
    
    public boolean cadastraProduto(Produto produto){
        if(produtos.contains(produto)){
            System.out.println("Seu produto ja foi cadastrado.");
            return false;
        }
        else produtos.add(produto);
        return true;
    }

    public Produto getProduto(int codigo){
        Produto produto = null;
        for(int i = 0; i<produtos.size();i++){
            if(produtos.get(i).getCodigo()==codigo) 
            produto = produtos.get(i);
        }

        return produto;
    }

    public ArrayList<Produto> getProdutosLista() {
        return produtos;
    }
    
}
