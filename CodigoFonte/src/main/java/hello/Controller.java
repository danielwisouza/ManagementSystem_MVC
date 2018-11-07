package hello;

import static spark.Spark.get;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import spark.Request;
import spark.Response;
import spark.Route;


public class Controller {
	
	private Modelo modelo;
	
	public Controller(Modelo store){
		this.modelo = store;
	}
		
	public void getLogin(){
		
		get("/login/:username/:password", new Route() {
			@Override
            public Object handle(final Request request, final Response response){
	        	
	        	response.header("Access-Control-Allow-Origin", "*");
	        	 
	            try {
	            	Usuario Usuario = modelo.login(request.params(":username"), request.params(":password"));
	            	
	            	if(Usuario != null){
	            		
	            		JSONArray jsonResult = new JSONArray();
		         	    JSONObject jsonObj = new JSONObject();

		        		jsonObj.put("nome", Usuario.getNome());
		        		jsonObj.put("e-mail", Usuario.getEmail());
		        		jsonObj.put("tipo", Usuario.getTipoUsuario());
		        		
		             	jsonResult.put(jsonObj);
		             	
		             	return jsonResult;
	            		
	            	} else {
	            		
	
	            	}
	            	

	        		} catch (JSONException e) {
	        				
	        			//e.printStackTrace();

	        		}
	         	    	
	
	            JSONArray jsonResult = new JSONArray();
         	    JSONObject jsonObj = new JSONObject();

        		jsonObj.put("nome", 0);
        		
        		
             	jsonResult.put(jsonObj);
             	
             	return jsonResult;
	            
	     	     
	         }
	         
	      });
			

	}
//	public void buscarChamadoNumero() {
//		get("/chamado/:numero", (req, res) -> {
//			Chamado chamadosEncontrados = modelo.buscarChamadoNumero(Integer.parseInt(req.params(":numero")));	
//			List<Chamado> listaChamado = new LinkedList<Chamado>();
//			listaChamado.add(chamadosEncontrados);
//			return new Gson().toJson(listaChamado);
//		});
//	}
	
//	public void buscarChamados() {
//		get("/listachamados", (req, res) -> {
//			List<Chamado> listaChamados = modelo.buscarChamados();	
//			return new Gson().toJson(listaChamados);
//		});
//	}

//	public void buscarUsuarios(){
//		get("/chamado/usuario/:email", (req, res) -> {
//			List<Usuario> usuariosEncontrado = modelo.buscarUsuarios(req.params(":email"));	
//			return new Gson().toJson(usuariosEncontrado);
//		});
//	}
//	


}