package questao05;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean nota1Ok = true;
		boolean nota2Ok = true;
		do{
			try {
				System.out.print("Digite nota do estágio 1: ");
				avaliacao.setNota1(teclado.nextDouble());
				nota1Ok = false;
			} catch (NotaInvalidaException e) {
				// TODO Auto-generated catch block
				
			}
		}while(nota1Ok);
		
		do{
			try {
				System.out.print("Digite nota do estágio 2: ");
				avaliacao.setNota2(teclado.nextDouble());
				nota2Ok = false;
			} catch (NotaInvalidaException e) {
				// TODO Auto-generated catch block
				
			}
		}while(nota2Ok);
		System.out.println("Média: " + avaliacao.getMedia());
		teclado.close();
	}
}
