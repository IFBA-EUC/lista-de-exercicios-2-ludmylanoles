package Questao7;

//a) A solução correta é o programa A

//b) Trocando o laço de repetição "do-while" por "while", igual no programa "A". Se continuar usando "do-while" a verificação do
//código vai ser avaliada depois de executada, mesmo se for verdadeira.

import java.util.Scanner;
public class Questao7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo;
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		while (codigo != -1) {
		System.out.println("Código: " + codigo);
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		}
	}
}
