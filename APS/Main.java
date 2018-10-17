//+---------------------------------------------------+
// Classe Principal: Main                             |
//+---------------------------------------------------+

public class Main {

	public static void main(String[] args) {

		Tela telaInicial = new Tela();

		telaInicial.exibirMenu(enumEstilo.MENU.ordinal(), null);
		telaInicial.exibirMenu(enumEstilo.TITULO.ordinal(), enumOpcao.CADASTRAR_PF.ordinal());
		telaInicial.escolherOpcao();

	}

}
//+---------------------------------------------------+
