package revisitando.orientacao.objetos;

import java.text.NumberFormat;

public class RelatorioDeDivida {
	private Divida divida;

	public RelatorioDeDivida(Divida divida){
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat	formatador){
		System.out.println("Documento Credor: " + divida.getDocumentoCredor().getValor());
		System.out.println("Credor: " + divida.getDocumentoCredor().getValor());
		
		System.out.println("Valor da Divida: " + formatador.format(divida.getTotalDivida()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
	
}
