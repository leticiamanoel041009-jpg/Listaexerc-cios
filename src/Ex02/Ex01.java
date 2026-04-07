package Ex02;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite seu peso (kg): ");
	        double peso = sc.nextDouble();

	        System.out.print("Digite sua altura (m): ");
	        double altura = sc.nextDouble();

	        double imc = peso / (altura * altura);

	        System.out.println("Seu IMC é: " + imc);

	        if (imc < 18.5) {
	            System.out.println("Abaixo do peso");
	        } else if (imc >= 18.5 && imc < 25) {
	            System.out.println("Peso normal");
	        } else if (imc >= 25 && imc < 30) {
	            System.out.println("Sobrepeso");
	        } else if (imc >= 30 && imc < 40) {
	            System.out.println("Obesidade");
	        } else {
	            System.out.println("Obesidade mórbida");
	        }

	        sc.close();
	    }

	}

