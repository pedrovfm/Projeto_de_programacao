package br.unit.aps01;
import java.util.*;

public class Cliente {
	private String cpf;
	private String nome;
	private Date dataNasc;
	private Date dataCad;
	
	public String getCpf() {
		return this.cpf;
	}
	public String getNome() {
		return this.nome;
	}
	public Date getDataNasc() {
		return this.dataNasc;
	}
	public Date getDataCad() {
		return this.dataCad;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public void setDataCad(Date dataCad) {
		this.dataCad = dataCad;
	}
	
	Cliente (String cpf, String nome, Date dataNasc, Date dataCad) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.dataCad = dataCad;
	}
}
