package pessoal;

public class Funcionario implements Comparable<Funcionario>{
	private String nome;
	private String cpf;
	private double salario;
	
	/**
     * Teste
     */
	public Funcionario() {

	}

	/**
     * Teste1
     */
	public Funcionario(String cpf, double salario) {
		this.cpf = cpf;
		this.salario = salario;
	}
	/**
     * Teste2
     */
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public double bonificar() {
		return this.salario * 0.10;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionario [cpf=" + cpf + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Funcionario o) {
		if (this.getSalario() < o.getSalario()) {
			return -1;
		}
		if (this.getSalario() > o.getSalario()) {
			return 1;
		}
		return 0;
	}

}
