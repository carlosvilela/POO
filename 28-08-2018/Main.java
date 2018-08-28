
//--------------------------------------------------------------------------------------
/*Objetivo: Calculadora Simples
 * Acessar compiladores online:
 * [1] https://repl.it
 * [2] https://www.tutorialspoint.com/compile_java_online.php 
 * Exercicios:
 * [1] Incluir no menu as chamadas dos metodos subtracao, divisao, menorQue, maiorQue
 * [2] Mudar a mensagem de resultado para: 
 *     O resultado da soma de [numero 1] com o  [numero 2] eh [resultado]
 * [3] Aplicar a mensagem com as devidas adaptacoes para as operacoes 
 *     Subtracao, Multiplicao, Divisao, MenorQue e MaiorQue     
 * [4] Criar o metodo menu() na classe Main. O conteudo do metodo main() deve
 *     ser transferido para o menu(), enquanto que o metodo main() deve chamar 
 *     apenas o menu().
 */
//--------------------------------------------------------------------------------------
import java.util.Scanner;
public class Main {
  public static void main(String args[]){
      
      menu();

  }
  
  
  public static void menu(){
      
      	  Calculadora calc = null;
	  boolean controle=true;
	  Scanner scanner = new Scanner( System.in );
          String operacao = null;
 	  do{
                 double a = 0;
                 double b = 0;
                 double r = 0;
                 double result = 0;
              operacao = null;
	  try{
		  System.out.println("Digite:");
		  System.out.println("0 - Para Sair");
		  System.out.println("1 - Para Somar");
		  System.out.println("2 - Para Subtrair");
		  System.out.println("3 - Para Divisão");
		  System.out.println("4 - Para Maior que");
		  System.out.println("5 - Para Menor que");
		  controle=false;//ainda nao deve concluir o loop
		  int opcao = scanner.nextInt();
          if(opcao!=0)
          {
		    System.out.println("Digite o primeiro valor");
                    a = scanner.nextDouble();
		    System.out.println("Digite o segundo valor");
		    b = scanner.nextDouble();
		    // double a=10, b=20;
		    calc = new Calculadora(a, b);
          }//if
		  
	  
	  switch(opcao)
	  {
	//------------------------------------------------------
	  case 1:
	     calc.soma();
	     r = calc.getResultado();
	     operacao = "soma";
	     break;
	  //------------------------------------------------------
	  case 2:
		     calc.subtracao();
		     r = calc.getResultado();
        	     operacao = "subtração";
		     break;
	  //------------------------------------------------------
	  case 3:
		     calc.divisao();
		     r = calc.getResultado();
        	     operacao = "divisão";
		     break;
	  //------------------------------------------------------
	  case 4:
		     calc.maiorQue();
		     r = calc.getResultado();
        	     operacao = "maior que";
		     break;
	  //------------------------------------------------------
	  case 5:
		     calc.menorQue();
		     r = calc.getResultado();
        	     operacao = "menor que";
		     break;
	  //------------------------------------------------------
	  default:
		  System.out.println("Saindo do sistema ");
		  controle=true;
		  break;
	  }//switch-case
          
          if(!operacao.isEmpty()){
              result = r;
              System.out.println("O resultado da "+operacao+" de "+a+" com o "+b+" eh "+result+"");
          }
	  
	  //------------------------------------------------------
	  }catch(java.util.InputMismatchException e){
		  System.out.println("Aviso de Excecao: sao permitidos apenas numeros!");
		  System.out.println("Por favor, execute o programa novamente.");
		  controle=false;
		  scanner.next();//limpar o buffer
	  }
	  }while(!controle);
  }
}
//--------------------------------------------------------------------------------------
class Calculadora {
  private double a;
  private double b;
  private double resultado; 
  
  public Calculadora(){
	  this.setA(0.0);
	  this.setB(0.0);
	  this.setResultado(0.0);
  }
  
  public Calculadora(double _a, double _b){
	  this.setA(_a);
	  this.setB(_b);
	  this.setResultado(0.0);
  }

  public double getA() {
	return this.a;
  }
  
  public void setA(double _a) {
	this.a = _a;
  }
  
  public double getB() {
	return this.b;
  }
  
  public void setB(double _b) {
	this.b = _b;
  }
  
  public double getResultado() {
	return this.resultado;
  }

  public void setResultado(double resultado) {
	this.resultado = resultado;
  }
  
  public void soma(){
	  double r = this.getA()+this.getB();
	  this.setResultado(r);
  }

  public void subtracao(){
	  double r = this.getA()-this.getB();
	  this.setResultado(r);
  }

  public void multiplicacao(){
	  double r = this.getA()*this.getB();
	  this.setResultado(r);
  }

  public void divisao(){
	  double r = this.getA()/this.getB();
	  this.setResultado(r);
  }
  
  public void maiorQue(){
	  double r = this.getA()>this.getB()?this.getA():this.getB();
	  this.setResultado(r);
  }

  public void menorQue(){
	  double r = this.getA()<this.getB()?this.getA():this.getB();
	  this.setResultado(r);
  }

}
//--------------------------------------------------------------------------------------

