import java.time.LocalDate;
import java.util.List;

public class Chamado {
	private int numeroChamado;
	private String usuarioAbertura;
	private String usuarioResponsavel;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String assunto;
	private String descricao;
	private String status;
	private List<Comentario> comentarios;
	private Modulo modulo;
	private Sla sla;
	private Prioridade prioridade;
}
