package principal;

public class Principal {
	
	public static void main(String[] args) throws Exception {

		
//		ContaCorrente c1 = new ContaCorrente();
//		c1.depositar(1000);
//		ContaCorrente c2 = new ContaCorrente();
//		c2.depositar(2000);
//		ContaCorrente c3 = new ContaCorrente();
//		c3.depositar(3000);
//		ContaCorrente c4 = new ContaCorrente();
//		c4.depositar(4000);
//
//		List<Conta> listaConta = new ArrayList<>();
//		listaConta.add(c1);
//		listaConta.add(c2);
//		listaConta.add(c3);
//		listaConta.add(c4);
//		
//		// cria o mapa
//		Map< String, ContaCorrente > mapaDeContas = new HashMap<>();
//		// adiciona duas chaves e seus respectivos valores
//		mapaDeContas.put("diretor", c1);
//		mapaDeContas.put("supervisor", c1);
//		mapaDeContas.put("gerente", c4);
//		mapaDeContas.put("secretaria", c2);
//
//		// qual a conta do diretor? (sem casting!)
//		ContaCorrente contaDoDiretor = mapaDeContas.get("supervisor");
//		//System.out.println(contaDoDiretor.getSaldo());
//		
//		List<ContaCorrente> listaConstasCorrentes = (List<ContaCorrente>) mapaDeContas.values();
//		listaConstasCorrentes.get(0).getSaldo();
//		
//		System.out.println(mapaDeContas.values());
//		System.out.println(mapaDeContas.keySet());
		
		
//		Set<String> cargos = new HashSet<>();
//		cargos.add("Gerente");
//		cargos.add("Diretor");
//		cargos.add("Presidente");
//		cargos.add("Secretária");
//		cargos.add("Funcionário");
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		cargos.add("Diretor"); // repetido!
//		
//		// imprime na tela todos os elementos
//		System.out.println(cargos);
		

		
		
//		List<Funcionario> lista = new ArrayList<>();
//		lista.add(new Funcionario("1", 10000.00));
//		lista.add(new Funcionario("2", 2000.00));
//		lista.add(new Funcionario("3", 5000.00));
//		lista.add(new Funcionario("4", 7000.00));
//		lista.add(new Funcionario("5", 1000.00));
//		
//		System.out.println(lista);
//		Collections.sort(lista);
//		System.out.println(lista);
//		
//		int retorno = lista.get(0).compareTo(lista.get(1));

		
//		List<String> lista = new ArrayList<>();
//		lista.add("Sérgio");
//		lista.add("Paulo");
//		lista.add("Guilherme");
//		System.out.println(lista);
//		Collections.sort(lista);
//		System.out.println(lista);
		
		
//		List<Conta> contas = new ArrayList<>();
//		List<Conta> contasPoupancas = new ArrayList<>();
//		
//		Conta conta =  new ContaPoupanca("Marcelo2", 2000.0, 10.0);
//		
//		contas.add(new ContaCorrente("Marcelo", 2000.0, 10.00, 2000.00));
//		contas.add(new ContaCorrente("Marcelo1", 3000.0, 20.00, 3000.00));
//		contas.add(new ContaCorrente("Marcelo2", 400.0, 30.00, 4000.00));
//		contas.add(conta);
//		
//		contasPoupancas.add(conta);
//		
//		for(int i=0; i<contas.size(); i++) {
//			contas.get(i).imprimeExtrato();
//		}
		
		
//		List listaEmpregado = new ArrayList();
//		listaEmpregado.add(new Empregado("Marcelo", 1000.00));
//		listaEmpregado.add(new Empregado("Marcelo1", 2000.00));
//		listaEmpregado.add(new Empregado("Marcelo2", 3000.00));
//
//		
//		List listaNomes = new ArrayList();
//		listaNomes.add("Manoel");
//		listaNomes.add("Joaquim");
//		listaNomes.add("Maria");
//
//		
//		for (int i=0; i< listaEmpregado.size();i++) {
//				System.out.println( ((Empregado)listaEmpregado.get(i)).getInfo());
//		}
//		
//		for (int i=0; i< listaNomes.size();i++) {
//				System.out.println(listaNomes.get(i));
//		}
		
//		int tamanho = 5;
//		Empregado[] arrayVar;
//		String teste = "Marcelo";
//		String teste2 = "Marcelo";
//		
//		arrayVar = new Empregado[tamanho];
//		
//		for(int i = 0; i < tamanho; i++)
//			arrayVar[i] = new Empregado("Marcelo", 1000.00);
//				
//		if(arrayVar[0] == arrayVar[1])
//			System.out.println("São Iguais");
//		else
//			System.out.println("São diferentes");
//		
//		for(int i = 0; i < arrayVar.length; i++)
//			System.out.println(arrayVar[i].getInfo());
		
//		try {
//			
//			Empregado e = new Empregado("Marcelo", 1000.00);
//			Empregado e1 = new Empregado("Guilherme", 1000.00);
//			Empregado e2 = new Empregado("Luiza", 1000.00);
//			Empregado e3 = new Empregado("Gisele", 1000.00);
//			Empregado e4 = new Empregado("Bruna", 1000.00);//5000
//			
//			Professor p = new Professor("Juan", 2500, 100);
//			Professor p1 = new Professor("Michael", 2300, 80);
//			Professor p2 = null;
//			
//			Relatorio r = new Relatorio();
//			
//			r.adicionarGasto(e);
//			r.adicionarGasto(e1);
//			r.adicionarGasto(e2);
//			r.adicionarGasto(e3);
//			r.adicionarGasto(e4);
//			r.adicionarGasto(p);
//			r.adicionarGasto(p1);
//			r.adicionarGasto(p2);
//			boolean pagamento = false;
//			if(!pagamento)
//				throw new PagamentoException("Caloteiro!");
//			
//			double teste = 10/0;
//		}
//		
//		catch (ClassCastException e) {
//			throw new ClassCastException("Houve uma tentativa de cast de classe inválida");
//		}
//		catch (ArithmeticException e) {
//			throw new ArithmeticException("Houve uma tentativa divisão por 0");
//		}
//		catch (Exception e) {
//			throw new Exception("Houve um problema na execução do programa: ", e);
//		}

		
		
		
		
//		Gerente gerente = new Gerente("Marcelo", "123456", 2000.00, "123");
//
////		funcionario.setCpf(null);
////		funcionario.setNome(null);
////		funcionario.setSalario(0);
//
//		//((Gerente) funcionario).getNome();
//		
//		int numero = (int)2.4;
//		
//		FolhaPagamento folha = new FolhaPagamento();
//		folha.calculaFolhaPagamento(gerente);

	
		
		
//		Gerente gerente = new Gerente("Marcelo", "987.654.321-10", 4000.00, "123456", 3);
//		Assistente assistente = new Assistente("Marcelo", "987.654.321-10", 3000.00);
//		Diretor diretor = new Diretor("Marcelo", "987.654.321-10", 5000.00);
//		Funcionario funcionario = new Funcionario("Marcelo", "987.654.321-10", 1000.00);
//		
//		
//		
//		FolhaPagamento folha = new FolhaPagamento();
//		
//		System.out.println(folha.calculaFolhaPagamento(gerente));
//		System.out.println(folha.calculaFolhaPagamento(assistente));
//		System.out.println(folha.calculaFolhaPagamento(diretor));
//		System.out.println(folha.calculaFolhaPagamento(funcionario));
//		
////		System.out.println(folha.calculaFolhaPagamento(gerente));
////		System.out.println(folha.calculaFolhaPagamento(assistente));
////		System.out.println(folha.calculaFolhaPagamento(diretor));
////		System.out.println(folha.calculaFolhaPagamento(funcionario));
//
		
		
		
		
		
		
////		Funcionario funcionario1 = new Funcionario("Marcelo", "123.456.789-10", 2000.00);
////		System.out.println(funcionario1.toString());
////		
////		Gerente gerente1 = new Gerente("Tiago", "987.654.312-10", 10000.00, "123456", 1);
////		System.out.println(gerente1.toString());
//		
//		ContaPoupanca contaNubia = new ContaPoupanca("Nubia", 2000.00, 0.5);
//		//System.out.println(contaNubia.toString());
//		System.out.println("Saldo atual de " + contaNubia.getTitular() + " : " + contaNubia.getSaldo());
//		System.out.println("Numero de contas: " + contaNubia.getNumContas());
//		
//		Conta contaMatheus = new ContaPoupanca("Matheus", 2000.00, 0.5);
//		System.out.println("Saldo atual de " + contaMatheus.getTitular() + " : " + contaMatheus.getSaldo());
//		System.out.println("Numero de contas: " + contaMatheus.getNumContas());
////		
////		ContaCorrente contaCorrente1 = new ContaCorrente("Jessica", 3000.00, 200.00, 5000.00);
////		//System.out.println(contaCorrente1.toString());
////		
////		ContaPoupanca contaPoupanca1 = new ContaPoupanca("João Mario", 2000.00, 0.5);
////		//System.out.println(contaPoupanca1.toString());
////		
////		ContaPoupancaEspecial contaPoupancaEspecial1 = new ContaPoupancaEspecial("Rafael", 4000.00, 0.5, "Visa");
////		System.out.println(contaPoupancaEspecial1.toString());
////		
////		ContaCorrenteEspecial contaCorrenteEspecial1 = new ContaCorrenteEspecial("Manuela", 5000.00, 200.00, 5000.00, "Master", "Crypto");
////		System.out.println(contaCorrenteEspecial1.toString());
////		
////		contaCorrenteEspecial1.transferir(contaPoupancaEspecial1, 1000.00);
////		
////		System.out.println(contaPoupancaEspecial1.toString());
////		System.out.println(contaCorrenteEspecial1.toString());
////		
//////		contaMatheus.transferir(contaNubia, 500);
//////		
//////		System.out.println("Saldo atual de " + contaNubia.getTitular() + " : " + contaNubia.getSaldo());
//////		System.out.println("Saldo atual de " + contaMatheus.getTitular() + " : " + contaMatheus.getSaldo());
////		
//////		boolean saquei = contaNubia.sacar(1000);
//////		
//////		if(saquei)
//////			System.out.println("Saldo atual: " + contaNubia.saldo);
//////		else
//////			System.out.println("Você não tem saldo suficiente! \n Seu salto é de: " + contaNubia.saldo);
	}

}
