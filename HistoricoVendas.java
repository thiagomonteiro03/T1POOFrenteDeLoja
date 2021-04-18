import java.util.ArrayList;

public class HistoricoVendas {

    private ArrayList<Venda> vendas;

    public HistoricoVendas() {
        vendas = new ArrayList<Venda>();
    }

    public boolean cadastraVenda(Venda venda){
        if(venda!=null){
            vendas.add(venda);
        }
        else vendas.add(venda);
        
        return true;
    }

    public Venda getVenda(int numero){
        Venda venda = null;
        for(int i = 0; i<vendas.size();i++){
            if(vendas.get(i).getNumeroVenda()==numero) venda = vendas.get(i);
        }

        return venda;
    }

    public ArrayList<Venda> getUltimasVendas(int n){
        ArrayList<Venda> lista = new ArrayList<Venda>();

        for(int i=vendas.size();i>=n;i--){
            lista.add(vendas.get(i));
        }

        return lista;

    }
    
}
