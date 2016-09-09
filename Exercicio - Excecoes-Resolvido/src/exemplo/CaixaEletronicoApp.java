package exemplo;

import java.util.Scanner;

public class CaixaEletronicoApp
{	
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Conta conta = new Conta();
		String opcao = null;
		do
		{	System.out.println("Saldo: R$ " + conta.getSaldo());
			System.out.print("Digite opcao: ");
			opcao = teclado.nextLine();
			try
			{	if (!opcao.equals("sair"))
				{	System.out.print("Digite valor: ");
					double valor = Double.parseDouble(teclado.nextLine());
					if (opcao.equals("depositar"))
					{	conta.depositar(valor);
					} else if (opcao.equals("sacar"))
					{	conta.sacar(valor);
					}
				}	
			} catch (QuantiaInvalidaException qie)
			{	System.out.println(qie.getMessage());	
			} catch (SaldoInsuficienteException sie)
			{	System.out.println("O valor do saldo eh insuficiente");
				sie.printStackTrace();
				
			} catch (Exception e)
			{	System.out.println("Erro nao previsto: " + e.getMessage());
			} finally 
			{	if (opcao.equals("sair"))
				{	break;
				}
			}
		} while (true);
		teclado.close();
	}
}
