//+---------------------------------------------------+
//       APS - Programação Orientada a Objetos 2018/2 |
//           Professor: Sérgio Assunção Monteiro      |
//  Copyright 2018                                    |
//                  Carlos Vilela, ****** ******      |
//                  ****** ******, ****** ******      |
//+---------------------------------------------------+

//+---------------------------------------------------+
// Bibliotecas                                        |
//+---------------------------------------------------+
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//+---------------------------------------------------+
// Interface IPessoa                                  |
//+---------------------------------------------------+
interface IPessoa {

	public int escolherOpcao();

	public void exibirMenu(Integer estilo, Integer opcao);

}
//+---------------------------------------------------+

//+---------------------------------------------------+
//Classe: Menu                                        |
//+---------------------------------------------------+
class Tela implements IPessoa {

	@Override
	public int escolherOpcao() {

		boolean flag;
		flag = false;

		Integer opcao;
		opcao = null;

		do {

			try {

				Scanner ler;
				ler = new Scanner(System.in);

				opcao = ler.nextInt();

				switch (opcao) {

				// SAIR
				case 0:
					opcao = 0;
					break;

				// Cadastrar
				case 1:
					opcao = 1;
					break;

				// Excluir
				case 2:
					opcao = 2;
					break;

				// Listar
				case 3:
					opcao = 3;
					break;

				// Cadastrar
				case 4:
					opcao = 4;
					break;

				// Excluir
				case 5:
					opcao = 5;
					break;

				// Listar
				case 6:
					opcao = 6;
					break;

				default:
					opcao = 9;
				}

				flag = false;

			} catch (Exception e) {
				System.out.println("ERRO - os dados inseridos devem ser valores.");
				System.out.print("Insira novamente: ");

				flag = true;
			}

		} while (flag);

		return opcao;
	}

	@Override
	public void exibirMenu(Integer estilo, Integer opcao) {

		Integer opt;
		String titulo = "";

		if (opcao != null) {
			opt = null;
			opt = opcao;

			switch (opcao) {

			// SAIR
			case 0:
				titulo = null;
				titulo = "|            >>> PROGRAMA ENCERRADO <<<             |";
				break;

			// Pessoa Física
			case 1:
				titulo = null;
				titulo = "| CADASTRAR PESSOA FISICA                           |";
				break;

			case 2:
				titulo = null;
				titulo = "| EXCLUIR PESSOA FISICA                             |";
				break;

			case 3:
				titulo = null;
				titulo = "| LISTAR PESSOA FISICA                              |";
				break;

			// Pessoa Jurídica
			case 4:
				titulo = null;
				titulo = "| CADASTRAR PESSOA JURÍDICA                         |";
				break;

			case 5:
				titulo = null;
				titulo = "| EXCLUIR PESSOA JURÍDICA                           |";
				break;

			case 6:
				titulo = null;
				titulo = "| LISTAR PESSOA JURÍDICA                            |";
				break;

			default:
				titulo = null;
				titulo = "| >>> ERROR: Opção incorreta...                     |";
			}
		}

		switch (estilo) {

		// MENU
		case (0):
			System.out.println("+---------------------------------------------------+");
			System.out.println("|                    CADASTRO                       |");
			System.out.println("|      Pessoa Física(PF) | Pessoa Jurídica(P J)     |");
			System.out.println("| Opções:                                           |");
			System.out.println("|     1 - Cadastrar PF   |   4 - Cadastrar PJ       |");
			System.out.println("|     2 - Excluir PF     |   5 - Excluir PJ         |");
			System.out.println("|     3 - Listar PF      |   6 - Listar PJ          |");
			System.out.println("| 0 - Sair                                          |");
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

//+---------------------------------------------------+
// Classe Abstrata: Pessoa                            |
//+---------------------------------------------------+

abstract class Pessoa {

	protected static ArrayList<String> nome;
	protected static ArrayList<String> endereco;

	public Pessoa() {
		this.nome = new ArrayList<String>();
		this.endereco = new ArrayList<String>();
	}

	public void setNome(int indice, String nome) {
		this.nome.set(indice, nome);
	}

	public void setEndereco(int indice, String endereco) {
		this.endereco.set(indice, endereco);
	}

	public String getNome(int indice) {
		return this.nome.get(indice);
	}

	public String getEndereco(int indice) {
		return this.endereco.get(indice);
	}

	public abstract String getPessoa(int indice);
	public abstract void removerPessoa(int indice);

}
//+---------------------------------------------------+
//+---------------------------------------------------+
// Classe: PessoaFisica                               |
//+---------------------------------------------------+

class PessoaFisica1 extends Pessoa {

	private static ArrayList<String> cpf;

	public PessoaFisica1() {
		super();
		this.cpf = new ArrayList<String>();
	}

	public void setCpf(int indice, String cpf) {
		this.cpf.set(indice, cpf);
	}

	public String getCpf(int indice) {
		return this.cpf.get(indice);
	}

	@Override
	public String getPessoa(int indice) {
		return "Nome: " + getNome(indice) + "; CPF: " + getCpf(indice) + "; Endereço: " + getEndereco(indice);
	}

	@Override
	public void removerPessoa(int indice) {
		this.nome.remove(indice);
		this.cpf.remove(indice);
		this.endereco.remove(indice);
	}

}
//+---------------------------------------------------+
//+---------------------------------------------------+
// Classe: PessoaJuridica                             |
//+---------------------------------------------------+

class PessoaJuridica extends Pessoa {

	private static ArrayList<String> cnpj;
	
	public PessoaJuridica() {
		super();
		this.cnpj = new ArrayList<String>();
	}

	public void setCnpj(int indice, String cnpj) {
		this.cnpj.set(indice, cnpj);
	}

	public String getCnpj(int indice) {
		return this.cnpj.get(indice);
	}

	@Override
	public String getPessoa(int indice) {

		return "Razão Social: " + getNome(indice) + "; CNPJ: " + getCnpj(indice) + "; Endereço: " + getEndereco(indice);
	}

	@Override
	public void removerPessoa(int indice) {
		this.nome.remove(indice);
		this.cnpj.remove(indice);
		this.endereco.remove(indice);
	}

}
//+---------------------------------------------------+

//+---------------------------------------------------+
// Classe Principal: Main                             |
//+---------------------------------------------------+

public class Main {

	
	public static void main(String[] args) {

		Scanner ler;
		Tela telaInicial = new Tela();
		String nome, id, endereco;

		Integer opt;
		opt = null;

		do {

			opt = null;

			telaInicial.exibirMenu(0, null);
			System.out.print("Digite a Opção: ");

			opt = telaInicial.escolherOpcao();
			telaInicial.exibirMenu(1, opt);

			switch (opt) {

			// Cadastrar PF
			case 1:
				try {
					
					nome = null;
					id = null;

					ler = new Scanner(System.in);
					System.out.print("Insira o Nome: ");
					nome = ler.nextLine();

					ler = new Scanner(System.in);
					System.out.print("Insira o CPF: ");
					id = ler.nextLine();

					ler = new Scanner(System.in);
					System.out.print("Insira o Endereço: ");
					endereco = ler.nextLine();

					PessoaFisica1 pF;
					pF = new PessoaFisica1();

					pF.setNome(nome);

					pF.setCpf(cpf);

					pF.setEndereco(endereco);

					adicionar(pF);

				} catch (Exception e) {
					System.out.println(e);
				}

				break;

			// Listar PF
			case 3:

				for (int i = 0; i <= (lista.size() - 1); i++) {
					System.out.println(i + " - " + lista.get(i));
				}

				break;
			}

		} while (opt != 0);

		/*
		 * Tela telaInicial = new Tela(); PessoaFisica pFisica = new PessoaFisica();
		 * PessoaJuridica pJuridica = new PessoaJuridica();
		 * 
		 * telaInicial.exibirMenu(enumEstilo.TITULO.ordinal(),
		 * enumOpcao.CADASTRAR_PF.ordinal()); telaInicial.escolherOpcao();
		 * 
		 * pFisica.setNome("Carlos"); pFisica.setCpf("12345678909");
		 * pFisica.setEndereco("Av. sem nome, 0009");
		 * System.out.println(pFisica.imprimir());
		 * 
		 * pJuridica.setNome("Carlos"); pJuridica.setCnpj("12345678909000001");
		 * pJuridica.setEndereco("Av. sem nome, 0009");
		 * System.out.println(pJuridica.imprimir());
		 */
	}

}
//+---------------------------------------------------+
