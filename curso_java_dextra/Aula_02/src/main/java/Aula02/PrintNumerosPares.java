package Aula02;

import java.util.Scanner;

public class PrintNumerosPares {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int number = scanner.nextInt();

		int qtdpar = 0;

		for (int i = 1; i <= number /*&& qtdpar < 10*/; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
				qtdpar++;
			}
			
			if (qtdpar == 10) {
				break;
				
			}
		
		}
	
		scanner.close();
	
	}
}
