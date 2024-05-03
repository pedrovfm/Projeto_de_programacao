public class Exercicio1 {
	public static void main (String[] args) {
		class Pessoa {
			private String nome;
			private String dataNascimento;
			private double altura;
			
			public String getNome() {
				return this.nome;
			}
			public String getDataNascimento() {
				return this.dataNascimento;
			}
			public double getAltura() {
				return this.altura;
			}
			
			public void setNome(String nome) {
				this.nome = nome;
			}
			public void setDataNascimento(String dataNascimento) {
				this.dataNascimento = dataNascimento;
			}
			public void setAltura (double altura) {
				this.altura = altura;
			}
			
			public void imprimirDados() {
				System.out.println("Nome: "+this.getNome()+"\nData de nascimento: "+this.getDataNascimento()+"\nAltura: "+this.getAltura()+"m");
			}
		}
		
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro Vitor Freitas Melo");
		pedro.setDataNascimento("06/03/2001");
		pedro.setAltura(1.83);
		pedro.imprimirDados();
		
		Pessoa vitoria = new Pessoa();
		vitoria.setNome("Vitoria Regina dos Santos Cardoso");
		vitoria.setDataNascimento("08/02/2004");
		vitoria.setAltura(1.55);
		vitoria.imprimirDados();
		
		Pessoa elisangela = new Pessoa();
		elisangela.setNome("Elisangela de Jesus Freitas");
		elisangela.setDataNascimento("31/05/1974");
		elisangela.setAltura(1.57);
		elisangela.imprimirDados();
	}
}
