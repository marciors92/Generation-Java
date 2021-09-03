package lacos_de_decisao;

import java.util.Scanner;

public class RepeticaoDoWhile05 {

	public static void main(String[] args) {
		
		float num,somaNum=0,mediaNum;
		int contNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextFloat();
		
		while(num!=0)
		{
			somaNum +=num;
			System.out.println("\nEntre com um número: ");
			num = leia.nextFloat();
		}
		mediaNum = somaNum / contNum;
		System.out.printf("\nMédia dos números digitados: %.2f",mediaNum);
	}

}
