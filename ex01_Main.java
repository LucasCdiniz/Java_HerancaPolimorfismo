package pkgherancapolimorfismo;

import java.util.Scanner;

public class ex01_Main {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ex01_Cachorro cachorro = new ex01_Cachorro("Maic�o",5,"Au au","Viralata Caramelo","Passivo","Caramelo");
		
		ex01_Cavalo cavalo = new ex01_Cavalo("Spirit", 12, "Pocot�","Pantaneiro","Branca", 400);
		
		ex01_Preguica preguica = new ex01_Preguica("Sid", 4,"Som","Choloepus didactylus",4,60,12);
		
		
		do {
			
			System.out.println("\n\t\tMenu de Op��es ");
			System.out.println("\n(1) Dados dos C�es ");
			System.out.println("\n(2) Dados dos Cavalos  ");
			System.out.println("\n(3) Dados dos Bichos Pregui�as");
			System.out.println("\n(4) Sair do programa");
			System.out.println("\nDigite a sua op��o: ");
			
			op = ler.nextInt();
			
			switch(op) {
			
						case 1:
							cachorro.imprimirInfo();
							cachorro.correr();
							break;
						case 2:
							cavalo.imprimirInfo();
							cavalo.correr();
							break;
						case 3:
							preguica.imprimirInfo();
							preguica.subirNaArvore();
							break;
						case 4:
							System.out.println("\nObrigado e volte sempre!");
							break;
						default:
								System.out.println("\nOp��o inv�lida\nDigite uma outra op��o\n");
			}
			
		}while(op!=4);
	}

}
