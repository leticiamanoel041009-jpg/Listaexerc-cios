package pctEx06;
import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Operação inválida!");
        }

        sc.close();
    }

}
