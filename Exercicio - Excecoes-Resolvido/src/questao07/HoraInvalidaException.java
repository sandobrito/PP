package questao07;

public class HoraInvalidaException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public HoraInvalidaException() {
		super("Hora fora do intervalo entre 0 e 23 horas!");
		// TODO Auto-generated constructor stub
	}

}
