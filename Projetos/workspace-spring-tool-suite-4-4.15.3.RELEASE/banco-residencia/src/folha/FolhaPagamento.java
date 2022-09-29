package folha;

import pessoal.Funcionario;

public class FolhaPagamento {
	
	public double calculaFolhaPagamento(Funcionario funcionario) {
		return funcionario.getSalario() + funcionario.bonificar();
	}
}
