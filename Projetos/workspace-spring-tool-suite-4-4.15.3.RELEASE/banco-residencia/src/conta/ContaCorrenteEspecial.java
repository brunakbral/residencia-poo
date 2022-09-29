package conta;

public class ContaCorrenteEspecial extends ContaCorrente{
	
	private String cartaoCredito;
	private String investimento;
	
	
	public ContaCorrenteEspecial(String titular, double saldo, double tarifa, double limite, String cartaoCredito, String investimento) {
		super(titular, saldo, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
	}
	
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	public String getInvestimento() {
		return investimento;
	}
	
	public void setInvestimento(String investimento) {
		this.investimento = investimento;
	}

	@Override
	public String toString() {
		return "ContaCorrenteEspecial [\n\tcartaoCredito=" + cartaoCredito + ", \n\tinvestimento=" + investimento
				+ ", \n\tgetLimite()=" + getLimite() + ", \n\tgetTarifa()=" + getTarifa() + ", \n\tgetNumero()=" + getNumero()
				+ ", \n\tgetTitular()=" + getTitular() + ", \n\tgetSaldo()=" + getSaldo() + "\n]\n";
	}
	
	

}
