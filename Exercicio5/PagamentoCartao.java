package Exercicio5;

public class PagamentoCartao extends Pagamento {

    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String data, String numeroCartao, int parcelas) {
        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Cartão (" + numeroCartao + ") em " + parcelas + "x no valor de " + getValor());
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }

}
