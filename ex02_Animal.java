package pkgherancapolimorfismo;

public abstract class ex02_Animal {

private String tipoAnimal;
	
	public ex02_Animal (String tipoAnimal)
	{
		this.tipoAnimal = tipoAnimal;
	}
	
	abstract public void nome(String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

}
