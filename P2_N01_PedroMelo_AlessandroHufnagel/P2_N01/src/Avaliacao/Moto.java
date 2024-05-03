package Avaliacao;

public class Moto {
	
	private String placa;
	private int ano;
	private String marca;
	private String modelo;
	private float preco;
	private String condicao;
	
	public Moto(String placa, int ano, String marca, String modelo, float preco, String condicao) {
		this.placa = placa;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.condicao = condicao;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getCondicao() {
		return condicao;
	}
	
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
}
