package Questao16;
import java.util.Scanner;

public class Questao16 {

	private int horas;
	private int minutos;
	private int segundos;

	private int getHora() {
	return horas;
	}

	private void setHora(int hora) {
	if ((hora > 0) && (hora <= 23)) {
	this.horas = hora;
	}
	}

	private int getMinutos() {
	return minutos;
	}

	private void setMinutos(int minutos) {
	if ((minutos >= 0) && (minutos < 60)) {
	this.minutos = minutos;
	}
	}

	private int getSegundos() {
	return segundos;
	}

	private void setSegundos(int segundos) {
	if ((segundos >= 0) && (segundos < 60)) {
	this.segundos = segundos;
	}
	}

	public void leitura() {
	Scanner input = new Scanner(System.in);
	System.out.println("Informe os segundos: ");
	int segundos = input.nextInt();

	 setHora(calcHoras(segundos));
	 setMinutos(calcMinutos(segundos));
	 setSegundos(calcSegundos(segundos));
	}
	
	private int calcHoras(int segundos) {
	return segundos / 3600;
	}
	private int calcMinutos(int segundos) {
	return (segundos / 60);
	}
	private int calcSegundos(int segundos) {
	return (segundos % segundos);
	}

	public void printHora() {
	System.out.println("As horas convertidas em segundos são: " + getHora() + ":" + getMinutos() + ":" + getSegundos());
	}
	}
