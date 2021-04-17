import java.util.ArrayList;

public class Estoque {
    private ArrayList<ItemEstoque> itens;

    public Estoque() {
        itens = new ArrayList<ItemEstoque>();
    }

    public boolean cadastraProduto(Produto produto, int quantidade) {
        if (produto == null || quantidade < 0) {
            return false;
        }
        itens.add(new ItemEstoque(produto, quantidade));
        return true;
    }

    public int getQuantidadeDisponivel(int codigo) {
        for(ItemEstoque item: itens) {
            if (item.getProduto().getCodigo() == codigo) {
                return item.getQuantidade();
            }
        }
        return -1;
    }

    private ItemEstoque getItemPorCodigo(int codigo) {
        for (ItemEstoque item: itens) {
            if (item.getProduto().getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    public boolean baixaEstoque(int codigo, int quantidade) {
        ItemEstoque item = getItemPorCodigo(codigo);
        if (item == null) {
            System.out.println("Produto não encontrado no estoque.");
            return false;
        }
        
        return item.baixaEstoque(quantidade);
    }

    public boolean reposicaoEstoque(int codigo, int quantidade) {
        ItemEstoque item = getItemPorCodigo(codigo);
        if (item == null) {
            System.out.println("Produto não encontrado no estoque.");
            return false;
        }
        
        return item.reposicaoEstoque(quantidade);
    }

    public Produto getProduto(int codigo) {
        for (int i = 0; i < itens.size(); i++) 
        {
            Produto item = itens.get(i).getProduto();

            if (item.getCodigo() == codigo)
                return item;
        }
        return null;
    }

}
