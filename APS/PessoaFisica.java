//+---------------------------------------------------+
// Classe: PessoaFisica                               |
//+---------------------------------------------------+

class PessoaFisica extends Pessoa{

	private String cpf;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public PessoaFisica() {
		super();
	}


	@Override
	public String imprimir() {

		return "Nome: "+this.nome+"; CPF: "+this.cpf+"; Endereço: "+this.endereco;
	}
	
	

}
//+---------------------------------------------------+
