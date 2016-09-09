package questao07;

public class MinutoInvalidoException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public MinutoInvalidoException() {
		super("Minuto fora do intervalo entre 0 e 59 minutos.");
		// TODO Auto-generated constructor stub
	}
	
}
