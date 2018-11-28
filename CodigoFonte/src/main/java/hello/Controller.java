package hello;

import static spark.Spark.get;
import static spark.Spark.post;

import java.util.LinkedList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

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

        		jsonObj.put("nome33", 0);
        		
        		
             	jsonResult.put(jsonObj);
             	
             	return jsonResult;
	            
	     	     
	         }
	         
	      });
			

	}
	
	public void usuarios() {
		
		get("/usuarios", (req, res) -> {
			List<Usuario> listaUsuario = new LinkedList<Usuario>();
			listaUsuario = modelo.listarUsuarios();
		    return new Gson().toJson(listaUsuario);
		});
		
		post("/usuarios", (request, response) -> {
			
		    response.type("application/json");
		    Usuario usuario = new Gson().fromJson(request.body(), Usuario.class);
		    Boolean ret = modelo.addUsuario(usuario);
		    
		    String json_str = "{\"success\":\""+ ret.toString() +"\"}";
		 
		    return new Gson().toJson(json_str);
		});
	}
	
	public void chamados() {
		
		get("/chamados", (req, res) -> {
			List<Chamado> listaChamados = new LinkedList<Chamado>();
			listaChamados = modelo.listarChamados();
		    return new Gson().toJson(listaChamados);
		});
		
		post("/chamados", (request, response) -> {
			
		    response.type("application/json");
		    Chamado chamado = new Gson().fromJson(request.body(), Chamado.class);
		    Boolean ret = modelo.addChamado(chamado);
		    
		    String json_str = "{\"success\":\""+ ret.toString() +"\"}";
		 
		    return new Gson().toJson(json_str);
		});
	}


}