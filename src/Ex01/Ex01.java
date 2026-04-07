package Ex01;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        String resultado = (num % 10 == 0) ? "Divisível por 10"
                         : (num % 5 == 0) ? "Divisível por 5"
                         : (num % 2 == 0) ? "Divisível por 2"
                         : "Não é divisível por 10, 5 ou 2";

        System.out.println(resultado);


        sc.close();

	}

}
