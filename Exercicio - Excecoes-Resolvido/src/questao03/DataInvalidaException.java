package questao03;

public class DataInvalidaException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public DataInvalidaException() {
		super("Os par�metros fornecidos n�o representam uma data v�lida");
		
	}
	

}
