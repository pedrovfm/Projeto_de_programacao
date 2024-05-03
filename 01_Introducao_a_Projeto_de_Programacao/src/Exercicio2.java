public class Exercicio2 {
	public static void main (String[] args) {
		for (int galoes=1; galoes<11; galoes++) {
			double litros = 3.7854;
			double resultado = litros * galoes;
			if (resultado > 20) {
				if (galoes == 1) {
					System.out.println(galoes+" galao equivale a "+resultado+"L");
				} else {
					System.out.println(galoes+" galoes equivalem a "+resultado+"L");
				}
			}
		}
	}
}
