class LivroIndisponivelException extends Exception {

    LivroIndisponivelException(String mensagem) {
        super(mensagem);
    }
}

class Livro {
    String titulo;
    int exemplaresDisponiveis;

    Livro(String titulo, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    void emprestar() throws LivroIndisponivelException {

        if (exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException("Livro indisponível.");
        }

        exemplaresDisponiveis--;
        System.out.println("Empréstimo realizado: " + titulo);
    }
}

public class Questao9 {
    public static void main(String[] args) {

        Livro livro = new Livro("Java Básico", 2);

        for (int i = 0; i < 3; i++) {

            try {
                livro.emprestar();

            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
