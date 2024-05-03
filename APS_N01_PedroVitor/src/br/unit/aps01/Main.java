package br.unit.aps01;
import java.util.*;
import java.text.*;

public class Main {
	public static void main (String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner entrada = new Scanner(System.in);
		int trava = 1;
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		
		do {
			System.out.println("-----------------------------------");
			System.out.println("Bem-vindo ao sistema da corretora.\nO que deseja?\n");
			System.out.println("1. Cadastrar imovel");
			System.out.println("2. Cadastrar cliente");
			System.out.println("3. Cadastrar aluguel");
			System.out.println("4. Finalizar aluguel");
			System.out.println("5. Exibir relatorio de alugueis");
			System.out.println("0. Encerrar programa");

			int resposta = entrada.nextInt();
			trava = resposta;
			
			switch (resposta) {
			case 1:
				System.out.println("\nCodigo do imovel:");
				int codImovel = entrada.nextInt();
				
				System.out.println("Tipo do imovel:");
				System.out.println("1. Apartamento \n2. Casa");
				int tipoImovel = entrada.nextInt();
				
				System.out.println("Data do cadastro:");
				Date dataCadImv = formato.parse(entrada.next());
				entrada.nextLine();
				
				System.out.println("Endereco: ");
				String endereco = entrada.nextLine();
				
				System.out.println("Status:");
				System.out.println("1. Alugado \n2. Disponivel");
				int status = entrada.nextInt();
				
				Imovel imovel = new Imovel(codImovel, tipoImovel, dataCadImv, endereco, status);
				imoveis.add(imovel);
				
				System.out.println("\nImovel cadastrado!");
				continue;
				
			case 2:
				System.out.println("\nCPF:");
				String cpf = entrada.next();
				entrada.nextLine();
				
				System.out.println("Nome:");
				String nome = entrada.nextLine();
				
				System.out.println("Data de nascimento:");
				Date dataNasc = formato.parse(entrada.next());
				
				System.out.println("Data de cadastro:");
				Date dataCadCli = formato.parse(entrada.next());
				
				Cliente cliente = new Cliente(cpf, nome, dataNasc, dataCadCli);
				clientes.add(cliente);
				
				System.out.println("\nCliente cadastrado!");
				continue;
				
			case 3:
				System.out.println("\nData do aluguel:");
				Date dataAluguel = formato.parse(entrada.next());
				
				System.out.println("CPF do cliente:");
				String cpfCliente = entrada.next();
				
				System.out.println("Codigo do imovel:");
				int codImovelAlugado = entrada.nextInt();
				
				System.out.println("Valor do aluguel:");
				double valorAluguel = entrada.nextDouble();
				
				System.out.println("Status do aluguel:");
				System.out.println("1. Alugado \n2. Finalizado");
				int statusAluguel = entrada.nextInt();
				
				Venda aluguel = new Venda(dataAluguel, cpfCliente, codImovelAlugado, valorAluguel, statusAluguel);				
				vendas.add(aluguel);
				
				System.out.println("\nVenda cadastrada!");
				continue;
				
			case 4:
				System.out.println("\nCPF do cliente:");
				String cpfClienteAluguel = entrada.next();
				
				System.out.println("Data do aluguel:");
				Date dataAluguelImv = formato.parse(entrada.next());
				
				System.out.println("Codigo do imovel");
				int codImovelAluguel = entrada.nextInt();
				
				for (int i=0; i<vendas.size(); i++) {
					if ((vendas.get(i).getDataAluguel().equals(dataAluguelImv)) && (vendas.get(i).getCpfCliente().equals(cpfClienteAluguel)) && (vendas.get(i).getCodImovel() == codImovelAluguel)) {
						vendas.get(i).setStatusAluguel(2);
						for (int j=0; j<imoveis.size(); j++) {
							if (imoveis.get(j).getCodigo() == codImovelAluguel) {
								imoveis.get(j).setStatus(2);
								System.out.println("Aluguel finalizado! \nSituacao do imovel alterada para disponivel.");
								break;
							}
						}
					}
				}
				continue;
			case 5:
				System.out.println("Data:");
				Date dataRelatorio = formato.parse(entrada.next());
				
				ArrayList<Venda> vendasDataInformada = new ArrayList<Venda>();
				for (int i=0; i<vendas.size(); i++) {
					if (vendas.get(i).getDataAluguel().equals(dataRelatorio)) {
						vendasDataInformada.add(vendas.get(i));
					}
				}
				
				System.out.println("\nVendas realizados em "+formato.format(dataRelatorio)+":\n");
				for (int i=0; i<vendasDataInformada.size(); i++) {
					System.out.println("Data do aluguel: "+formato.format(vendasDataInformada.get(i).getDataAluguel()));
					System.out.println("CPF do cliente: "+vendasDataInformada.get(i).getCpfCliente());
					System.out.println("Codigo do imovel: "+vendasDataInformada.get(i).getCodImovel());
					System.out.println("Valor do aluguel: R$"+vendasDataInformada.get(i).getValorAluguel());
					System.out.println("Status\n(1 = alugado, 2 = finalizado): "+vendasDataInformada.get(i).getStatusAluguel()+"\n");
				}
			}

		} while (trava != 0);
	}
}
