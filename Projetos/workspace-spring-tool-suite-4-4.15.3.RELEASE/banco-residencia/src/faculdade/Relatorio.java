package faculdade;

public class Relatorio {
	
	private double gastos;
	
	public void adicionarGasto(Empregado empregado) {
		try {
			this.gastos += empregado.getGastos();
			System.out.println(empregado.getInfo());
		}
		catch (NullPointerException e) {
			throw new NullPointerException("Empregado Nulo: ");
		}
	}
	
	public double imprimeGastos() {
		System.out.println("\n\nOs gastos da faculdade com empregados foi de: " + this.gastos);
		return this.gastos;
	}
}
