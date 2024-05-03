package polimorfismo.exercicio_2;

public class Pessoa {
	private int codigo;
	private String nome;
	private String dataNasc;
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void cadastrar(int codigo, String nome, String dataNasc) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setDataNasc(dataNasc);
		System.out.println(this.nome+" foi cadastrado com sucesso!");
	}
}
