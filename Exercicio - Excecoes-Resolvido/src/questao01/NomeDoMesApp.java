package questao01;

import java.util.Scanner;

public class NomeDoMesApp 
{
	public static void main(String[] args)
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número do mês: ");
		Mes mes;
		try {
			mes = new Mes(teclado.nextInt());
			System.out.println("Nome do mês: " + mes.getNome());
		} catch (MesInvalidoException e) {
			System.out.println("O número do mês deve estar contido no intervalo [1, 12]");
			
		}finally {
			teclado.close();
		}
		
	 	
	}
}
