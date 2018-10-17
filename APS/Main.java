//+---------------------------------------------------+
// Classe Principal: Main                             |
//+---------------------------------------------------+

public class Main {

	public static void main(String[] args) {

		Tela telaInicial = new Tela();

		telaInicial.exibirMenu(enumEstilo.MENU.ordinal(), null);
		telaInicial.exibirMenu(enumEstilo.TITULO.ordinal(), enumOpcao.CADASTRAR_PF.ordinal());
		telaInicial.escolherOpcao();
		
		PessoaFisica pFisica = new PessoaFisica();
		pFisica.setNome("Carlos");
		pFisica.setCpf("12345678909");
		pFisica.setEndereco("Av. sem nome, 0009");
		System.out.println(pFisica.imprimir());

		PessoaJuridica pJuridica = new PessoaJuridica();
		pJuridica.setNome("Carlos");
		pJuridica.setCnpj("12345678909000001");
		pJuridica.setEndereco("Av. sem nome, 0009");
		System.out.println(pJuridica.imprimir());

	}

}
//+---------------------------------------------------+
