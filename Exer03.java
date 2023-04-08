package Exercicios;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		try(Scanner valorDoUsuario = new Scanner(System.in)){
		
			int numero;
			int numeroCorreto=21;

			do {
				System.out.println("Adivinhe o número:");
				numero = valorDoUsuario.nextInt();
				
				if(numero<numeroCorreto) {
					System.out.println("Número menor que o número correto");
				} else if(numero>numeroCorreto) {
					System.out.println("Número maior que o número correto");
				} else {
					System.out.println("Número correto!");
				}
			}while(numero!=numeroCorreto);
		}	
	}

}
