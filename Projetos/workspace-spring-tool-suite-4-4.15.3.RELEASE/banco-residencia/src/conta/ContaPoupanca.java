package conta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
	
	private double rendimento;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(String titular, double saldo, double rendimento) {
		super(titular, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [\n\trendimento=" + rendimento + ", \n\tgetNumContas()=" + getNumContas() + ", \n\tgetNumero()="
				+ getNumero() + ", \n\tgetTitular()=" + getTitular() + ", \n\tgetSaldo()=" + getSaldo() + "\n]\n";
	}

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		}
	
	
	
}
