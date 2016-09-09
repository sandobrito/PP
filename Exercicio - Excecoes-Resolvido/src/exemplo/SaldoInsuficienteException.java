package exemplo;

public class SaldoInsuficienteException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException()
	{	super("Saldo insuficiente para realizar a operacao");
	}
	
	public SaldoInsuficienteException(String mensagem)
	{	super(mensagem);
	}
}
