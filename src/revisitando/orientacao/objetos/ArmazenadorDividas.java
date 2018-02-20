package revisitando.orientacao.objetos;

public interface ArmazenadorDividas {
	
	void salva(Divida divida);
	
	Divida carrega(Documento documentoCredor);
}
