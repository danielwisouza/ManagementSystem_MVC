package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Modelo modelo;
	
	
	public Controller(Modelo modelo){
		this.modelo = modelo;
	}
	

	public void buscarChamadoNumero() {
		get("/chamado/:numero", (req, res) -> {
			Chamado chamadosEncontrados = modelo.buscarChamadoNumero(Integer.parseInt(req.params(":numero")));	
			return new Gson().toJson(chamadosEncontrados);
		});
	}
	
	public void buscarChamados() {
		get("/listachamados", (req, res) -> {
			List<Chamado> listaChamados = modelo.buscarChamados();	
			return new Gson().toJson(listaChamados);
		});
	}

	public void buscarUsuarios(){
		get("/chamado/usuario/:email", (req, res) -> {
			List<Usuario> usuariosEncontrado = modelo.buscarUsuarios(req.params(":email"));	
			return new Gson().toJson(usuariosEncontrado);
		});
	}
	


}