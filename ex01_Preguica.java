package pkgherancapolimorfismo;

public class ex01_Preguica extends ex01_Animal{

	private String tipoDeEspecie;
	private float peso;
	private float altura;
	private int comprimentoDasUnhas;
	
	public ex01_Preguica(String nome, int idade, String som, String tipoDeEspecie, float peso, float altura, int comprimentoDasUnhas)
	{
		super(nome,idade,som);
		
		this.tipoDeEspecie=tipoDeEspecie;
		this.peso=peso;
		this.altura=altura;
		this.comprimentoDasUnhas=comprimentoDasUnhas;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome da preguiça: " + getNome()
		+ "\nIdade: " + getIdade() +"\nSom que a preguiça faz: " + getSom() 
		+ "\nTipo de Espécie: " + tipoDeEspecie +"\nPeso: " + peso 
		+ "\nAltura : " + altura + "\nComprimento das unhas: " + comprimentoDasUnhas);
	}
	
	
	public void subirNaArvore() {
		System.out.println("\nOlha a preguiça pendurada na árvore ai!");
		System.out.println();
		System.out.println("`\"\"==,,__  \r\n"
				+ "        `\"==..__\"=..__ _    _..-==\"\"_\r\n"
				+ "             .-,`\"=/ /\\ \\\"\"/_)==\"\"``\r\n"
				+ "            ( (    | | | \\/ |\r\n"
				+ "             \\ '.  |  \\;  \\ /\r\n"
				+ "              |  \\ |   |   ||\r\n"
				+ "         ,-._.'  |_|   |   ||\r\n"
				+ "        .\\_/\\     -'   ;   Y\r\n"
				+ "       |  `  |        /    |-.\r\n"
				+ "       '. __/_    _.-'     /'\r\n"
				+ "              `'-.._____.-'");
	}

	public String getTipoDeEspecie() {
		return tipoDeEspecie;
	}

	public void setTipoDeEspecie(String tipoDeEspecie) {
		this.tipoDeEspecie = tipoDeEspecie;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getComprimentoDasUnhas() {
		return comprimentoDasUnhas;
	}

	public void setComprimentoDasUnhas(int comprimentoDasUnhas) {
		this.comprimentoDasUnhas = comprimentoDasUnhas;
	}
	
	
}
