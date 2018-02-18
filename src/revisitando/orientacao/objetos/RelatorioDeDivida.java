package revisitando.orientacao.objetos;

import java.text.NumberFormat;

public class RelatorioDeDivida {
	private Divida divida;

	public RelatorioDeDivida(Divida divida){
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat	formatador){
		System.out.println("CNPJ Credor: " + divida.getCnpjCredor().getCnpj());
		System.out.println("Credor: " + divida.getCnpjCredor());
		
		System.out.println("Valor da Divida: " + formatador.format(divida.getTotalDivida()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
	
}
