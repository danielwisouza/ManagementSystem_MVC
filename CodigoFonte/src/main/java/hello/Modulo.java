package hello;

public class Modulo {
	@Override
	public String toString() {
		return "Modulo [idModulo=" + idModulo + ", nomeModulo=" + nomeModulo + "]";
	}
	private int idModulo;
	private String nomeModulo;

	
	public Modulo(int idModulo, String nomeModulo) {
		this.idModulo = idModulo;
		this.nomeModulo = nomeModulo;
	}
	public int getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}
	public String getNomeModulo() {
		return nomeModulo;
	}
	public void setNomeModulo(String nomeModulo) {
		this.nomeModulo = nomeModulo;
	}
}

