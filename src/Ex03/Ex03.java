package Ex03;
import java.util.Scanner;


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

        double saldoMedio, credito;

        System.out.print("Digite o saldo médio: ");
        saldoMedio = leia.nextDouble();

        credito = (saldoMedio <= 500) ? 0 :
                  (saldoMedio <= 1000) ? saldoMedio * 0.30 :
                  (saldoMedio <= 3000) ? saldoMedio * 0.40 :
                                         saldoMedio * 0.50;

        System.out.println("Saldo médio: " + saldoMedio);
        System.out.println("Crédito: " + credito);

        leia.close();
		

	}

}
