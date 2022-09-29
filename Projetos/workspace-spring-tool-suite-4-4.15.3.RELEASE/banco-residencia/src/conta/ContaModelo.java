package conta;

public interface ContaModelo {
	
	public boolean sacar(double valor);
	
	public void depositar(double deposito);
	
	public void transferir(Conta destino, double valor);

}
