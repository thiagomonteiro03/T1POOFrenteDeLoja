public class App {
    public static void main(String args[]) {
        Produto p = new Produto(100, "iPhone 12", 8500);
        System.out.println(p);

        Estoque estoque = new Estoque();
        estoque.cadastraProduto(p, 10);
        System.out.println("Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
        estoque.baixaEstoque(100, 2);
        System.out.println("Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
        estoque.reposicaoEstoque(100, 1);
        System.out.println("Quantidade disponível: " + estoque.getQuantidadeDisponivel(100));
    }
}
