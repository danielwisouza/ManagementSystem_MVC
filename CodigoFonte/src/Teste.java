//import static org.junit.Assert.*;
//import java.util.LinkedList;
//import java.util.List;
//
//import java.security.GeneralSecurityException;
//import java.time.LocalDate;
//import java.time.Month;
//
//import org.junit.Test;
//
//public class Teste {
//
//	@Test
//	public void test() {
//		
//		Modelo modelo = new Modelo();
//		
//		//Lista Vazia de Chamados
//		assertEquals(modelo.getChamados().size(), 0);
//		
//		//Cadastrando Chamado
//		modelo.addChamado(new Chamado(1, "joao@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta")));
//		
//		//Um chamado encontrado
//		assertEquals(modelo.getChamados().size(), 1);
//		
//		//Buscando chamado por Descrição
//		assertEquals(modelo.getChamados().get(0).getDescricao(), "problema");
//		
//		//Alterando descrição do Chamado
//		modelo.alterarDescricaoChamado(1, "problema muito grande");
//		
//		//Verificando alteração da descrição do chamado 
//		assertEquals(modelo.getChamados().get(0).getDescricao(), "problema muito grande");
//		
//		//Buscando Responsável pelo chamado
//		assertEquals(modelo.getChamados().get(0).getUsuarioResponsavel(), "maria@gmail.com");
//		
//		//Alterando responsável do chamado
//		modelo.alterarResponsavel(1, "jose@gmail.com");
//		
//		//Verificando alteração do responsável pelo chamado 
//		assertEquals(modelo.getChamados().get(0).getUsuarioResponsavel(), "jose@gmail.com");
//
//		// Cadastrando Usuário no Sistema
//		modelo.addUsuario(new Usuario("ariene", "email", "username", "password", "tipoUsuario"));
//		
//		//Buscando usuário por nome
//		List<Usuario> listaUsuario = modelo.buscarUsuarios("ariene");
//		
//		//Buscando usuário por E-mail
//		assertEquals(listaUsuario.get(0).getEmail(), "email");
//		
//		// Cadastrando Sla, Modulo e Prioridade
//		modelo.addSla(new Sla(1, LocalDate.of(2018, Month.MAY, 11)));
//		modelo.addModulo(new Modulo(1, "Compras"));
//		modelo.addPrioridade(new Prioridade(1, "Total"));
//	
//		// Alterando Usuário cadastrado
//		Usuario usuNovo = modelo.alterarUsuario(new Usuario("arieneNovo", "emailNovo", "username", "passwordNovo", "tipoUsuario"));
//		
//		// Verificando alteração do Usuário
//		assertEquals(usuNovo.getNome(), "arieneNovo");
//
//		// Cadatrando comentario Chamado
//		Chamado chamado = new Chamado(2, "joao@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta"));
//		
//		//Adicionando Comentario em chamado
//		chamado.addComentario(new Comentario("O que e isso", new Usuario("Daniel", "daniel2wis@gmail.com", "Willians ", "12345", "Administrador"), new Chamado(3, "joao@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta"))));
//	
//		// Verificando comentario cadastrado
//		assertEquals(chamado.getComentarios().size(),1);
//		
//		//Buscando ComentÃ¡rio por tipo
//		assertEquals(chamado.getComentarios().get(0).getcomentario(), "O que e isso");
//		
//		//Alterando comentario
//		chamado.alterarComentario("dfdfd",1);
//		assertEquals(chamado.getComentarios().get(0).getcomentario(), "dfdfd");
//		
//		//Buscando Comentario por numero
//		chamado.buscarComentarioUsuario(1);
//	}
//
//}
