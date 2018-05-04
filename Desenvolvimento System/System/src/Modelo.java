import java.util.*;

public class Modelo {
	private Administrador administrador;
	private List<Usuario> usuarios;
	private List<Chamado> chamados;
	private List<Sla> slas;
	private List<Prioridade> prioridades;
	private List<Modulo> modulos;
	
	public Usuario login(String username, String password) {
		Usuario usuario = new Usuario();
		return usuario;
	}
	
	public void addUsuario(Usuario usuario) {
		
	}
	
	public void alterarUsuario(Usuario usuario) {
		
	}
	
	public List<Usuario> buscarUsuarios(String nome) {
		List<Usuario> usuarios = (List<Usuario>) new Usuario();
		return usuarios;
	}
	
	public void addChamado(Chamado chamado) {
		
	}
	
	public void alterarChamado(Chamado chamado) {
		
	}
	
	public void alterarResponsavel(String usuarioResponsavel) {
		
	}
	
	public Chamado buscarChamado(int numeroChamado) {
		Chamado chamado = new Chamado();
		return chamado;
	}
	
	public List<Chamado> buscarChamadoResponsavel(String usuarioResponsavel) {
		List<Chamado> chamados = (List<Chamado>) new Chamado();
		return chamados;
	}
	
	public void enviarEmail(Usuario usuario, Chamado chamado) {
		
	}
}

