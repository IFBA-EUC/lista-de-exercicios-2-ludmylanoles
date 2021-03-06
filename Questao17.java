package Questao17;
import static java.util.Collections.nCopies;
import static java.lang.String.join;


public class Questao17 {
	private static final int[] num_decimais =
        {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] num_romanos =
        {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


public static String converterEmRomanos(int decimal) {
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < num_decimais.length; i++) {
        int parteInteira = decimal / num_decimais[i];
        decimal -= num_decimais[i] * parteInteira;
        resultado.append(join("", nCopies(parteInteira, num_romanos[i])));
    }
    return resultado.toString();
}
}
