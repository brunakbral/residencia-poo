package pessoal;

public class Gerente extends Funcionario{

	private String senha;
	private int numeroDeFuncionarios;
	
	public Gerente() {
	}
	
	public Gerente(String nome, String cpf, double salario, String senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	public Gerente(String nome, String cpf, double salario, String senha, int numeroDeFuncionarios) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	public Gerente(String nome, String cpf, String Sobrenome, double salario, String senha, int numeroDeFuncionarios) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	@Override
	public double bonificar() {
		return this.getSalario() * 0.15;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	@Override
	public String toString() {
		return "Gerente [senha=" + senha + ", numeroDeFuncionarios=" + numeroDeFuncionarios + ", getNome()=" + getNome()
				+ ", getCpf()=" + getCpf() + ", getSalario()=" + getSalario() + "]";
	}
	
}
