package Questao2;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100, false, 500);
		ContaPoupanca cp = new ContaPoupanca(101, false, 1000);
		
		System.out.println("Rendimento conta corrente: " + cc.rendimento());
		System.out.println("Rendimento conta poupanca: " + cp.rendimento());
	}
}