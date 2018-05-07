import java.time.LocalDate;

public class Sla {
	private int idSla;
	private LocalDate duracao;	
	
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
