/*
public class Exercicio3 {
	public static void main (String[] args) {
		class Universidade {
			private String nome;
			
			public String getNome() {
				return this.nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
		}
		
		class Pessoa {
			private String cpf;
			private String nome;
			private String dataNascimento;
			
			public String getCpf() {
				return this.cpf;
			}
			public String getNome() {
				return this.nome;
			}
			public String getDataNascimento() {
				return this.dataNascimento;
			}
			
			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public void setDataNascimento(String dataNascimento) {
				this.dataNascimento = dataNascimento;
			}
			
			public void imprimirInfo() {
				if (this.getNome().equals("Albert Einstein"))  {
					System.out.println(this.getNome()+" trabalhou como professor em "+princeton.getNome());
				};
			}
		}
		
		Universidade princeton = new Universidade();
		princeton.setNome("Princeton");
		
		Universidade cambridge = new Universidade();
		cambridge.setNome("Cambridge");
		
		Pessoa einstein = new Pessoa();
		einstein.setCpf("000.000.000-00");
		einstein.setNome("Albert Einstein");
		einstein.setDataNascimento("00/00/0000");
		
		Pessoa newton = new Pessoa();
		newton.setCpf("111.111.111-11");
		newton.setNome("Isaac Newton");
		newton.setDataNascimento("11/11/1111");
	}
}
*/