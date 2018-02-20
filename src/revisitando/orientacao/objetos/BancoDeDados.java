package revisitando.orientacao.objetos;

import java.util.HashMap;
import java.util.Map;

/* Simulando armazenamento no Banco */
public class BancoDeDados implements ArmazenadorDividas{
	private final Map<Documento, Divida>	dividasNoBanco	= new HashMap<>();
	
	public BancoDeDados(String endereco, String usuario, String senha){
		System.out.println("conectado");
	}
	
	public void salva(Divida divida){
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}
	
	public Divida carrega(Documento documentoCredor){
		return dividasNoBanco.get(documentoCredor);
	}
	
	public void desconecta(){
		System.out.println("Desconectado");
	}
}
