package conta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta implements ContaModelo, ContaInternacionalModelo{
	
	private double limite;
	private double tarifa;
		
	public ContaCorrente() {
	}

	public ContaCorrente(String titular, double saldo, double tarifa, double limite) {
		super(titular, saldo);
		this.limite = limite;
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getTarifa() {
		return tarifa;
	}
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		System.out.println("#### Fim do Extrato ####\n");
		}
	
	@Override
	public String toString() {
		return "ContaCorrente [\n\tlimite=" + limite + ", \n\ttarifa=" + tarifa
				+ ", \n\tgetNumero()=" + getNumero() + ", \n\tgetTitular()=" + getTitular() + ", \n\tgetSaldo()=" + getSaldo()
				+ "\n]\n";
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	
	public void transferir(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
		} else {
			System.out.println("Não há saldo suficiente para transferência");
		}
	}

	@Override
	public void transferirParaExterior(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
		} else {
			System.out.println("Não há saldo suficiente para transferência");
		}
		
	}
}
