import java.util.ArrayList;

public class HistoricoVendas {

    private ArrayList<Venda> vendas;


    public boolean cadastraVenda(Venda venda){
        if(vendas.contains(venda)){
            System.out.println("Sua venda ja foi registrada.");
        }
        else vendas.add(venda);
        
        return true;
    }

    public Venda getVenda(int numero){
        Venda venda = vendas.get(numero);

        return venda;
    }

    public ArrayList<Venda> getUltimasVendas(int n){
        ArrayList<Venda> lista = null;

        for(int i=vendas.size();i>=n;i--){
            lista.add(vendas.get(i));
        }

        return lista;

    }
    
}
