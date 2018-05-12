import static org.junit.Assert.*;

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
	}

}
