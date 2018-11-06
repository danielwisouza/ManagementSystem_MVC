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
		// Teste com git
		inicializarDados();

		Controller controller = new Controller(modelo);
		
//		controller.buscarUsuarios();
//		controller.buscarChamadoNumero();
//		controller.buscarChamados();
//		
    }
    
    public static void inicializarDados(){
//    	modelo.addUsuario(new Usuario("Daniel", "daniel@gmail.com", "Willlians", "123", "ADM"));
//    	modelo.addUsuario(new Usuario("Thais", "thais@gmail.com", "Bitencourt", "123", "ADM"));
//    	modelo.addUsuario(new Usuario("Ariene", "ariene@gmail.com", "Maiara", "123", "ADM"));
//    	modelo.addChamado(new Chamado(1, "joao@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta"))); 
//    	modelo.addChamado(new Chamado(2, "daniel@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta"))); 
//    	modelo.addChamado(new Chamado(3, "thais@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta"))); 
//    	
//    	modelo.addModulo(new Modulo(133, "Administrador"));
//    	modelo.addModulo(new Modulo(134, "Analista"));
//    	modelo.addModulo(new Modulo(135, "Padrao"));
    	
    }
}