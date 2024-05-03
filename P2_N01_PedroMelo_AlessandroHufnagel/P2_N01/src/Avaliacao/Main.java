package Avaliacao;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String [] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		ArrayList<Moto> motos = new ArrayList<Moto>();
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		Scanner s = new Scanner(System.in);
		int parar = 1;
		while (parar != 0) {
			System.out.println("O que deseja?\n");
			System.out.println("0. Encerrar programa");
			System.out.println("1. Cadastrar cliente");
			System.out.println("2. Cadastrar vendedor");
			System.out.println("3. Cadastrar moto");
			System.out.println("4. Vender moto");
			
			int resp = s.nextInt();
			switch (resp) {
			case 1:
				System.out.println("\nCodigo:");
				int codigo = s.nextInt();
				
				System.out.println("Nome:");
				String nomeC = s.next();
				
				System.out.println("Endereco:");
				String enderecoC = s.next();
				
				System.out.println("Telefone:");
				String telefoneC = s.next();
				
				System.out.println("CPF:");
				String cpfC = s.next();
				
				Cliente cliente = new Cliente(codigo, nomeC, enderecoC, telefoneC, cpfC);
				clientes.add(cliente);
				continue;
			case 2:
				System.out.println("\nMatricula:");
				int matricula = s.nextInt();
				
				System.out.println("Nome:");
				String nomeV = s.next();
				
				System.out.println("Endereco:");
				String enderecoV = s.next();
				
				System.out.println("Telefone:");
				String telefoneV = s.next();
				
				System.out.println("CPF:");
				String cpfV = s.next();
				
				Vendedor vendedor = new Vendedor(matricula, nomeV, enderecoV, telefoneV, cpfV);
				vendedores.add(vendedor);
				continue;
			case 3:
				System.out.println("\nPlaca:");
				String placa = s.next();
				
				System.out.println("\nAno:");
				int ano = s.nextInt();
				
				System.out.println("\nMarca:");
				String marca = s.next();
				
				System.out.println("\nModelo:");
				String modelo = s.next();
				
				System.out.println("\nPreco:");
				float preco = s.nextFloat();
				
				System.out.println("\nCondicao (nova ou usada):");
				String condicao = s.next();
				
				Moto moto = new Moto(placa, ano, marca, modelo, preco, condicao);
				motos.add(moto);
				continue;
			case 4:
				System.out.println("\nPlaca:");
				String placaV = s.next();
				
				System.out.println("\nData de venda:");
				String dataV = s.next();
				
				System.out.println("\nValor de venda:");
				float valorV = s.nextFloat();
				
				System.out.println("\nMatricula do vendedor:");
				int matriculaV = s.nextInt();
				
				System.out.println("\nCodigo do cliente:");
				int codigoC = s.nextInt();
				Venda venda = new Venda(placaV, dataV, valorV, matriculaV, codigoC);
				vendas.add(venda);
				continue;
			case 0:
				parar = 0;
			}
		}
	}
}
