package metodos_estaticos_e_heranca;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	class Notas {
		private double n1;
		private double n2;
		private double n3;
		private double nf = (n1+n2+n3)/3;
		
		Notas(double nota1, double nota2, double nota3) {
			this.n1 = nota1;
			this.n2 = nota2;
			this.n3 = nota3;
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int trava;
		do {
			
			System.out.println("O que deseja?");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Cadastrar notas");
			
			int resposta = entrada.nextInt();
			trava = resposta;
			
			ArrayList<String> alunos = new ArrayList<String>();
			ArrayList<Notas> notas = new ArrayList<Notas>();
			
			switch (resposta) {
			case 1:
				System.out.println("Nome do aluno:");
				String aluno = entrada.nextLine();
				alunos.add(aluno);
				continue;
			case 2:
				System.out.println("Nota 1:");
				double nota1 = entrada.nextDouble();
				
				System.out.println("Nota 2:");
				double nota2 = entrada.nextDouble();
				
				System.out.println("Nota 3:");
				double nota3 = entrada.nextDouble();
				
				notas = new Notas(nota1, nota2, nota3);
			}
			
			
		} while(trava!=0);
	}
}
