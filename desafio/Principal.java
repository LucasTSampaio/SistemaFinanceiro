package desafio;

public class Principal {

	public static void main(String[] args) {
		
		//->> instancias
		
		//fornecedores
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		
		//clientes
		Cliente atacadista = new Cliente();
		atacadista.setNome("Bola Redonda Atacadista");
		Cliente telecom = new Cliente();
		telecom.setNome("TIM Telecomunicações");
		
		//contas a pagar
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/02/2018");
		contaPagar1.setFornecedor(imobiliaria);
		
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "31/01/2018");
		
		//contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em JAVA");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/03/2018");
		contaReceber1.setCliente(atacadista);
		
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d,"13/03/2018");
		
		//pagamento e cancelamento de contas
		contaPagar1.pagar();
		contaPagar2.cancelar();
	
		//recebimento e cancelamento de contas
		contaReceber1.receber();
		contaReceber2.cancelar();
	
		//listagem das contas com detalhamento.
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[] {contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		
		relatorio.exibirListagem(contas);
		
	}
	
}
