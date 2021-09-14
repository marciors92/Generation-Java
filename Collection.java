package sellection_exceptional;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoqueLoja = new ArrayList();
		
		
		do
		{
			System.out.println("\n\t\tLista de opções: ");
			System.out.println("\n(1)- Deseja adicionar produtos ao estoque ");
			System.out.println("\n(2)- Deseja remover alguem produto do  estoque?");
			System.out.println("\n(3)- Deseja atualizar produtos do estoque ");
			System.out.println("\n(4)- Deseja mostrar todos os produtos do estoque ");
			System.out.println("\n(0)- Deseja encerrar o programa ? ");
			System.out.println("\nQual a sua opção ?");
			op = leia.nextInt();
		
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque");
				String produto = leia.nextLine();
				estoqueLoja.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if(estoqueLoja.contains(produtor))
				{
					estoqueLoja.remove(produtor);
				}
				else 
				{
					System.out.println("\nProduto não existe !");
				}
				System.out.println(estoqueLoja);
				break;
			case 3:
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(estoqueLoja.contains(verifica))
				{
					estoqueLoja.remove(verifica);
					estoqueLoja.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe ! ");
				}
				System.out.println(estoqueLoja);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque são : ");
				System.out.println(estoqueLoja);
				break;
				default:
					System.out.println("\nOpção inválida!");
		}
			
			
			
			}while(op != 0);
		
		

	}

}
