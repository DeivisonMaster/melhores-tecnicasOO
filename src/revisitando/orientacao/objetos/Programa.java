package revisitando.orientacao.objetos;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		Divida divida1, divida2;
		BalancoEmpresa balanco = new BalancoEmpresa();
		RelatorioDeDivida relatorioDivida;
		
		// REGISTRA DIVIDA
		divida1 = new Divida();
		divida1.setNomeCredor("carlos");
		divida1.getCnpjCredor().setCnpj("222.000.555/0000-1");
		divida1.setTotalDivida(100.0);
		balanco.registraDivida(divida1.getCnpjCredor().getCnpj(), divida1);
		balanco.pagaDivida(divida1.getCnpjCredor().getCnpj(), 990.0, "Andre", "333.000.222/0000-1");
		
		
//		divida2 = new Divida();
//		divida2.setNomeCredor("roberta");
//		divida2.getCnpjCredor().setCnpj("222.000.555/0000-2");
//		divida2.setTotalDivida(200.0);
//		balanco.registraDivida(divida2.getCnpjCredor().getCnpj(), divida2);
//		balanco.pagaDivida(divida2.getCnpjCredor().getCnpj(), 200, "Kátia", "333.000.222/0000-1");
		
		// PESQUISA UMA DIVIDA
		balanco.pesquisaDividaPorChave(divida1.getCnpjCredor().getCnpj());
		
		System.out.println("---------------------------------------------------------------");
		
		relatorioDivida = new RelatorioDeDivida(divida1);
		NumberFormat	formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorioDivida.geraRelatorio(formatador);
		
		
		// PESQUISA PAGAMENTOS
//		List<Pagamento> pagamentos = divida1.getPagamentos();
//		
//		for (Pagamento pagamento : pagamentos) {
//			System.out.println("Nome Pagador: " + pagamento.getNomePagador());
//		}
	}
}
