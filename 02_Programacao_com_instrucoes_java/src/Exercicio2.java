import java.util.Scanner;
public class Exercicio2 {
	public static void main (String[] args) {
		String nome;
		do {
			System.out.println("Insira o nome do aluno:");
			Scanner entradaNome = new Scanner(System.in);
			nome = entradaNome.nextLine();
			
			if (nome.equalsIgnoreCase("SAIR")) {
				break;
			}
			
			System.out.println("Insira a primeira nota:");
			Scanner entradaNota1 = new Scanner(System.in);
			double nota1 = entradaNota1.nextDouble();
			
			System.out.println("Insira a segunda nota:");
			Scanner entradaNota2 = new Scanner(System.in);
			double nota2 = entradaNota2.nextDouble();
			
			double media = (nota1 + nota2)/2;
			
			if (media>=6) {
				System.out.println(nome+" esta aprovado com media "+media+"\n");
			} else {
				System.out.println(nome+" esta reprovado com media "+media+"\n");
			}
		} while (true);
	}
}
