package questao02;

public class NomeInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public NomeInvalidoException() {
		super("O nome fornecido n�o pode ser nulo ou vazio");
		
	}
	
	
	

}
