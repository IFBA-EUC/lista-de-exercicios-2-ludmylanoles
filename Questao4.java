package Questao4;

import java.util.Locale;
import java.util.Scanner;

public class Questao4 {
	
	Scanner input = new Scanner(System.in);
	private String nome;
	private float precoprodt;
	private int qtd;
	private double valortotal;
	private double desconto;
	
	public Questao4() {}
	public String getNome() {
		return nome;
	}
    public void setNome(String nome) {
    	this.nome = nome;
    }
    public float getPrecoprodt() {
		return precoprodt;
	}
    public void setPrecodrodt(float precoprodt) {
    	this.precoprodt = precoprodt;
    }
    public int getQtd() {
		return qtd;
	}
    public void setQtd(int qtd) {
    	this.qtd = qtd;
    }
    public double getValortotal() {
    	return valortotal;
    		}
    public void getValortotal(double precototal) {
    	this.valortotal = precoprodt * qtd;
    }
    public double getDesconto() {
    if (qtd <= 10) {
        return valortotal;
		System.out.println("O valor total é: " + valortotal);
	}else if (qtd > 10 && qtd <= 20) {
		desconto = ((precoprodt * qtd) * 0.1);
		return (this.desconto);
		System.out.println("O valor total é:" + desconto);
	}else if (qtd > 20 && qtd <= 50) {
		desconto = ((precoprodt * qtd) * 0.2);
		return (this.desconto);
		System.out.println("O valor total é:" + desconto);
	}else {
	    desconto = ((precoprodt * qtd) * 0.25);
		return (this.desconto);
	    System.out.println("O valor total é:" + desconto);
	}
}    