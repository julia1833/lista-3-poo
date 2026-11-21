abstract class Veiculo {
    String modelo;
    double velocidadeAtual;

    Veiculo(String modelo, double velocidadeAtual) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    abstract void acelerar();
}

interface Eletrico {
    void carregarBateria();
}

class Carro extends Veiculo {

    Carro(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    void acelerar() {
        velocidadeAtual += 10;
        System.out.println(modelo + ": " + velocidadeAtual + " km/h");
    }
}

class CarroEletrico extends Veiculo implements Eletrico {

    CarroEletrico(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    void acelerar() {
        velocidadeAtual += 15;
        System.out.println(modelo + ": " + velocidadeAtual + " km/h");
    }

    public void carregarBateria() {
        System.out.println("Bateria carregando.");
    }
}

public class Questao6 {
    public static void main(String[] args) {

        Carro carro = new Carro("Carro comum", 20);
        CarroEletrico eletrico = new CarroEletrico("Carro elétrico", 20);

        carro.acelerar();

        eletrico.acelerar();
        eletrico.carregarBateria();
    }
}
