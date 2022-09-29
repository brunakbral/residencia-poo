package faculdade;

public class Professor extends Empregado{
		
	private int horasDeAula;
	
	public Professor() {
	}

	public Professor(String nome, double salario, int horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
	@Override
	public String getInfo() {
		return "Professor [horasDeAula=" + horasDeAula + " TotalHoras= " + horasDeAula*10 + ", getNome()=" + getNome() + ", getSalario()=" + getSalario()
				+ ", ValorTotal = " + this.getGastos() + "]";
	}

	@Override
	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10.00;
	}
	
}
