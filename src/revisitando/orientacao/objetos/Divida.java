package revisitando.orientacao.objetos;

public class Divida {
	private String nomeCredor;
	private Cnpj cnpjCredor;
	private double totalDivida;
	private Pagamentos pagamentos;

	
	public Divida() {
		this.cnpjCredor = new Cnpj();
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

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

}
