import java.util.ArrayList;

public class Venda {
    
    private ArrayList<ItemVenda> itens;
    private int numero = 0;
    private final double IMPOSTO = 0.25;

    public Venda() {
        itens = new ArrayList<ItemVenda>();
    }


    public boolean insereItem(int codigo, int quantidade, Estoque estoque){

        Produto p = estoque.getProduto(codigo);
        if(estoque.getQuantidadeDisponivel(codigo)>=quantidade){

        ItemVenda item = new ItemVenda(p, p.getPrecoUnitario(), quantidade);
        itens.add(item);
        estoque.baixaEstoque(codigo, quantidade);

        return true;

        }
        return false;
    }

    public void imprimeRecibo(){
        
        System.out.println("Recibo");
    }

    public boolean removeItem(int numero){
        if(numero<itens.size()){
        itens.remove(numero);
        return true;
        }
        return false;
    }

    public boolean conclui(){
        return true;
    }

    public double getDesconto(){
        
        return 0.10;
    }

    public double getSubTotal(){
        
        return 2.0;
    }

    public double getTotal(){
        
        return 2.0;
    }

    public double getImposto() {
        return IMPOSTO;
    }


}
