package pessoal;

public class Assistente extends Funcionario{

	private String senha;
	
	public Assistente() {
		super();
	}

	public Assistente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.bonificar();
	}

	@Override
	public double bonificar() {
		return super.bonificar() + getSalario() * 0.20;
	}

	@Override
	public String toString() {
		return "Assistente [\n\tbonificar()=" + bonificar() + ", \n\tgetNome()=" + getNome() + ", \n\tgetCpf()=" + getCpf()
				+ ", \n\tgetSalario()=" + getSalario() + "\n]\n";
	}
	
	
}
