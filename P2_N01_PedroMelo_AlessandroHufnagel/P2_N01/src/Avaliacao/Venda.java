package Avaliacao;

public class Venda {
	private String placa;
	private String dataVenda;
	private float valorVenda;
	private int matricula;
	private int codigo;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Venda(String placa, String dataVenda, float valorVenda, int matricula, int codigo) {
		this.placa = placa;
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
		this.matricula = matricula;
		this.codigo = codigo;
	}
}
