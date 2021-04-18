import java.util.ArrayList;

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
        System.out.println("Total: " + getSubTotal() + "\nDesconto: " + getDesconto() +
        "\nImposto: " + getImposto() + "\nValor da Venda: " + getTotal());
        
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
        double descontoItem = getSubTotal()*0.10;
    return descontoItem;
    }

    public double getSubTotal(){
        double subTotal = 0;
        for(int i = 0; i<itens.size();i++){
            subTotal = subTotal + itens.get(i).getValorItem();
        }
        
        return subTotal;
    }

    public double getTotal(){
        double total;
        if(getSubTotal()>250){
        total = getSubTotal()-getDesconto()+getImposto();
        } else total = getSubTotal()+getImposto();
        return total;
    }

    public double getImposto() {
        double impostoCobrado;
        if(getSubTotal()>250){
         impostoCobrado = (getSubTotal()-getDesconto())*IMPOSTO;
    } else impostoCobrado = getSubTotal()*IMPOSTO;
        return impostoCobrado;
    }


}
