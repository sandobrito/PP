package questao03;

public class DataInvalidaException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public DataInvalidaException() {
		super("Os parâmetros fornecidos não representam uma data válida");
		
	}
	

}
