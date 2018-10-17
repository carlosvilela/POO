//+---------------------------------------------------+
// Classe Abstrata: Pessoa                            |
//+---------------------------------------------------+

abstract class Pessoa {
	
	protected static String nome;
	protected static String endereco;
	
	public Pessoa() {
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	public abstract String imprimir();

}
//+---------------------------------------------------+
