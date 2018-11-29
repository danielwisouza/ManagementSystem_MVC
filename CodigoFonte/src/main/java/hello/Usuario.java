package hello;

public class Usuario {
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", tipoUsuario=" + tipoUsuario + "]";
	}
	private String nome;
	private String email;
	private String username;
	private String password;
	private String tipoUsuario;
	
	
public Usuario(String nome, String email, String username, String password, String tipoUsuario) {
	this.nome = nome;
	this.email = email;
	this.username = username;
	this.password = password;
	this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}

