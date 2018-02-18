package revisitando.orientacao.objetos;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	Map<String, Divida> dividas = new HashMap<String, Divida>();

	public void registraDivida(String cnpjCredor, Divida divida) {
		dividas.put(cnpjCredor, divida);
	}

	public Map<String, Divida> getDividas() {
		return dividas;
	}
	
	public void pagaDivida(String cnpjCredor, double valorPagamento, String nomePagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);

		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setNomePagador(nomePagador);
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setValor(valorPagamento);
			
			divida.registra(pagamento, divida);
		} else {
			System.out.println("Não há dividas registradas neste CNPJ");
		}
	}

	/* Experts parciais no dominio da informação: A classe Divida e BalancoEmpresa */
	public void pesquisaDividaPorChave(String chave) {
		Divida divida = dividas.get(chave);
		if(divida != null){
			divida.pesquisaDividaPorChave();
			verificaPagamentoEfetuadoDivida(divida);
		}else{
			System.out.println("Não há dividas registradas neste CNPJ");
		}
	}
	
	/* Experts parciais no dominio da informação: A classe Pagamentos e Divida */
	private void verificaPagamentoEfetuadoDivida(Divida divida){
		if(divida.getPagamentos().getValorPago() >= divida.getTotalDivida()){
			System.out.println("Status do Pagamento: Efetuado");
		}else{
			System.out.println("Status do Pagamento: Não efetuado");
		}
	}

}
