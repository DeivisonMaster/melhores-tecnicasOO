package revisitando.orientacao.objetos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Divida {
	private String nomeCredor;
	private String cnpjCredor;
	private double totalDivida;
	private double valorPago;
	private List<Pagamento> pagamentos;

	public Divida() {
		this.pagamentos = new ArrayList<Pagamento>();
	}

	
	public ArrayList<Pagamento>	pagamentosAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento>	pagamentosComValorMaiorQue(double valorMinimo){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if(pagamento.getValor() > valorMinimo){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento>	pagamentosDo(String cnpjPagador){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this.pagamentos) {
			if(pagamento.getCnpjPagador().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public double getTotalDivida() {
		return totalDivida;
	}

	public void setTotalDivida(double total) {
		this.totalDivida = total;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String credor) {
		this.nomeCredor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	private void paga(double valor) {
		if (valor >= this.totalDivida) {
			this.valorPago = valor;
		} else {
			throw new IllegalArgumentException("O valor do pagamento não pode ser inferior ao valor total da Divida");
		}
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		paga(pagamento.getValor());
	}

}
