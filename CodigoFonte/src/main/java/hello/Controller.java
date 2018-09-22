package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller {
	
	private Modelo modelo;
	
	
	public Controller(Modelo modelo){
		this.modelo = modelo;
	}
	
//	public void buscarCarro(){
//		get("/carro/:modelo/:marca/:cor", (req, res) -> {
//		
//			Especificacao espec = new Especificacao(req.params(":modelo"), req.params(":marca"), req.params(":cor"));	
//			List<Carro> carrosEncontrados = model.buscarEspecificacao(espec);	
//			return new Gson().toJson(carrosEncontrados);
//			
//		});
//	}
//	
	public void buscarChamadoNumero() {
		get("/chamado/:numero", (req, res) -> {
			Chamado chamadosEncontrados = modelo.buscarChamadoNumero(req.params(":numero"));
			//Chamado chamadosEncontrado = modelo.buscarChamadoNumero(req.params(":numero"));	
			return new Gson().toJson(chamadosEncontrados);
		});
	}
//	public void buscarCarroPlaca(){
//		get("/carro/:placa", (req, res) -> {
//		
//			
//			Carro carrosEncontrado = model.buscarPlaca(req.params(":placa"));	
//			return new Gson().toJson(carrosEncontrado);
//			
//		});
//	}
//	
	public void buscarUsuarios(){
		get("/chamado/usuario/:email", (req, res) -> {
			List<Usuario> usuariosEncontrado = modelo.buscarUsuarios(req.params(":email"));	
			return new Gson().toJson(usuariosEncontrado);
		});
	}
	


}