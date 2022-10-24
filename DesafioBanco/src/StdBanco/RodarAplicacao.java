package StdBanco;

public class RodarAplicacao {
	public static void main(String[] args) {
		
		Cliente premier = new Cliente();
		premier.setNome("Aurélio Filho");
		Conta cc = new ContaCorrente(premier);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(premier);
		
		Conta cp2 = new ContaCorrente(premier);
		cp2.depositar(102.98);
		cp2.transferir(51, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cp2.imprimirExtrato();

	
	
	
	}
}
