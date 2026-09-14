package Exercicio5;

public class PagamentoBoleto extends Pagamento {

    private String codigoBarras;

    public PagamentoBoleto(double valor, String data, String codigoBarras) {
        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Boleto (" + codigoBarras + ") no valor de " + getValor());
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.01;
    }

}
