import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		System.out.println("Insira a quantidade de macas desejadas: ");
		Scanner entrada = new Scanner(System.in);
		
		int macas = entrada.nextInt();
		double resultado;
		
		if (macas<12) {
			resultado = macas*0.3;
			System.out.println(macas+" macas custaram R$"+resultado);
		} else {
			resultado = macas*0.25;
			System.out.println(macas+" macas custaram R$"+resultado);
		}
	}
}
