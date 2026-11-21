abstract class Produto {
    String nome;
    double precoBase;

    Produto(String nome, double precoBase)
            throws PrecoInvalidoException {

        if (precoBase <= 0) {
            throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    abstract double calcularPrecoFinal();
}

class ProdutoFisico extends Produto {

    ProdutoFisico(String nome, double precoBase)
            throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    double calcularPrecoFinal() {
        return precoBase + 15;
    }
}

interface Descontavel {
    double aplicarDesconto(double percentual);
}

class ProdutoDigital extends Produto implements Descontavel {

    ProdutoDigital(String nome, double precoBase)
            throws PrecoInvalidoException {
        super(nome, precoBase);
    }

    double calcularPrecoFinal() {
        return precoBase;
    }

    public double aplicarDesconto(double percentual) {
        return precoBase - (precoBase * percentual / 100);
    }
}

class PrecoInvalidoException extends Exception {

    PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

public class Questao11 {
    public static void main(String[] args) {

        try {
            Produto[] produtos = {
                new ProdutoFisico("Notebook", 3000),
                new ProdutoDigital("Curso Java", 100)
            };

            for (int i = 0; i < produtos.length; i++) {
                System.out.println(
                    produtos[i].nome + ": R$ " +
                    produtos[i].calcularPrecoFinal()
                );
            }

            ProdutoDigital digital = (ProdutoDigital) produtos[1];

            System.out.println(
                "Preço com desconto: R$ " +
                digital.aplicarDesconto(10)
            );

            ProdutoFisico invalido = new ProdutoFisico("Mouse", 0);

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
