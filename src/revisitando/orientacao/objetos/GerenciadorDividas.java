package revisitando.orientacao.objetos;

public class GerenciadorDividas {
	
	public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador){
		Pagamento pagamento = new Pagamento();
		pagamento.setNomePagador(nomePagador);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setValor(valor);
		
		divida.getPagamentos().registra(pagamento, divida);
	}
}
