package exemplo;

public class QuantiaInvalidaException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public QuantiaInvalidaException()
	{	super("Quantia fornecida nao pode ser zero ou negativa");
	}
}
