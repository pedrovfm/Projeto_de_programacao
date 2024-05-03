package Avaliacao;
public class Vendedor extends Pessoa{
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Vendedor(int matricula, String nome, String endereco, String telefone, String cpf) {
		setMatricula(matricula);
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setCpf(cpf);
	}
	

}
