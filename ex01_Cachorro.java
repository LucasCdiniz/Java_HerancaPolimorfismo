package pkgherancapolimorfismo;

public class ex01_Cachorro extends ex01_Animal  {

	private String raca;
	private String personalidade;
	private String cor;
	
	public ex01_Cachorro(String nome, int idade, String som, String raca, String personalidade, String cor ) {
		
		super(nome,idade,som);
		
		this.raca=raca;
		this.personalidade=personalidade;
		this.cor=cor;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do cachorro: " + getNome()
		+ "\nIdade: " + getIdade() +"\nSom que o cachorro faz: " + getSom() 
		+ "\nRaça: " + raca +"\nPersonalidade: " + personalidade 
		+ "\nCor : " + cor);
	}
	
	public void correr() {
		
		System.out.println("\nOlha o cachorro correndo ai!");
		System.out.println();
		System.out.println("             .--~~,__\r\n"
				+ ":-....,-------`~~'._.'\r\n"
				+ " `-,,,  ,_      ;'~U'\r\n"
				+ "  _,-' ,'`-__; '--.\r\n"
				+ " (_/'~~      ''''(;");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
