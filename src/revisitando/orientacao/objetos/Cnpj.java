package revisitando.orientacao.objetos;

public class Cnpj {
	private String cnpj;

	
	public boolean cnpjValido(){
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
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpjCredor) {
		this.cnpj = cnpjCredor;
	}

	@Override
	public String toString() {
		return this.cnpj;
	}
}
