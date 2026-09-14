package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new ProdutoFisico("PF-01", "Notebook", 3500, 3.2);
        Produto p2 = new ProdutoDigital("PD-01", "E-book", 40);

        System.out.println("Frete físico: " + p1.calcularFrete());
        System.out.println("Frete digital: " + p2.calcularFrete());

        // Uma variável do tipo Produto (classe mãe) pode guardar um objeto
        // ProdutoFisico ou ProdutoDigital porque toda subclasse "é um" Produto
        // (herança). O tipo da variável só garante quais métodos podem ser
        // chamados; qual versão de calcularFrete() executa é decidido em tempo
        // de execução, de acordo com o objeto real referenciado — isso é o
        // polimorfismo permitindo tratar objetos diferentes de forma genérica.
    }
}
