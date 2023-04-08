package Exercicios;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		try(Scanner valorDoUsuario = new Scanner(System.in)){
			int numero;
			int armazenamento = 0;
			
			do {
				System.out.println("Digite o número: ");
				numero = valorDoUsuario.nextInt();
				if (numero>0) {
					armazenamento = armazenamento+numero;
				}
			}while(numero>0);
			
			System.out.println("Soma dos valores positivos: " + armazenamento);
		}
	}
		
}



