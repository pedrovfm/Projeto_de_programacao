public class Exercicio2 {
	public static void main (String[] args) {
		class Elevador {
			private int andarAtual;
			private int totalAndares;
			private int capacidadeMax;
			private int pessoasPresentes;
			
			public int getAndarAtual() {
				return this.andarAtual;
			}
			public int getTotalAndares() {
				return this.totalAndares;
			}
			public int getCapacidadeMax() {
				return this.capacidadeMax;
			}
			public int getPessoasPresentes() {
				return this.pessoasPresentes;
			}
			
			public void setAndarAtual(int andarAtual) {
				this.andarAtual = andarAtual;
			}
			public void setTotalAndares(int totalAndares) {
				this.totalAndares = totalAndares;
			}
			public void setCapacidadeMax(int capacidadeMax) {
				this.capacidadeMax = capacidadeMax;
			}
			public void setPessoasPresentes(int pessoasPresentes) {
				this.pessoasPresentes = pessoasPresentes;
			}
			
			public void subir(int destino) {
				if (this.getPessoasPresentes() <= this.getCapacidadeMax()) {
					if (this.getAndarAtual() < destino && destino <= this.getTotalAndares()) {
						while (this.getAndarAtual() < destino) {
							System.out.println("Andar atual: "+this.getAndarAtual());
							this.setAndarAtual(andarAtual+1);
							System.out.println("Subindo...");
						}
						System.out.println("Voce chegou ao seu destino (Andar "+this.getAndarAtual()+")");						
					}
					else {
						System.out.println("Voce ja esta no seu destino");
					}
				}
				else {
					System.out.println("Elevador inoperante devido a sobrepeso");
				}
			}
			
			public void descer(int destino) {
				if (this.getPessoasPresentes() <= this.getCapacidadeMax()) {
					if (this.getAndarAtual() > destino && destino >= 0) {
						while (this.getAndarAtual() > destino) {
							System.out.println("Andar atual: "+this.getAndarAtual());
							this.setAndarAtual(andarAtual-1);
							System.out.println("Descendo...");
						}
						System.out.println("Voce chegou ao seu destino (Andar "+this.getAndarAtual()+")");	
					}
				}
				else {
					System.out.println("Elevador inoperante devido a sobrepeso");
				}
			}
		}
		
		Elevador elevador1 = new Elevador();
		elevador1.setAndarAtual(0);
		elevador1.setCapacidadeMax(8);
		elevador1.setPessoasPresentes(0);
		elevador1.setTotalAndares(12);
		
		elevador1.subir(4);
		elevador1.descer(2);
	}
}