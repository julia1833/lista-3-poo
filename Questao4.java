interface Pagamento {
    void processarPagamento(double valor);
}

class PagamentoPix implements Pagamento {

    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}

class PagamentoCartao implements Pagamento {

    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão: R$ " + valor);
    }
}

class PagamentoBoleto implements Pagamento {

    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Boleto: R$ " + valor);
    }
}

public class Questao4 {
    public static void main(String[] args) {

        Pagamento[] pagamentos = {
            new PagamentoPix(),
            new PagamentoCartao(),
            new PagamentoBoleto()
        };

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(150);
        }
    }
}
