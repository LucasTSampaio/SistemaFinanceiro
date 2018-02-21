package desafio;

public class ContaPagar extends Conta{
	
	private Fornecedor fornecedor;
	
	ContaPagar(){
		
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento ){
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento) ;
	}

	//metodos
	
	public void exibirDetalhes() {
		System.out.println("---=== DETALHES DA CONTA ===---");
		System.out.println("DESCRIÇÃO DA CONTA: " +this.getDescricao());
		System.out.println("VALOR: " +this.getValor());
		System.out.println("DATA DE VENCIMENTO: " +this.getDataVencimento());
		System.out.println("FORNECEDOR: " + this.getFornecedor().getNome());
		System.out.println("SITUAÇÃO ATUAL: " +this.getSituacaoConta());
	}; 
	
	public void pagar() {
		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta()) || SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("[ERROR - Conta: " +this.getDescricao()+ " CANCELADA ou PAGA.]");
		} else {
		System.out.println("*************************************");
		System.out.println("DESCRIÇÃO DA CONTA: " +this.getDescricao());
		System.out.println("VALOR: " +this.getValor());
		System.out.println("DATA DE VENCIMENTO: " +this.getDataVencimento());
		System.out.println("FORNECEDOR: " + this.getFornecedor().getNome());
		

		this.situacaoConta = SituacaoConta.PAGA;
		
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
	
}
