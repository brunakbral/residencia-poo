package pessoal;

public class Diretor extends Funcionario{
	
	public Diretor() {
		super();
	}

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double bonificar() {
		return this.getSalario() * 0.30;
	}

	@Override
	public String toString() {
		return "Diretor [\n\tbonificar()=" + bonificar() + ", \n\tgetNome()=" + getNome() + ", \n\tgetCpf()=" + getCpf()
				+ ", \n\tgetSalario()=" + getSalario() + "\n]\n";
	}
}
