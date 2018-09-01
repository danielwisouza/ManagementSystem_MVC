package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Modelo modelo;
	
	
	public Controller(Modelo modelo){
		this.modelo = modelo;
	}

	public void buscarChamado(){
		get("/chamado/:numeroChamado", (req, res) -> {
		
			
			List<Chamado> chamadosEncontrado = modelo.(req.params(":numeroChamado"));	
			return new Gson().toJson(chamadosEncontrado);
			
		});
	}
	
	

}
