//+---------------------------------------------------+
//       APS - Programação Orientada a Objetos 2018/2 |
//           Professor: Sérgio Assunção Monteiro      |
//  Copyright 2018                                    |
//                  Carlos Vilela, ****** ******      |
//                  ****** ******, ****** ******      |
//+---------------------------------------------------+
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//+---------------------------------------------------+
// Interface IPessoa											|
//+---------------------------------------------------+
interface IPessoa{

	public int escolherOpcao ();
	public void exibirMenu(Integer estilo, Integer opcao);

}
//+---------------------------------------------------+
enum enumOpcao{
	
	SAIR(0),
	CADASTRAR_PF(1), EXCLUIR_PF(2), LISTAR_PF(3),
	CADASTRAR_PJ(4), EXCLUIR_PJ(5), LISTAR_PJ(6);
	
	private int valor;
	
	enumOpcao(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
//+---------------------------------------------------+
enum enumEstilo{
	
	MENU(1), TITULO(3);
	
	private int valor;
	
	enumEstilo(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
//+---------------------------------------------------+

//+---------------------------------------------------+
//Classe: Menu                                        |
//+---------------------------------------------------+

class Tela implements IPessoa {

	@Override
	public int escolherOpcao() {

		Scanner ler;
		ler = new Scanner(System.in);

		Integer opcao;
		opcao = null;

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

//+---------------------------------------------------+//+---------------------------------------------------+
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
//+---------------------------------------------------+
// Classe: PessoaFisica                               |
//+---------------------------------------------------+

class PessoaFisica extends Pessoa{

	private static String cpf;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
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
//+---------------------------------------------------+
// Classe: PessoaJuridica                             |
//+---------------------------------------------------+

class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return this.cnpj;
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

//+---------------------------------------------------+
// Classe Principal: Main                             |
//+---------------------------------------------------+


//+---------------------------------------------------+
// Classe Principal: Main                             |
//+---------------------------------------------------+

public class Main {

	public static void main(String[] args) {

		Scanner ler;
		Tela telaInicial = new Tela();
		PessoaFisica pF;
		ArrayList<PessoaFisica> lista = new ArrayList<PessoaFisica>();

		Integer opt;
		opt = null;

		do {
			
			clearScreen();
			opt = null;

			telaInicial.exibirMenu(enumEstilo.MENU.ordinal(), null);
			System.out.print("Digite a Opção: ");

			opt = telaInicial.escolherOpcao();
			telaInicial.exibirMenu(enumEstilo.TITULO.ordinal(), opt);

			switch (opt) {

			// Cadastrar PF
			case 1:
				try {
				pF = new PessoaFisica();

				ler = new Scanner(System.in);
				System.out.print("Insira o Nome: ");
				pF.setNome(ler.nextLine());

				ler = new Scanner(System.in);
				System.out.print("Insira o CPF: ");
				pF.setCpf(ler.nextLine());

				ler = new Scanner(System.in);
				System.out.print("Insira o Endereço: ");
				pF.setEndereco(ler.nextLine());

				lista.add(0,pF);
				}catch(Exception e) {
					System.out.println(e);
				}

				break;

			// Listar PF
			case 3:

				for (int i = 0; i <= (lista.size() - 1); i++) {
					System.out.println(lista.get(i).imprimir());
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
	
	public static void clearScreen() {  
		for(int clear = 0; clear < 1000; clear++)
		  {
		     System.out.println("\n") ;
		  }

	}

}
//+---------------------------------------------------+
