package revisitando.orientacao.objetos;

import java.util.Calendar;

public class Pagamento {
	private String nomePagador;
	private String cnpjPagador;
	private double valor;
	private Calendar data;

	public String getNomePagador() {
		return nomePagador;
	}

	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
	}

	public String getCnpjPagador() {
		return cnpjPagador;
	}

	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
	
}
