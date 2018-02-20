package revisitando.orientacao.objetos;

public class Cnpj implements Documento {
	private String valor;

	public Cnpj(String cnpj){
		this.valor = cnpj;
	}
	
	public Cnpj(){
	}
	
	public boolean isValido(){
		return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
				&& segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
	}

	private int primeiroDigitoCorretoParaCnpj() {
		return 0;
	}

	private int primeiroDigitoVerificadorDoCnpj() {
		return 0;
	}

	private int segundoDigitoCorretoParaCnpj() {
		return 0;
	}

	private int segundoDigitoVerificadorDoCnpj() {
		return 0;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String cnpjCredor) {
		this.valor = cnpjCredor;
	}

	@Override
	public String toString() {
		return this.valor;
	}

}
