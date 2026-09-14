package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new FilmeAcao("Missão Impossivel", 140, "14 anos", "Alto");
        Filme filme2 = new FilmeDocumentario("Planeta Terra", 90, "Livre", "Natureza");

        filme1.exibirDetalhes();
        System.out.println();
        filme2.exibirDetalhes();
}
}