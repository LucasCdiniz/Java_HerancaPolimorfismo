package pkgherancapolimorfismo;

public class ex01_Cavalo extends ex01_Animal{

	private String raca;
	private String corCrina;
	private float peso;
	
	
	public ex01_Cavalo(String nome, int idade, String som, String raca, String corCrina, float peso) {
		
		super(nome,idade,som);
		this.raca=raca;
		this.corCrina=corCrina;
		this.peso=peso;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do cavalo: " + getNome()
		+ "\nIdade: " + getIdade() +"\nSom que o cavalo faz: " + getSom() 
		+ "\nRaça: " + raca +"\nPeso: " + peso 
		+ "\nCor : " + corCrina);
	}
	
	public void correr() {
		System.out.println("\nOlha o cavalo correndo ai!");
		System.out.println();
		System.out.println("            .''\r\n"
				+ "  ._.-.___.' (`\\\r\n"
				+ " //(        ( `'\r\n"
				+ "'/ )\\ ).__. ) \r\n"
				+ "' <' `\\ ._/'\\\r\n"
				+ "   `   \\     \\");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorCrina() {
		return corCrina;
	}

	public void setCorCrina(String corCrina) {
		this.corCrina = corCrina;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
