package lacos_de_decisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		int idade; 
		
		System.out.println("Classifi��o por idade");
		System.out.print("Insira sua idade: ");
		idade = scanner.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.print("Sua classifi��o �: infantil (10 - 14 anos)");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.print("Sua classifi��o �: juvenil (15 - 17 anos)");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.print("Sua classifi��o �: adulto (18 - 25 anos)");
		}
		else {
			System.out.print("Sua idade n�o tem classifi��o!");
		}
		
		scanner.close();

	}

}
