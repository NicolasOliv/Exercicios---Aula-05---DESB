package Exercicio5;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix (chave: " + chavePix + ") no valor de " + getValor());
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

}
