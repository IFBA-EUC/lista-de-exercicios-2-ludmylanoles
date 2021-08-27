package Questao6;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = input.nextInt();
		int qtd_digitos = 0;
		if (num == 0 ) {
			System.out.println ("O número tem 1 dígito");
		} else { while (num != 0)
				{num  = num / 10; 
				qtd_digitos = qtd_digitos + 1;}
				System.out.println ("O número tem " + qtd_digitos + " dígitos");
			}
		
	}

}
