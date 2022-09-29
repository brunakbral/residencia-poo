package faculdade;

public class Empregado {
	
	private String nome;
	private double salario;
		
	public Empregado() {
	}
	
	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getInfo() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}
	
	public double getGastos() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}
