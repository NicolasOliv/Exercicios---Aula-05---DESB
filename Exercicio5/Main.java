package Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new PagamentoPix(500, "01/09/2026", "chave@email.com"));
        pagamentos.add(new PagamentoCartao(1200, "01/09/2026", "1234-5678", 3));
        pagamentos.add(new PagamentoBoleto(800, "01/09/2026", "34191..."));

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("Taxa: " + p.calcularTaxa());
        }
    }
}
