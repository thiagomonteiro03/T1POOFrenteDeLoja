import java.util.ArrayList;

public class Venda {
    
    private ArrayList<ItemVenda> itens;
    private int numero;
    private double imposto = 0.25;


    public boolean insereItem(int codigo, int quantidade){
        
        return true;
    }

    public void imprimeRecibo(){
        
        System.out.println("Recibo");
    }

    public boolean removeItem(int numero){
        return true;
    }

    public boolean conclui(){
        return true;
    }

    public double getDesconto(){
        
        return 2.0;
    }

    public double getSubTotal(){
        
        return 2.0;
    }

    public double getTotal(){
        
        return 2.0;
    }

    public double getImposto() {
        return imposto;
    }


}
