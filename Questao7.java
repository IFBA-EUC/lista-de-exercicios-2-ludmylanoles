package Questao7;

//a) A solu��o correta � o programa A

//b) Trocando o la�o de repeti��o "do-while" por "while", igual no programa "A". Se continuar usando "do-while" a verifica��o do
//c�digo vai ser avaliada depois de executada, mesmo se for verdadeira.

import java.util.Scanner;
public class Questao7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		System.out.println("Informe o c�digo: ");
		codigo = teclado.nextInt();
		while (codigo != -1) {
		System.out.println("C�digo: " + codigo);
		System.out.println("Informe o c�digo: ");
		codigo = teclado.nextInt();
		}
	}
}
