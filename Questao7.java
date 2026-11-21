import java.util.Scanner;
import java.util.InputMismatchException;

public class Questao7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = entrada.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = entrada.nextInt();

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");

        } finally {
            System.out.println("Operação encerrada.");
            entrada.close();
        }
    }
}
