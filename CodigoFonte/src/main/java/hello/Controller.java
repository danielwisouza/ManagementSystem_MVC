package hello;

import static spark.Spark.get;

import com.google.gson.Gson;

public class Controller {
	
	private Modelo modelo;
	
	
	public Controller(Modelo modelo){
		this.modelo = modelo;
	}

	public void buscarChamado(){
		get("/chamado/:numeroChamado", (req, res) -> {
			Chamado chamadosEncontrado = modelo.buscarChamado(req.params(":numeroChamado"));
			return new Gson().toJson(chamadosEncontrado);
		});
	}
}
