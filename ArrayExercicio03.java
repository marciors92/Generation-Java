package Familia32;

import java.util.Scanner;

public class ArrayExercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int array [][] = new int [3][3];
		
		int cont=0;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print("\nDigite um valor: ");
				array [i][j] = scan.nextInt();
				if(array [i][j] > 10)
				{
					cont ++;
				}
			}
		}
		System.out.println("\nA matriz tem " + cont + " números maior que 10");
		scan.close();

	}

}
