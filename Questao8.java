package Questao8;

import java.util.Scanner;

public class Questao8 {
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Digite um número: ");
    	int n = input.nextInt();
	    for (int i = 0; i < n; i++) {
            System.out.print(Questao8.fibo(i) + ",\t");
        }

    }

}