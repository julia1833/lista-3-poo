class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class Questao8 {
    public static void main(String[] args) {

        try {
            Produto p1 = new Produto("Notebook", 3000, 5);
            System.out.println("Produto cadastrado: " + p1.nome);

            Produto p2 = new Produto("", 100, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Produto p3 = new Produto("Celular", 0, 3);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Produto p4 = new Produto("Tablet", 500, -1);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
