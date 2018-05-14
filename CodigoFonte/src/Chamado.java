import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Chamado {
	private int numeroChamado;
	private String usuarioAbertura;
	private String usuarioResponsavel;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String assunto;
	private String descricao;
	private String status;
	private List<Comentario> comentarios;
	private Modulo modulo;
	private Sla sla;
	private Prioridade prioridade;
	
	
	
	
	public Chamado(int numeroChamado, String usuarioAbertura, String usuarioResponsavel, LocalDate dataAbertura,
			LocalDate dataFechamento, String assunto, String descricao, String status, Modulo modulo, Sla sla, Prioridade prioridade) {
		
		this.numeroChamado = numeroChamado;
		this.usuarioAbertura = usuarioAbertura;
		this.usuarioResponsavel = usuarioResponsavel;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.assunto = assunto;
		this.descricao = descricao;
		this.status = status;
		this.comentarios = new LinkedList<Comentario>();
		this.modulo = modulo;
		this.sla = sla;
		this.prioridade = prioridade;
	}

//Trabalhando Com Comentario 
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void alterarComentario(int numero, String descricao) {
		for(Comentario comentario:comentarios){
			if(chamado.getNumeroChamado()== numero){
				chamado.setDescricao(descricao);
			}
		}
	}
	
	
	public void addModulo(Modulo modulo) {
		
	}
	
	public void addPrioridade(Prioridade prioridade) {
		
	}
	
	public void addSla(Sla sla) {
		
	}
	
	public int getNumeroChamado() { //Serializa o numero do chamado
		return 1;
	}
	
	public void setNumeroChamado(int numero) {
		
	}

	public String getUsuarioAbertura() {
		return usuarioAbertura;
	}

	public void setUsuarioAbertura(String usuarioAbertura) {
		this.usuarioAbertura = usuarioAbertura;
	}

	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public Sla getSla() {
		return sla;
	}

	public void setSla(Sla sla) {
		this.sla = sla;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	
}
