package StdBanco;

public abstract class Conta implements IConta{
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;
	

	
	public Conta(Cliente cliente) {
		super();
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
		
}

	@Override
	public boolean sacar(double valor) {
		if(this.saldo > valor) {
			this.saldo = saldo -valor;
			return true;
		}
			return false;
		}
		
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
