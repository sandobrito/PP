package questao02;

import java.util.Scanner;

public class NomeInvertidoApp 
{
	public static void main(String[] args) 
	{	
		boolean repetir = true;
		do{
			try {
				Scanner teclado = new Scanner(System.in);
				Pessoa pessoa = new Pessoa();
				System.out.print("Digite o seu nome: ");
				pessoa.setNome(teclado.nextLine());
				System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
			 	repetir = false;
			} catch (NomeInvalidoException e) {
				System.out.println(e.getMessage());
				
			}
		}while(repetir);
	}
}
