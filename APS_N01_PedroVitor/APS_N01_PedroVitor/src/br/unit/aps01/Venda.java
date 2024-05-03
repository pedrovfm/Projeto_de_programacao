package br.unit.aps01;
import java.util.*;

public class Venda{
	private Date dataAluguel;
	private String cpfCliente;
	private int codImovel;
	private double valorAluguel;
	private int statusAluguel;
	
	public Date getDataAluguel() {
		return this.dataAluguel;
	}
	public String getCpfCliente() {
		return this.cpfCliente;
	}
	public int getCodImovel() {
		return this.codImovel;
	}
	public double getValorAluguel() {
		return this.valorAluguel;
	}
	public int getStatusAluguel() {
		return this.statusAluguel;
	}
	
	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public void setCodImovel(int codImovel) {
		this.codImovel = codImovel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public void setStatusAluguel(int statusAluguel) {
		this.statusAluguel = statusAluguel;
	}
	
	Venda (Date dataAluguel, String cpfCliente, int codImovel, double valorAluguel, int statusAluguel) {
		this.dataAluguel = dataAluguel;
		this.cpfCliente = cpfCliente;
		this.codImovel = codImovel;
		this.valorAluguel = valorAluguel;
		this.statusAluguel = statusAluguel;
	}
}
