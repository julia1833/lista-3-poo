abstract class Funcionario {
    String nome;
    double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();
}

class FuncionarioCLT extends Funcionario {

    FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return salarioBase + (salarioBase * 0.10);
    }
}

class FuncionarioPJ extends Funcionario {

    FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return salarioBase - (salarioBase * 0.05);
    }
}

public class Questao1 {
    public static void main(String[] args) {

        FuncionarioCLT clt = new FuncionarioCLT("Ana", 2000);
        FuncionarioPJ pj = new FuncionarioPJ("Carlos", 3000);

        System.out.println("Salário CLT: R$ " + clt.calcularSalario());
        System.out.println("Salário PJ: R$ " + pj.calcularSalario());
    }
}
