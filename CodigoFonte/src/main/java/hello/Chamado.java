package hello;

//import java.util.LinkedList;
//import java.util.List;

public class Chamado {
	@Override
	public String toString() {
		return "Chamado [numeroChamado=" + numeroChamado + ", usuarioAbertura=" + usuarioAbertura
				+ ", usuarioResponsavel=" + usuarioResponsavel + ", dataAbertura=" + dataAbertura + ", dataFechamento="
				+ dataFechamento + ", assunto=" + assunto + ", descricao=" + descricao + ", status=" + status
				+ ", prioridade=" + prioridade
				+ "]";
	}

	private int numeroChamado;
	private String usuarioAbertura;
	private String usuarioResponsavel;
	private String dataAbertura;
	private String dataFechamento;
	private String assunto;
	private String descricao;
	private String status;
	//private List<Comentario> comentarios = new LinkedList<Comentario>();
	//private Modulo modulo;
	//private Sla sla;
	private String prioridade;
	
	
	
	
	public Chamado(int numeroChamado, String usuarioAbertura, String usuarioResponsavel, String dataAbertura,
			String dataFechamento, String assunto, String descricao, String status, String prioridade) {
		
		this.numeroChamado = numeroChamado;
		this.usuarioAbertura = usuarioAbertura;
		this.usuarioResponsavel = usuarioResponsavel;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.assunto = assunto;
		this.descricao = descricao;
		this.status = status;
		//this.modulo = modulo;
		//this.sla = sla;
		this.prioridade = prioridade;
	}

    
    
	public void setNumeroChamado(int numeroChamado) {
		this.numeroChamado = numeroChamado;
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

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(String dataFechamento) {
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

	/*public List<Comentario> getComentarios() {
		
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
	}*/

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	//public void addComentario(Comentario comentario) {
    //	comentarios.add(comentario);
    //}
	
	public int getNumeroChamado() { //Serializa o numero do chamado
//		//return 1;
		return numeroChamado;
	}
	
    /*public void alterarComentario(String comentario, int i) {
		for(Comentario com:comentarios) {
			if(com.getNumeroChamado()== i) {
				com.setcomentario(comentario);
			}
		}
	}
   
    public int buscarComentarioUsuario(int i) {
		for(Comentario com:comentarios) {
			if(com.getNumeroChamado()== i) {
			}
		}
		return i;

	}*/
	
}
