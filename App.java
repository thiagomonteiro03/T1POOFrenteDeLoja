import java.util.ArrayList;

public class App {
    public static void main(String args[]) {

        //Validação de Produto
        System.out.println("------------------Validação de Produto-----------------------");
        Produto iphone = new Produto(100, "iPhone 12", 8500);
        Produto android = new Produto(99, "Galaxy S20", 3000);
        System.out.println("Produto - " + iphone);
        System.out.println();


        //Validação de CatalogoProdutos
        System.out.println("-----------------Validação de CatalogoProdutos------------------------");
        CatalogoProdutos catalogo = new CatalogoProdutos();
        catalogo.cadastraProduto(iphone);
        catalogo.cadastraProduto(android);
        System.out.println("Catalogo - Produtos cadastrados: " + catalogo);
        System.out.println("Catalogo - getProduto de android: " + catalogo.getProduto(99));
        System.out.println();
        
        //Validação de Estoque e ItemEstoque
        System.out.println("-------------------Validação de Estoque e ItemEstoque----------------------");
        Estoque estoque = new Estoque();
        estoque.cadastraProduto(iphone, 10);
        estoque.cadastraProduto(android, 8);
        System.out.println("Estoque - Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
        estoque.baixaEstoque(100, 2);
        System.out.println("Estoque - Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
        estoque.reposicaoEstoque(100, 1);
        System.out.println("Estoque - Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
        System.out.println("Estoque - Pegando produto android: " + estoque.getProduto(99));
        System.out.println();

        //Validação de Venda, ItemVendas e HistoricoVendas
        System.out.println("-------------------Validação de Venda, ItemVendas e HistoricoVendas----------------------");
        Venda venda = new Venda(1);
        Venda venda2 = new Venda(2);
        Venda venda3 = new Venda(3);
        HistoricoVendas histVendas = new HistoricoVendas();

        //Adicionando itens a venda.
        System.out.println("Item inserido na venda 1: " + venda.insereItem(99, 2,estoque));
        System.out.println("Item inserido na venda 1: " + venda.insereItem(100, 5,estoque));
        System.out.println("Item removido na venda 1: " + venda.removeItem(2));
        System.out.println();

        //Adicionando itens a venda2.
        System.out.println("Item inserido na venda 2: " + venda2.insereItem(99, 1,estoque));
        System.out.println();

        //Adicionando itens a venda3.
        System.out.println("Item inserido na venda 3: " + venda3.insereItem(99, 3,estoque));
        System.out.println();

        //ver com o professor a utilidade do metodo conclui.
        venda.conclui();
        venda2.conclui();
        venda3.conclui();

        //cadastrando vendas.
        histVendas.cadastraVenda(venda);
        histVendas.cadastraVenda(venda2);
        histVendas.cadastraVenda(venda3);

        //Imprimindo venda 2 do historico de vendas.
        System.out.println("---------------Imprimindo Venda 2 através do getVendas()--------------- ");
        histVendas.getVenda(1).imprimeRecibo();
        System.out.println();

        //Imprimindo ultimas 3 vendas realizadas.
        System.out.println("-----------Imprimindo recibo de ultimas 3 vendas realizadas------------ ");
        ArrayList<Venda>ultimasVendas = new ArrayList<Venda>();
        ultimasVendas = histVendas.getUltimasVendas(2);
        for(int i = 0; i<ultimasVendas.size();i++){
            ultimasVendas.get(i).imprimeRecibo();
            System.out.println();
        }




    }
}
