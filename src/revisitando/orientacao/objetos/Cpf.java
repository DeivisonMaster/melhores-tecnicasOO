package revisitando.orientacao.objetos;

public class Cpf implements Documento {
	private String valor;
	
	public Cpf(String cpf){
		this.valor = cpf;
	}

	public boolean isValido() {
		return primeiroDigitoVerificadorDoCpf() == primeiroDigitoCorretoParaCpf()
				&& segundoDigitoVerificadorDoCpf() == segundoDigitoCorretoParaCpf();
	}

	private int primeiroDigitoCorretoParaCpf() {
		return 0;
	}

	private int primeiroDigitoVerificadorDoCpf() {
		return 0;
	}

	private int segundoDigitoCorretoParaCpf() {
		return 0;
	}

	private int segundoDigitoVerificadorDoCpf() {
		return 0;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String cpf) {
		this.valor = cpf;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
}
