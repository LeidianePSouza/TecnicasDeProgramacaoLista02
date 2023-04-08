package Exercicios;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		try(Scanner valorDoUsuario = new Scanner(System.in)){
		
			int numero, incremento, multiplicacao;
			System.out.println("Digite o número: ");
			numero = valorDoUsuario.nextInt();
			
			System.out.println("Tabela de multiplicação do número " + numero);
			incremento=0;
			while(incremento<=10) {
				multiplicacao = incremento*numero;
				System.out.println(incremento + " X " + numero + " = "+ multiplicacao);
				incremento++;
			}
		}
	}

}
