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

	public void setNome(String nome) {
		this.nome.add(nome);
	}

	public void setEndereco(String endereco) {
		this.endereco.add(endereco);
	}

	public String getNome(int indice) {
		return this.nome.get(indice);
	}

	public String getEndereco(int indice) {
		return this.endereco.get(indice);
	}
	
	public int size () {
		return this.nome.size();
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

	public void setCpf(String cpf) {
		this.cpf.add(cpf);
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

	public void setCnpj(String cnpj) {
		this.cnpj.add(cnpj);
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

	public static Tela telaInicial = new Tela();
	public static Scanner ler;
	public static String nome, id, endereco;
	public static PessoaFisica1 pF = new PessoaFisica1();
	public static PessoaJuridica pJ = new PessoaJuridica();
	
	public static void main(String[] args) {



		String qt;
		Integer opt;
		opt = null;
		qt = null;

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
					endereco = null;

					ler = new Scanner(System.in);
					System.out.print("Insira o Nome: ");
					nome = ler.nextLine();

					ler = new Scanner(System.in);
					System.out.print("Insira o CPF: ");
					id = ler.nextLine();

					ler = new Scanner(System.in);
					System.out.print("Insira o Endereço: ");
					endereco = ler.nextLine();

					pF.setNome(nome);
					pF.setCpf(id);
					pF.setEndereco(endereco);


				} catch (Exception e) {
					System.out.println(e);
				}

				break;

				// Excluir PF
				case 2:
					
					try {
					
					boolean flag;
					flag = false;
					ler = new Scanner(System.in);
					id = null;
					String s, S;
					s = "s";
					S = "S";
					
					System.out.print("Insira o CPF da pessoa que deseja excluir: ");
					id = ler.nextLine();

					for (int i = 0; i < (pF.size()); i++) {
						
						if(pF.getCpf(i).equals(id)) {
							System.out.println("Foram identificados os seguintes dados:");
							System.out.println(pF.getPessoa(i));
							System.out.print("Deseja excluir (s/n)? ");
							
							qt = null;
							ler = new Scanner(System.in);
							qt = ler.nextLine();
							
							if(s.equals(qt.charAt(0)) || S.equals(qt.charAt(0))) {
								pF.removerPessoa(i);
								System.out.println("OBS: Exclusão realizada com sucesso.");
								flag = true;
							}else {
								System.out.println("OBS: Exclusão cancelada.");
							}
					}
					}
					
					if(!flag) {
					System.out.println("ERRO: O CPF Não foi encontrado...");
					}
					
					}catch(Exception e) {
						System.out.println(e);
					}
					break;

			// Listar PF
			case 3:

				for (int i = 0; i < (pF.size()); i++) {
					System.out.println(i + " - " + pF.getPessoa(i));
				}

				break;
				
				// Cadastrar PJ
				case 4:
					try {

						
						nome = null;
						id = null;
						endereco = null;

						ler = new Scanner(System.in);
						System.out.print("Insira o Nome: ");
						nome = ler.nextLine();

						ler = new Scanner(System.in);
						System.out.print("Insira o CPF: ");
						id = ler.nextLine();

						ler = new Scanner(System.in);
						System.out.print("Insira o Endereço: ");
						endereco = ler.nextLine();

						pJ.setNome(nome);
						pJ.setCnpj(id);
						pJ.setEndereco(endereco);


					} catch (Exception e) {
						System.out.println(e);
					}

					break;

					// Excluir PJ
					case 5:
						
						try {
						
						boolean flag;
						flag = false;
						ler = new Scanner(System.in);
						id = null;
						String s, S;
						s = "s";
						S = "S";
						
						System.out.print("Insira o CPF da pessoa que deseja excluir: ");
						id = ler.nextLine();

						for (int i = 0; i < (pF.size()); i++) {
							
							if(pJ.getCnpj(i).equals(id)) {
								System.out.println("Foram identificados os seguintes dados:");
								System.out.println(pJ.getPessoa(i));
								System.out.print("Deseja excluir (s/n)? ");
								
								qt = null;
								ler = new Scanner(System.in);
								qt = ler.nextLine();
								
								if(s.equals(qt.charAt(0)) || S.equals(qt.charAt(0))) {
									pJ.removerPessoa(i);
									System.out.println("OBS: Exclusão realizada com sucesso.");
									flag = true;
								}else {
									System.out.println("OBS: Exclusão cancelada.");
								}
						}
						}
						
						if(!flag) {
						System.out.println("ERRO: O CPF Não foi encontrado...");
						}
						
						}catch(Exception e) {
							System.out.println(e);
						}
						break;

				// Listar PJ
				case 6:

					for (int i = 0; i < (pJ.size()); i++) {
						System.out.println(i + " - " + pJ.getPessoa(i));
					}

					break;

			}

		} while (opt != 0);

	}

}
//+---------------------------------------------------+
