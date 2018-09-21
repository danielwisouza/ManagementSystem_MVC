package hello;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class MainServer {
	
	final static Modelo modelo = new Modelo();
	
    public static void main(String[] args) {

		// Get port config of heroku on environment variable
        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 8090;
        }
        port(port);

		//Servir conteudo html, css e javascript
		staticFileLocation("/static");

		inicializarCarros();

		Controller controller = new Controller(modelo);
		
		controller.buscarUsuarios();
		
    }
    
    public static void inicializarCarros(){
    	//model.addCarro(new Carro("AAA-1111", new Especificacao("gol", "vw", "verde")));
    	//model.addCarro(new Carro("BBB-1111", new Especificacao("gol", "vw", "verde")));
    	modelo.addUsuario(new Usuario("Daniel", "Daniel2wis@gmail.com", "Willlians", "123", "ADM"));
}
}
