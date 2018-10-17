import java.util.Scanner;

//+---------------------------------------------------+
//Classe: Menu                                        |
//+---------------------------------------------------+

class Tela implements IPessoa {

	@Override
	public int escolherOpcao() {

		Scanner ler;
		ler = new Scanner(System.in);

		int opcao;

		opcao = ler.nextInt();

		switch (opcao) {

		// Cadastrar
		case (1):
			opcao = 1;
			break;

		// Excluir
		case (2):
			opcao = 2;
			break;

		// Listar
		case (3):
			opcao = 3;
			break;

		default:
			opcao = 9;
		}

		return opcao;
	}

	@Override
	public void exibirMenu(int estilo, Integer opcao) {

		String titulo = "";

		if (opcao != null) {

			switch (opcao) {

			// Pessoa Física
			case (0):
				titulo = "| CADASTRAR PESSOA FISICA                           |";
				break;

			case (1):
				titulo = "| EXCLUIR PESSOA FISICA                             |";
				break;

			case (2):
				titulo = "| LISTAR PESSOA FISICA                              |";
				break;

			// Pessoa Jurídica
			case (3):
				titulo = "| CADASTRAR PESSOA JURÍDICA                         |";
				break;

			case (4):
				titulo = "| EXCLUIR PESSOA JURÍDICA                           |";
				break;

			case (5):
				titulo = "| LISTAR PESSOA JURÍDICA                            |";
				break;

			default:
				titulo = "| >>> ERROR: Opção incorreta...                     |";
			}
		}

		switch (estilo) {

		// MENU
		case (0):
			System.out.println("+---------------------------------------------------+");
			System.out.println("|  APS: Cadastrar Pessoa Física e Pessoa Jurídica   |");
			System.out.println("|                                                   |");
			System.out.println("| Opções:                                           |");
			System.out.println("|          1 - Cadastrar                            |");
			System.out.println("|          2 - Excluir                              |");
			System.out.println("|          3 - Listar                               |");
			System.out.println("+---------------------------------------------------+");
			break;

		// TITULO
		case (1):
			System.out.println("+---------------------------------------------------+");
			System.out.println(titulo);
			System.out.println("+---------------------------------------------------+");
			break;

		default:
			System.out.println("+---------------------------------------------------+");
			System.out.println("| >>> ERROR: Estilo de menu incorreto...            |");
			System.out.println("+---------------------------------------------------+");

		}

	}

}

//+---------------------------------------------------+
