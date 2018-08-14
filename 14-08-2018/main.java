//--------------------------------------------------------------------------------------
/*Objetivo: Calculadora Simples
 * Acessar compiladores online:
 * [1] https://repl.it
 * [2] http://www.onlinecompiler.net/
 * Exercicios:
 * [1] Inserir as operacoes Subtracao, Multiplicao
 * [2] Inserir as operacoes MaiorQue e MenorQue
 * [3] Faca as seguintes operacoes apenas com chamadas:
 *     [a] 10 + 20 * 30
 *     [b] menorQue(maiorQue(10, 20),5)
 */
//--------------------------------------------------------------------------------------
import java.util.Scanner;
class Main {
  public static void main(String args[]){
	  Calculadora calc;
	  Scanner scanner = new Scanner( System.in );
	  System.out.println("Digite o primeiro valor");
	  double a = scanner.nextDouble();
	  System.out.println("Digite o segundo valor");
	  double b = scanner.nextDouble();
          System.out.println("Digite o terceiro valor");
          double c = scanner.nextDouble ();
          //double a=10, b=20;
	  calc = new Calculadora(a,b,c);
          calc.multiplicao();
	  calc.soma();
	  double r = calc.getResultado();
	  System.out.println("O resultado da soma eh:"+r);	  
  }
}
//--------------------------------------------------------------------------------------
class Calculadora {
  private double a;
  private double b;
  private double c;


  private double resultado; 
  
  public Calculadora(){
	  this.setA(0.0);
	  this.setB(0.0);
          this.setC(0.0);
	  this.setResultado(0.0);
  }
  
  public Calculadora(double _a, double _b, double _c){
	  this.setA(_a);
	  this.setB(_b);
          this.setC(_c);
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
      public double getC() {
        return this.c;
    }

    public void setC(double _c) {
        this.c = _c;
    }
  
  public double getResultado() {
	return this.resultado;
  }

  public void setResultado(double resultado) {
	this.resultado = resultado;
  }
  
  public void soma(double a){
	  double r = this.getA()+this.getB();
	  this.setResultado(r);
  }
 
    public void subtracao(){
	  double r = this.getA()-this.getB();
	  this.setResultado(r);
  }
    
      public void multiplicao(){
	  double r = this.getB()*this.getC();
	  this.setResultado(r);
  }

    void soma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//--------------------------------------------------------------------------------------
