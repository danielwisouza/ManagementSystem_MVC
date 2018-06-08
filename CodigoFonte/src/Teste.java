import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		
		Modelo modelo = new Modelo();
		

		assertEquals(modelo.getChamados().size(), 0);
		
		modelo.addChamado(new Chamado(1, "joao@gmail.com", "maria@gmail.com", LocalDate.of(2018, Month.MAY, 11), LocalDate.of(2018, Month.AUGUST, 20), "ola", "problema", "urgente", new Modulo(12, "aaa"), new Sla(12, LocalDate.of(2018, Month.AUGUST, 1)), new Prioridade(23, "alta")));
		
		assertEquals(modelo.getChamados().size(), 1);
		
		assertEquals(modelo.getChamados().get(0).getDescricao(), "problema");
		
		modelo.alterarDescricaoChamado(1, "problema muito grande");
		
		assertEquals(modelo.getChamados().get(0).getDescricao(), "problema muito grande");
		
		assertEquals(modelo.getChamados().get(0).getUsuarioResponsavel(), "maria@gmail.com");
		
		modelo.alterarResponsavel(1, "jose@gmail.com");
		
		assertEquals(modelo.getChamados().get(0).getUsuarioResponsavel(), "jose@gmail.com");
		
		modelo.addUsuario(new Usuario("ariene", "email", "username", "password", "tipoUsuario"));
		
		List<Usuario> listaUsuario = modelo.buscarUsuarios("ariene");
		
		assertEquals(listaUsuario.get(0).getEmail(), "email");
		
		Usuario usuNovo = modelo.alterarUsuario(new Usuario("arieneNovo", "emailNovo", "username", "passwordNovo", "tipoUsuario"));
		
		assertEquals(usuNovo.getNome(), "arieneNovo");
	}

}
