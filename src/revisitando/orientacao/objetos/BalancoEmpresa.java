package revisitando.orientacao.objetos;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	private Map<Documento, Divida> dividas = new HashMap<Documento, Divida>();

	public void registraDivida(Divida divida) {
		dividas.put(divida.getDocumentoCredor(), divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.get(documentoCredor);

		if (divida != null) {
			divida.registra(pagamento, divida);
		} else {
			System.out.println("Não há dividas registradas neste Documento");
		}
	}

	/*
	 * Experts parciais no dominio da informação: A classe Divida e
	 * BalancoEmpresa
	 */
	public void pesquisaDividaPorChave(Documento documentoCredor) {
		Divida divida = dividas.get(documentoCredor);
		if (divida != null) {
			divida.pesquisaDividaPorChave();
			verificaPagamentoEfetuadoDivida(divida);
		} else {
			System.out.println("Não há dividas registradas neste Documento");
		}
	}

	/*
	 * Experts parciais no dominio da informação: A classe Pagamentos e Divida
	 */
	private void verificaPagamentoEfetuadoDivida(Divida divida) {
		if (divida.getPagamentos().getValorPago() >= divida.getTotalDivida()) {
			System.out.println("Status do Pagamento: Efetuado");
		} else {
			System.out.println("Status do Pagamento: Não efetuado");
		}
	}

	public Map<Documento, Divida> getDividas() {
		return dividas;
	}

	
}
