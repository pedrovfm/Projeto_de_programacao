package br.unit.aps01;
import java.util.*;

public class Imovel {
	private int codigo;
	private int tipo;
	private Date dataCad;
	private String endereco;
	private int status;
	
	public int getCodigo() {
		return this.codigo;
	}
	public int getTipo() {
		return this.tipo;
	}
	public Date getDataCad() {
		return this.dataCad;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public int getStatus() {
		return this.status;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	Imovel (int codigo, int tipo, Date dataCad, String endereco, int status) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.dataCad = dataCad;
		this.endereco = endereco;
		this.status = status;
	}
}
