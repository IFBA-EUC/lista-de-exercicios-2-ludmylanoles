package Questao2;

import java.util.Scanner;
public class Questao2 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double x1, y1, x2, y2, z1, z2, ponto_x, ponto_y, ponto_z, distancia;
		x1 = input.nextDouble();
		x2 = input.nextDouble();
		y1 = input.nextDouble();
		y2 = input.nextDouble();
		z1 = input.nextDouble();
		z2 = input.nextDouble();
		
		ponto_x = (x2 - x1) * (x2 - x1);
		ponto_y = (y2 - y1) * (y2 - y1);
		ponto_z = (z2 - z1) * (z2 - z1);
		distancia = Math.sqrt(ponto_x + ponto_y + ponto_z);
		
//		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		
		System.out.println("A distância entre dois pontos no espaço de 3 dimensões é: " + distancia);

	}

}
