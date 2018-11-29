package hello;

public class Administrador {
	private String username;
	private String password;
	
// Construtor	
public Administrador(String username, String password) {
	this.username = username;
	this.password = password;
}
	
@Override
public String toString() {
	return "Administrador [username=" + username + ", password=" + password + "]";
}

	// Gets e sets
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
	
}