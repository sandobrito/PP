package questao06;

public class Venda 
{
	private static double VALOR_MINIMO_PARCELA = 50.00;
	private double valor;
	private int qtdParcelas;
	
	public Venda(double valor) 
	{	this.valor = valor;
	}

	public void setQtdParcelas(int qtdParcelas) throws ValorMinimoParcelaException 
	{	if(valor < VALOR_MINIMO_PARCELA){
			throw new ValorMinimoParcelaException();
		}else{
		this.qtdParcelas = qtdParcelas;
		}
	}
	
	public double getValorParcela()
	{	return valor / qtdParcelas;
	}
}
