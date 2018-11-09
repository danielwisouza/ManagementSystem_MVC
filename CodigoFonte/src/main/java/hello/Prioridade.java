package hello;

public class Prioridade {
	@Override
	public String toString() {
		return "Prioridade [idPrioridade=" + idPrioridade + ", criticidade=" + criticidade + "]";
	}
	private int idPrioridade;
	private String criticidade;
	
	public Prioridade(int idPrioridade, String criticidade) {
		this.idPrioridade = idPrioridade;
		this.criticidade = criticidade;
	}
	public int getIdPrioridade() {
		return idPrioridade;
	}
	public void setIdPrioridade(int idPrioridade) {
		this.idPrioridade = idPrioridade;
	}
	public String getCriticidade() {
		return criticidade;
	}
	public void setCriticidade(String criticidade) {
		this.criticidade = criticidade;
	}
}
