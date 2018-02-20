package revisitando.orientacao.objetos;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Programa {
	public static void main(String[] args) {
		Divida divida1, divida2;
		RelatorioDeDivida relatorioDivida;
		Documento cnpj, cpf;
		BancoDeDados bd = new BancoDeDados("localhost", "adm", "123");
		ArmazenadorDividas arquivo = new Arquivo();
		BalancoEmpresa balanco = new BalancoEmpresa(bd);
		Pagamento pagamento;
		
		// REGISTRA DIVIDA
		divida1 = new Divida();
		divida1.setNomeCredor("carlos");
		cnpj = new Cnpj("222.111.555/0000-1");
		cpf  = new Cpf("032.045.681.13");
		divida1.setDocumentoCredor(cpf);
		divida1.setTotalDivida(100.0);
		
		pagamento = new Pagamento();
		pagamento.setNomePagador("Andre");
		pagamento.setCnpjPagador("333.000.222/0000-1");
		pagamento.setValor(990.0);
		balanco.registraDivida(divida1);
		balanco.pagaDivida(cnpj, pagamento);
		
		// SALVA A DIVIDA EM ALGUM LOCAL
		bd.salva(divida1);
		arquivo.salva(divida1);
		
		
//		divida2 = new Divida();
//		divida2.setNomeCredor("roberta");
//		divida2.getCnpjCredor().setCnpj("222.000.555/0000-2");
//		divida2.setTotalDivida(200.0);
//		balanco.registraDivida(divida2.getCnpjCredor().getCnpj(), divida2);
//		balanco.pagaDivida(divida2.getCnpjCredor().getCnpj(), 200, "Kátia", "333.000.222/0000-1");
		
		// PESQUISA UMA DIVIDA
		balanco.pesquisaDividaPorChave(cnpj);
		
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
