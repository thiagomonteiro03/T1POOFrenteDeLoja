public class App {
    public static void main(String args[]) {

        //Validação de Produto
        System.out.println("-----------------------------------------");
        Produto iphone = new Produto(100, "iPhone 12", 8500);
        Produto android = new Produto(99, "Galaxy S20", 3000);
        System.out.println("Produto - " + iphone);
        System.out.println();


        //Validação de CatalogoProdutos
        System.out.println("-----------------------------------------");
        CatalogoProdutos catalogo = new CatalogoProdutos();
        catalogo.cadastraProduto(iphone);
        catalogo.cadastraProduto(android);
        System.out.println("Catalogo - Produtos cadastrados: " + catalogo);
        System.out.println("Catalogo - getProduto de android: " + catalogo.getProduto(99));
        System.out.println();
        
        //Validação de Estoque
        System.out.println("-----------------------------------------");
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

        //Validação de Venda e HistoricoVendas
        System.out.println("-----------------------------------------");
        Venda venda = new Venda();
        HistoricoVendas histVendas = new HistoricoVendas();
        System.out.println("item inserido: " + venda.insereItem(99, 8,estoque));
        System.out.println("item inserido: " + venda.insereItem(99, 1,estoque));
        System.out.println("item inserido: " + venda.insereItem(100, 1,estoque));
        System.out.println("item removido: " + venda.removeItem(2));
        System.out.println("item removido errado: " + venda.removeItem(100));
        venda.imprimeRecibo();
        venda.conclui();
        histVendas.cadastraVenda(venda);




    }
}
