package Questao1;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double a, b, c, delta;
		double x1, x2;
		
		System.out.println("Digite o valor de a: ");
		a = leitor.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = leitor.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = leitor.nextDouble();
		
		delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			System.out.println("Não existe raízes.");
		} else if (delta ==  0) {
			x1 = (-b) / (2 * a);
			System.out.println("A raíz é: " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raízes são: " + x1 + " e " + x2);
		}
	}     

}
