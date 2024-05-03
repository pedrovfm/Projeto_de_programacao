package polimorfismo.exercicio_1;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.desenha();
		
		Quadrado quadrado = new Quadrado();
		quadrado.desenha();
		
		Triangulo triangulo = new Triangulo();
		triangulo.desenha();
		
		FiguraGeometrica trianguloEquilatero = new FiguraGeometrica();
		trianguloEquilatero.desenha();
	}
}
