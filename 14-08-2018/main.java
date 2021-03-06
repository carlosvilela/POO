
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
	public static void main(String args[]) {
		Calculadora calc;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		double a = scanner.nextDouble();
		System.out.println("Digite o segundo valor");
		double b = scanner.nextDouble();
		System.out.println("Digite o terceiro valor");
		double c = scanner.nextDouble();
		// double a=10, b=20;
		calc = new Calculadora(a, b, c);
		double r;
		calc.multiplicao();
		r = calc.getResultado();
		calc.soma(r);
		r = calc.getResultado();
		System.out.println("O resultado de "+calc.getA()+" + "+calc.getB()+" * "+calc.getC()+" é : "+r);
		r = calc.menorQue(calc.maiorQue(a, b), c);
		System.out.println("menorQue(maiorQue("+a+", "+b+"),"+c+") é:"+r);
	}
}

//--------------------------------------------------------------------------------------
class Calculadora {
	private double a;
	private double b;
	private double c;

	private double resultado;

	public Calculadora() {
		this.setA(0.0);
		this.setB(0.0);
		this.setC(0.0);
		this.setResultado(0.0);
	}

	public Calculadora(double _a, double _b, double _c) {
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

	public void soma(double valor) {
		double r = this.getA() + valor;
		this.setResultado(r);
	}

	public void subtracao() {
		double r = this.getA() - this.getB();
		this.setResultado(r);
	}

	public void multiplicao() {
		double r = this.getB() * this.getC();
		this.setResultado(r);
	}

	void soma() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
	
	public double maiorQue (double x, double y) {
		if (x>y) {
			this.setResultado(x);
		}else {
			this.setResultado(y);
		}
		
		return this.getResultado();
	}

	public double menorQue (double x, double y) {
		if (x<y) {
			this.setResultado(x);
		}else {
			this.setResultado(y);
		}
		
		return this.getResultado();
		
	}
}
//--------------------------------------------------------------------------------------
