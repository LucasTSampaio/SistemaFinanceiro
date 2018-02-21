package desafio;

public class ContaReceber extends Conta{
	
	private Cliente cliente;
	
	ContaReceber(){
		
	}
	
	ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento){
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	//metodos
	
	public void exibirDetalhes() {
		System.out.println("---=== DETALHES DA CONTA ===---");
		System.out.println("DESCRIÇÃO DA CONTA: " +this.getDescricao());
		System.out.println("VALOR: " +this.getValor());
		System.out.println("DATA DE VENCIMENTO: " +this.getDataVencimento());
		System.out.println("CLIENTE: " +this.getCliente().getNome());
		System.out.println("SITUAÇÃO ATUAL: " +this.getSituacaoConta());
	}; 
	
	public void receber() {
		System.out.println("Conta: " +getDescricao()+ " - Recebida com Sucesso!");
	}
	
	@Override
	public void cancelar() {
		
		if (getValor() > 50000) {
			System.out.println("[ERRO - Conta: " +getDescricao()+ " superior a R$ 50.000.]");
		} else {
			System.out.println("Conta: " +getDescricao()+ " cancelada com SUCESSO!");
			this.situacaoConta = situacaoConta.CANCELADA;
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
