package lacos_de_decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3; 
		
		System.out.println("Classificando o maior n�mero");
		System.out.println("insira o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3 ) {
			System.out.println("O n�mero (" + num2 + ") � o maior entre os tr�s!");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("O n�mero (" + num2 + ") � o maior entre os tr�s!");
		}
		else {
			System.out.println("o n�mero (" + num3 + ") � o maior entre os tr�s!");
		}
		
		leia.close();
		}

}


