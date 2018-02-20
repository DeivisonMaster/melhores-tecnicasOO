package revisitando.orientacao.objetos;

public class Divida {
	private String nomeCredor;
	private Documento documentoCredor;
	private double totalDivida;
	private Pagamentos pagamentos;

	public Divida() {
		this.pagamentos = new Pagamentos();
	}

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public double getTotalDivida() {
		return totalDivida;
	}

	public void setTotalDivida(double total) {
		this.totalDivida = total;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String credor) {
		this.nomeCredor = credor;
	}

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

	// Diminuindo o acoplamento da classe BalancoEmpresa e GerenciadorDeDividas
	public void registra(Pagamento pagamento, Divida divida) {
		this.pagamentos.registra(pagamento, divida);
	}

	public void pesquisaDividaPorChave() {
		System.out.println("Nome Credor: " + this.nomeCredor + "\n" + "CNPJ Credor: " + this.documentoCredor.getValor()
				+ "\n" + "Total Divida: " + this.totalDivida);
	}

	public double getValorPago() {
		return this.pagamentos.getValorPago();
	}

}
