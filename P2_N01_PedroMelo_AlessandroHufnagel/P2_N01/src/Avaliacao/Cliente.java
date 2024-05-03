package Avaliacao;

public class Cliente extends Pessoa {
	private int codigo;

	public Cliente(int codigo, String nome, String endereco, String telefone, String cpf) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setCpf(cpf);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
