//+---------------------------------------------------+
//       APS - Programação Orientada a Objetos 2018/2 |
//           Professor: Sérgio Assunção Monteiro      |
//  Copyright 2018                                    |
//                  Carlos Vilela, ****** ******      |
//                  ****** ******, ****** ******      |
//+---------------------------------------------------+

//+---------------------------------------------------+
// Interface IPessoa											|
//+---------------------------------------------------+
interface IPessoa{

	public int escolherOpcao ();
	public void exibirMenu(int estilo, Integer opcao);

}
//+---------------------------------------------------+
enum enumOpcao{
	
	CADASTRAR_PF(0), EXCLUIR_PF(1), LISTAR_PF(2),
	CADASTRAR_PJ(3), EXCLUIR_PJ(4), LISTAR_PJ(5);
	
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
