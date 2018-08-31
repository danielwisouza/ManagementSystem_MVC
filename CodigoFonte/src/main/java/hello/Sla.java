package hello;
import java.time.LocalDate;

public class Sla {
	private int idSla;
	private LocalDate duracao;	

public Sla(int idSla, LocalDate duracao) {
	this.idSla = idSla;
	this.duracao = duracao;
	}

	public int getIdSla() {
		return idSla;
	}
	public void setIdSla(int idSla) {
		this.idSla = idSla;
	}
	public LocalDate getDuracao() {
		return duracao;
	}
	public void setDuracao(LocalDate duracao) {
		this.duracao = duracao;
	}
	public int getidSla(){
		return idSla;
	}
	public void setidSla(int idSla) {
		this.idSla = idSla;
	}	
	public LocalDate getduracao(){
		return duracao;
	}
	
	public void setduracao(LocalDate duracao){
		this.duracao = duracao;
	}
	
}
