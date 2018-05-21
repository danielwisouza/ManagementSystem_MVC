import java.util.LinkedList;
import java.util.List;

public class Modelo {
	private Administrador administrador;
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private List<Chamado> chamados = new LinkedList<Chamado>();
	private List<Sla> slas = new LinkedList<Sla>();
	private List<Prioridade> prioridades = new LinkedList<Prioridade>();
	private List<Modulo> modulos = new LinkedList<Modulo>();

// Gets e sets
	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	public List<Sla> getSlas() {
		return slas;
	}

	public void setSlas(List<Sla> slas) {
		this.slas = slas;
	}

	public List<Prioridade> getPrioridades() {
		return prioridades;
	}

	public void setPrioridades(List<Prioridade> prioridades) {
		this.prioridades = prioridades;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	
	
//	public Usuario login(String username, String password) {
//		Usuario usuario = new Usuario();
//		return usuario;
//	}
	

	
	public void alterarUsuario(Usuario usuario) {
		
	}
	
	public List<Usuario> buscarUsuarios(String nome) {
		List<Usuario> usuariosRetorno = new LinkedList<Usuario>();
		//return usuarios;
		for(Usuario usuario:usuarios){
			if(usuario.getNome().equals(nome)){
				usuariosRetorno.add(usuario);
			}
		}
		
		return usuariosRetorno;
	}
	
	public void addChamado(Chamado chamado) {
		chamados.add(chamado);
	}
	//alterar descrição do chamado
	public void alterarDescricaoChamado(int numero, String descricao) {
		for(Chamado chamado:chamados){
			if(chamado.getNumeroChamado()== numero){
				chamado.setDescricao(descricao);
			}
		}
	}
	//alterar o responsável do chamado
	public void alterarResponsavel(int numero, String usuarioResponsavel) {
		for(Chamado chamado:chamados){
			if(chamado.getNumeroChamado()== numero){
				chamado.setUsuarioResponsavel(usuarioResponsavel);
			}
		}		
	}
	
	public void enviarEmail(Usuario usuario, Chamado chamado) {
		
	}
	
	public void addUsuario(Usuario usu){
		usuarios.add(usu);
	}
}

