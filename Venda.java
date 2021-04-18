import java.util.ArrayList;
import java.util.Collection;

public class Venda {
    
    private ArrayList<ItemVenda> itens;
    private int numeroItem = 0;
    private int numeroRecibo = 0;
    private final double IMPOSTO = 0.25;

    public Venda() {
        itens = new ArrayList<ItemVenda>();
    }

    //foi adicionado receber estoque no insereItem
    public boolean insereItem(int codigo, int quantidade, Estoque estoque){

        Produto p = estoque.getProduto(codigo);
        if(estoque.getQuantidadeDisponivel(codigo)>=quantidade){

        numeroItem++;
        ItemVenda item = new ItemVenda(p, p.getPrecoUnitario(), quantidade, numeroItem);
        itens.add(item);
        estoque.baixaEstoque(codigo, quantidade);

        return true;

        }
        return false;
    }

    public void imprimeRecibo(){
        //adicionamos uma variavel para o recibo
        numeroRecibo++;
        System.out.println("Recibo de venda número: " + numeroRecibo);
        for(int i = 0; i<itens.size();i++){
            System.out.println(itens.get(i));
        }
        
    }

    @Override
    public String toString() {
        return "Venda [itens=" + itens + "]";
    }

    public boolean removeItem(int numero){
        for(int i = 0; i<itens.size();i++){
            if(itens.get(i).getNumero()==numero) itens.remove(i);
            return true;
        }
        return false;
    }

    public boolean conclui(){
        itens.clear();
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
