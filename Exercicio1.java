package lacos_de_decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3; 
		
		System.out.println("Classificando o maior número");
		System.out.println("insira o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Insira o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3 ) {
			System.out.println("O número (" + num2 + ") é o maior entre os três!");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O número (" + num2 + ") é o maior entre os três!");
		}
		else {
			System.out.println("o número (" + num3 + ") é o maior entre os três!");
		}
		
		leia.close();
		}

}


