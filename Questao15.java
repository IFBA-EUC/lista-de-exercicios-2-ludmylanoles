package Questao15;

public class Questao15 {
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	
	public Questao15() {}
		public double getNota1() {
			return nota1;
		}
		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		public double getNota3() {
			return nota3;
		}
		public void setNota3(double nota3) {
			this.nota3 = nota3;
		}
		public double getMedia() {
				return media;
			}
		public void setMedia(double media) {
				this.media = (nota1 + nota2 + nota3) / 3;
			}
		public void status() {
			if (media > 6) {
				System.out.println("Aprovado(a)");
			}
			else if (media >= 4 && media <= 6) {
				System.out.println("Verifica��o Suplementar");
			}
			else {
				System.out.println("Reprovado(a)");
			}
		}
}
