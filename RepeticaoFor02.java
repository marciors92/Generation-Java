package lacos_de_decisao;

import java.util.Scanner;

public class RepeticaoFor02 {

	public static void main(String[] args) {
		int num, par=0,impar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=1; x<=10; x++) {
			System.out.println("\nDigite um número");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("\nQuatidade de par: "+par);
		System.out.println("\nQuantidade de ímpar: "+impar);

	}

}
