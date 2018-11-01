package hello;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class Modelo {
	ObjectContainer Administrador = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Administrador.db4o");
	ObjectContainer Usuario = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Usuario.db4o");
	ObjectContainer Sla = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Sla.db4o");
	ObjectContainer Prioridade = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Prioridade.db4o");
	ObjectContainer Modulo = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/Modulo.db4o");

	public boolean addAdministrador(Administrador Administrador){
		if(isAdministradorUserAvailable(Administrador.getUsername())){
			
			this.Administrador.store(Administrador);
			this.Administrador.commit();
			
			return true;
		}
		
		return false;
	}	
	
	private boolean isAdministradorUserAvailable(String username) {
		Query query = Administrador.query();
		query.constrain(Administrador.class);
	    ObjectSet<Administrador> allAdministrador = query.execute();
	    
	    for(Administrador Administrador:allAdministrador){
	    	if(Administrador.getUsername().equals(username)) return false;
	    }
	    
	    return true;
	}

//	public Administrador getAdministrador() {
//		return administrador;
//	}
//
//	public void setAdministrador(Administrador administrador) {
//		this.administrador = administrador;
//	}
//
//	public List<Usuario> getUsuarios() {
//		return usuarios;
//	}
//
//	public void setUsuarios(List<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}
//
//	public List<Chamado> getChamados() {
//		return chamados;
//	}
//
//	public void setChamados(List<Chamado> chamados) {
//		this.chamados = chamados;
//	}
//
//	public List<Sla> getSlas() {
//		return slas;
//	}
//
//	public void setSlas(List<Sla> slas) {
//		this.slas = slas;
//	}
//
//	public List<Prioridade> getPrioridades() {
//		return prioridades;
//	}
//
//	public void setPrioridades(List<Prioridade> prioridades) {
//		this.prioridades = prioridades;
//	}
//
//	public List<Modulo> getModulos() {
//		return modulos;
//	}
//
//	public void setModulos(List<Modulo> modulos) {
//		this.modulos = modulos;
//	}
//	
//	public Usuario alterarUsuario(Usuario usuario) {
//		Usuario usuarioAlterado = usuario;
//		for(Usuario usuarioBusca:usuarios){
//			//Altera os dados do usuario de acordo com o username
//			if(usuarioBusca.getUsername().equals(usuario.getUsername())){
//				usuarioBusca.setNome(usuario.getNome());
//				usuarioBusca.setEmail(usuario.getEmail());
//				usuarioBusca.setUsername(usuario.getUsername());
//				usuarioBusca.setPassword(usuario.getPassword());
//				usuarioBusca.setTipoUsuario(usuario.getTipoUsuario());
//				
//				usuarioAlterado = usuarioBusca;
//				return usuarioAlterado;
//			}
//		}
//		
//		return usuario;
//	}
//	
//	public List<Usuario> buscarUsuarios(String email) {
//		List<Usuario> usuariosRetorno = new LinkedList<Usuario>();
//		//return usuarios;
//		for(Usuario usuario:usuarios){
//			if(usuario.getEmail().equals(email)){
//				usuariosRetorno.add(usuario);
//			}
//		}
//		
//		return usuariosRetorno;
//	}
//	
//
//	public void addChamado(Chamado chamado) {
//		chamados.add(chamado);
//	}	
//	
//	//alterar descricao do chamado
//	public void alterarDescricaoChamado(int numero, String descricao) {
//		for(Chamado chamado:chamados){
//			if(chamado.getNumeroChamado()== numero){
//				chamado.setDescricao(descricao);
//			}
//		}
//	}
//	//alterar o responsavel do chamado
//	public void alterarResponsavel(int numero, String usuarioResponsavel) {
//		for(Chamado chamado:chamados){
//			if(chamado.getNumeroChamado()== numero){
//				chamado.setUsuarioResponsavel(usuarioResponsavel);
//			}
//		}		
//	}
//	
//	public void enviarEmail(Usuario usuario, Chamado chamado) {
//		
//	}
//	
//	public void addUsuario(Usuario usu){
//		usuarios.add(usu);
//	}
//	
//    public void addSla(Sla sla){
//    	slas.add(sla);
//    }
//    
//    public void addPrioridade(Prioridade prioridade){
//    	prioridades.add(prioridade);
//    }
//    
//    public void addModulo(Modulo modulo){
//    	modulos.add(modulo);
//    }
//
//	public int listarChamadosAbertos(String Status){
//		return 0;
//	}
//	
//	public int listarChamadosFechados(String Status){
//		return 0;
//	}
//	
//	public int listarChamadosUsuario(String Usuario){
//		return 0;
//	}
//	
//	public List<Chamado> buscarChamados() {
//		List<Chamado> listaChamados = new LinkedList<Chamado>();
//		for(Chamado Cha:chamados){
//			listaChamados.add(Cha);
//		}
//		return listaChamados;
//	}
//
//	public Chamado buscarChamadoNumero(int numero){
//		for(Chamado Cha:chamados){
//			if(Cha.getNumeroChamado()==(numero)) return Cha;
//		}
//		return null;
//	}
//	
}
