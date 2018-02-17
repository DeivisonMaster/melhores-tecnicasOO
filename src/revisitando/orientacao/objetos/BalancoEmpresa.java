package revisitando.orientacao.objetos;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	Map<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(String cnpjCredor, Divida divida) {
		// Divida divida = new Divida();
		//
		// divida.setNomeCredor(nomeCredor);
		// divida.setCnpjCredor(cnpjCredor);
		// divida.setTotalDivida(valor);

		dividas.put(cnpjCredor, divida);
	}

	public void pagaDivida(String cnpjCredor, double valorPagamento, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);

		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setNomePagador(nomePagador);
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setValor(valorPagamento);
			
			divida.getPagamentos().registra(pagamento, divida);
		} else {
			System.out.println("Não há dividas registradas neste CNPJ");
		}
	}

	public Map<String, Divida> getDividas() {
		return dividas;
	}

	public void pesquisaDividaPorChave(String chave) {
		Divida divida = dividas.get(chave);
		if(divida != null){
			System.out.println(
					"Nome Credor: " + divida.getNomeCredor() + "\n"
					+ "CNPJ Credor: " + divida.getCnpjCredor().getCnpj() + "\n"
					+ "Total Divida: " + divida.getTotalDivida());
			
			verificaPagamentoDivida(divida);
		}else{
			System.out.println("Não há dividas registradas neste CNPJ");
		}
	}
	
	private void verificaPagamentoDivida(Divida divida){
		if(divida.getPagamentos().getValorPago() >= divida.getTotalDivida()){
			System.out.println("Pagamento efetuado");
		}else{
			System.out.println("Pagamento não efetuado");
		}
	}

}
