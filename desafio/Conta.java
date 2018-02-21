package desafio;

public abstract class Conta {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	Conta() {
		this.situacaoConta = situacaoConta.PEDENTE;
	}
	
	public abstract void exibirDetalhes(); 
	
	public void cancelar() {
		if(situacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			System.out.println("-> Conta: " +getDescricao()+ " já está cancelada.");
		}else if (situacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("-> Conta: " +getDescricao()+ " já está paga.");
		} else {
		System.out.println("-> Conta: " +getDescricao()+ " CANCELADA com sucesso!");
		this.situacaoConta = situacaoConta.CANCELADA;
		}
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	
	
}
