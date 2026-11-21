class SaldoInsuficienteException extends Exception {

    SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class Conta {
    String numero;
    double saldo;

    Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    void transferir(Conta destino, double valor)
            throws SaldoInsuficienteException {

        if (valor <= 0) {
            System.out.println("O valor deve ser maior que zero.");
            return;
        }

        if (destino == null) {
            System.out.println("Conta de destino inválida.");
            return;
        }

        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }

        saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência realizada com sucesso.");
    }
}

public class Questao10 {
    public static void main(String[] args) {

        Conta conta1 = new Conta("001", 500);
        Conta conta2 = new Conta("002", 200);

        try {
            conta1.transferir(conta2, 100);
            conta1.transferir(conta2, 1000);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo conta 1: R$ " + conta1.saldo);
        System.out.println("Saldo conta 2: R$ " + conta2.saldo);
    }
}
