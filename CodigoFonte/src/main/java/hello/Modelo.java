package hello;
import java.util.LinkedList;
import java.util.List;

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
	ObjectContainer chamados = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "bd/chamados.db4o");

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
	
	public boolean addUsuario(Usuario Usuario){
		if(isUsuarioUserAvailable(Usuario.getEmail())){
			
			this.Usuario.store(Usuario);
			this.Usuario.commit();
			
			return true;
		}
		
		return false; 
	}
	
	
	private boolean isUsuarioUserAvailable(String email) {
		Query query = Usuario.query();
		query.constrain(Usuario.class);
	    ObjectSet<Usuario> allUsuario = query.execute();
	    
	    for(Usuario Usuario:allUsuario){
	    	if(Usuario.getEmail().equals(email)) return false;
	    }
	    
	    return true;
	}
	
	public List<Usuario> listarUsuarios() {
		List<Usuario> listaUsuario = new LinkedList<Usuario>();
		
		Query query = Usuario.query();
		query.constrain(Usuario.class);
	    ObjectSet<Usuario> allUsuario = query.execute();
	    
	    for(Usuario Usuario:allUsuario){
	    	listaUsuario.add(Usuario);
	    }
	    
	    return listaUsuario;
	}
	
	public Usuario BuscaUsuarioEmail(String EmailBusca){
		
		
		Query query = Usuario.query();
		query.constrain(Usuario.class);
	    ObjectSet<Usuario> allUsuario = query.execute();
		
	    for(Usuario Usuario:allUsuario){
	    	if(Usuario.getEmail()==EmailBusca){
	    		return Usuario;
	    	}
	    }
	    return null;
	}
	
	
	//Arrumando para tela de Login gerenciavel
	
	public Usuario login(String username, String password){
		
		Query query = Usuario.query();
		query.constrain(Usuario.class);
	    ObjectSet<Usuario> allUsuario = query.execute();
	    
	    for(Usuario Usuario:allUsuario){
	    	if(Usuario.getEmail().equals(username) && Usuario.getPassword().equals(password)){
	    		
	    		return Usuario;
	    	}
	    	
	    }
	    
	    return null;
	}
	// Adicionando Chamado
		public boolean addChamado(Chamado chamado){
			if(isChamadoAvailable(chamado.getNumeroChamado())){
				chamados.store(chamado);
				chamados.commit();
				return true;
			}
			return false;
		}
		
		public boolean isChamadoAvailable(int numero){
			Query query = chamados.query();
			query.constrain(Chamado.class);
		    ObjectSet<Chamado> allChamados = query.execute();
		    for(Chamado chamado:allChamados){
		    	if(chamado.getNumeroChamado()==numero) return false;
		    }
		    return true;
		}
		
		// Buscando chamado pelo ID
		public Chamado buscarChamadoNumero(int numero){
			Query query = chamados.query();
			query.constrain(Chamado.class);
		    ObjectSet<Chamado> allChamados = query.execute();
		    for(Chamado chamado:allChamados){
		    	if(chamado.getNumeroChamado()==numero){
		    		return chamado;
		    	}
		    }
		    return null;
		}
		 
		//Listando Chamados
		public List<Chamado> listarChamados() {
			List<Chamado> listaChamados = new LinkedList<Chamado>();
			
			Query query = Usuario.query();
			query.constrain(Chamado.class);
		    ObjectSet<Chamado> allChamado = query.execute();
		    
		    for(Chamado Chamado:allChamado){
		    	listaChamados.add(Chamado);
		    }
		    
		    return listaChamados;
		}
}
