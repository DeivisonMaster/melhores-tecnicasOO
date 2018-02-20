package revisitando.orientacao.objetos;

/* Armazena em um arquivo */
public class Arquivo implements ArmazenadorDividas{

	@Override
	public void salva(Divida divida) {
		// salva em algum local ...
	}

	@Override
	public Divida carrega(Documento documentoCredor) {
		// busca uma divida em algum local...
		return null;
	}

}
