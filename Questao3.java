abstract class ContaBancaria {
    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado.");
    }

    abstract void sacar(double valor);
}

class ContaCorrente extends ContaBancaria {

    ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    void sacar(double valor) {
        double total = valor + 2;

        if (valor > 0 && saldo >= total) {
            saldo -= total;
            System.out.println("Saque realizado com taxa de R$ 2,00.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}

class ContaPoupanca extends ContaBancaria {

    ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}

public class Questao3 {
    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente("Ana", 500);
        ContaPoupanca poupanca = new ContaPoupanca("Carlos", 500);

        corrente.depositar(100);
        corrente.sacar(50);

        poupanca.depositar(100);
        poupanca.sacar(50);

        System.out.println("Saldo corrente: R$ " + corrente.saldo);
        System.out.println("Saldo poupança: R$ " + poupanca.saldo);
    }
}
