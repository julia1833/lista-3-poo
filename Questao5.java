interface Ligavel {
    void ligar();
    void desligar();
}

interface Conectavel {
    void conectarInternet();
}

class Televisao implements Ligavel {

    public void ligar() {
        System.out.println("Televisão ligada.");
    }

    public void desligar() {
        System.out.println("Televisão desligada.");
    }
}

class Roteador implements Ligavel, Conectavel {

    public void ligar() {
        System.out.println("Roteador ligado.");
    }

    public void desligar() {
        System.out.println("Roteador desligado.");
    }

    public void conectarInternet() {
        System.out.println("Roteador conectado à internet.");
    }
}

class Computador implements Ligavel, Conectavel {

    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }

    public void conectarInternet() {
        System.out.println("Computador conectado à internet.");
    }
}

public class Questao5 {
    public static void main(String[] args) {

        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        tv.ligar();
        tv.desligar();

        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        computador.ligar();
        computador.conectarInternet();
        computador.desligar();
    }
}

// Uma classe pode implementar várias interfaces porque elas permitem
// que a classe tenha diferentes funcionalidades ao mesmo tempo.
