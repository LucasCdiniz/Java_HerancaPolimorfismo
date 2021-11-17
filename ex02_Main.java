package pkgherancapolimorfismo;

import java.util.Scanner;

public class ex02_Main {
	
	Scanner leia = new Scanner(System.in);
	
	ex02_Cachorro cachorro = new ex02_Cachorro();
	ex02_Cavalo cavalo = new ex02_Cavalo();
	ex02_Preguica preguica = new ex02_Preguica();
	
	ex02_Animal animal = null;
	
	int x=0;
	do
	{
		System.out.println("\nQual o tipo de seu animal?\n\n1-Cachorro | 2-Cavalo | 3-Pregui�a |");
		x= leia.nextInt();
		if(x==1)
		{
			animal = cachorro;
			System.out.println("\nQual o nome do seu cachorro?");
			String nome = leia.next();
			System.out.println("\nQuantos anos tem seu cachorro?");
			int idade = leia.nextInt();
			System.out.println("\nEssa � legal!!! Qual o som que seu cachorro emite?");
			String som = leia.next();
			
			System.out.println("---------------------------------------------------------");
			cachorro.nome(nome);
			cachorro.idade(idade);
			cachorro.som(som);
			cachorro.Corre();
		}
		else if(x==2)
		{
			animal = cavalo;
			System.out.println("\nQual o nome do seu cavalo?");
			String nome = leia.next();
			System.out.println("\nQuantos anos tem seu cavalo?");
			int idade = leia.nextInt();
			System.out.println("\nEssa � legal!!! Qual o som que seu cavalo emite?");
			String som = leia.next();
			
			System.out.println("---------------------------------------------------------");
			cavalo.nome(nome);
			cavalo.idade(idade);
			cavalo.som(som);
			cavalo.Corre();
		}
		else if(x==3)
		{
			animal = preguica;
			System.out.println("\nQual o nome da sua pregui�a?");
			String nome = leia.next();
			System.out.println("\nQuantos anos tem sua pregui�a?");
			int idade = leia.nextInt();
			System.out.println("\nEssa � legal!!! Qual o som que sua pregui�a emite?");
			String som = leia.next();
			
			System.out.println("---------------------------------------------------------");
			preguica.nome(nome);
			preguica.idade(idade);
			preguica.som(som);
			preguica.SubirArvores();
		}
		else
		{
			System.out.println("\nInforma��o inv�lida!!!");
		}
	}while(x<=0 || x>=4);
}

}

