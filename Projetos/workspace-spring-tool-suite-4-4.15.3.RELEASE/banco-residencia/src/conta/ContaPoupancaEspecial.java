package conta;

public class ContaPoupancaEspecial extends ContaPoupanca{

	private String cartaoDebito;

	public ContaPoupancaEspecial(String titular, double saldo, double rendimento, String cartaoDebito) {
		super(titular, saldo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}

	public String getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(String cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	@Override
	public String toString() {
		return "ContaPoupancaEspecial [\n\tcartaoDebito=" + cartaoDebito + ", \n\tgetRendimento()=" + getRendimento()
				+ ", \n\tgetNumContas()=" + getNumContas() + ", \n\tgetNumero()=" + getNumero() + ", \n\tgetTitular()="
				+ getTitular() + ", \n\tgetSaldo()=" + getSaldo() + "\n]\n";
	}


	
	
}
