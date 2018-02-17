package revisitando.orientacao.objetos;

import java.util.ArrayList;
import java.util.Calendar;

public class Pagamentos extends ArrayList<Pagamento>{
	private static final long serialVersionUID = 1L;
	private double valorPago;
	
	
	private void paga(double valor, Divida divida) {
		if (valor >= divida.getTotalDivida()) {
			this.valorPago = valor;
		} else {
			throw new IllegalArgumentException("O valor do pagamento não pode ser inferior ao valor total da Divida");
		}
	}

	public void registra(Pagamento pagamento, Divida divida) {
		this.add(pagamento);
		paga(pagamento.getValor(), divida);
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	public ArrayList<Pagamento>	pagamentosAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento>	pagamentosComValorMaiorQue(double valorMinimo){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getValor() > valorMinimo){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento>	pagamentosDo(String cnpjPagador){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : this) {
			if(pagamento.getCnpjPagador().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
}
