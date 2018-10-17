//+---------------------------------------------------+
// Classe: PessoaJuridica                             |
//+---------------------------------------------------+

class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public PessoaJuridica() {
		super();
	}


	@Override
	public String imprimir() {

		return "Razão Social: "+this.nome+"; CNPJ: "+this.cnpj+"; Endereço: "+this.endereco;
	}
	
	

}
//+---------------------------------------------------+
