package Exercicio5;

public class Pagamento {

    private double valor;
    private String data;

    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento de " + valor + " em " + data);
    }

    public double calcularTaxa() {
        return 0;
    }

}
