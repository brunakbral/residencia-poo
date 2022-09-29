package conta;

public abstract class Conta {
	
	private int numero;
	private String titular;
	protected double saldo;
	private static int numContas=1;
		
	public Conta() {
		numContas++;
	}
	
	public Conta(String titular, double saldo) {
		this.numero = numContas;
		this.titular = titular;
		this.saldo = saldo;
		numContas++;
	}
	
	public int getNumContas() {
		return numContas;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	

	
	public abstract void imprimeExtrato();

	@Override
	public String toString() {
		return "Conta [\n\tnumero=" + numero + ", \n\ttitular=" + titular + ", \n\tsaldo=" + saldo + "\n]\n";
	}
	
	
}
