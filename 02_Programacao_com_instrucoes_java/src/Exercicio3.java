import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		double maiorAltura=0, menorAltura=10, somaAlturasHomens=0;
		int qtdMulheres=0, qtdHomens=0;
		boolean ligado = true;
		
		do {
			System.out.println("Nome:");
			Scanner entradaNome = new Scanner(System.in);
			String nome = entradaNome.nextLine();
			
			if (nome.equals("SAIR")){
				ligado = false;
				break;
			}
			
			System.out.println("Altura:");
			Scanner entradaAltura = new Scanner(System.in);
			double altura = entradaAltura.nextDouble();
			
			System.out.println("Sexo:");
			Scanner entradaSexo = new Scanner(System.in);
			String sexo = entradaSexo.next();
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (sexo.equalsIgnoreCase("masculino")) {
				somaAlturasHomens += altura;		
				qtdHomens++;
			}
			
			else {
				qtdMulheres++;
			}
		} while (ligado);
		
		System.out.println("Maior altura: "+maiorAltura+"m");
		System.out.println("Menor altura: "+menorAltura+"m");
		System.out.println("Media de altura dos homens: "+(somaAlturasHomens/qtdHomens));
		System.out.println("Quantidade de mulheres: "+qtdMulheres);
	}
}
