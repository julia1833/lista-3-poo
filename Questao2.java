abstract class FormaGeometrica {
    abstract double calcularArea();
}

class Circulo extends FormaGeometrica {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends FormaGeometrica {
    double largura;
    double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double calcularArea() {
        return largura * altura;
    }
}

class Triangulo extends FormaGeometrica {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Questao2 {
    public static void main(String[] args) {

        FormaGeometrica[] formas = {
            new Circulo(3),
            new Retangulo(4, 5),
            new Triangulo(6, 3)
        };

        for (int i = 0; i < formas.length; i++) {
            System.out.println("Área: " + formas[i].calcularArea());
        }
    }
}
