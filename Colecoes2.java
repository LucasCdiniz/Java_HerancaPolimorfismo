package pkgpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("\n(1) Adicionar produtos ao Estoque");
			System.out.println("\n(2) Remover os produtos do estoque");
			System.out.println("\n(3) Editar os produtos");
			System.out.println("\n(4) Exibir todos os itens do estoque");
			System.out.println("\n(0) Encerrar o programa");
			System.out.println("-------------------------------------------------------------------");
			System.out.println("\nDigite sua opção: ");
			
			op = ler.nextInt();
			
			switch(op) {
			case 1: 
				ler.nextLine();
				System.out.println("\nDigite o nome do produto:");
				String produto = ler.nextLine();
				//Incluindo dentro do ArrayList
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o nome do produto para remover do estoque:");
				String produtor = ler.nextLine();
				
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}else {
					System.out.println("\nProduto não encontrado");
				}
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar");
				String verifica = ler.nextLine();
				
				System.out.println("\n Digite o novo nome do item que irá substituir o item " + verifica + " :");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nProduto não encontrado");
				}
				
				System.out.println("\n" + estoque);
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nOs produtos que temos em estoque são: ");
				System.out.println(estoque);
				break;
			default:
				System.out.println("Programa finalizado");
			}

		}while(op!=0);
	}

}
