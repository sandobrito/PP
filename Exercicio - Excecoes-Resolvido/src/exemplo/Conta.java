package exemplo;

public class Conta 
{
	private double saldo;
	
	public double getSaldo() 
	{	return saldo;
	}
	
	public void depositar(double quantia) throws QuantiaInvalidaException
	{	if (quantia <= 0)
		{	throw new QuantiaInvalidaException();
		}
		this.saldo += quantia;
	}
	
	public void sacar(double quantia) throws QuantiaInvalidaException, 
											SaldoInsuficienteException
	{	if (quantia <= 0)
		{	throw new QuantiaInvalidaException();
		} else if (quantia > saldo)
		{	throw new SaldoInsuficienteException();
		}
		this.saldo -= quantia; 
	}

}
