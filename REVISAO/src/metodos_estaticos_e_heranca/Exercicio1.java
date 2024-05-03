package metodos_estaticos_e_heranca;
import java.util.Scanner;

public class Exercicio1 {
	public static double metro2Pe2 (double entrada) {
		return entrada*10.76;
	}
	
	public static double pe2Centimetro2 (double entrada) {
		return entrada*929;
	}
	
	public static double milha2Acre (double entrada) {
		return entrada*640;
	}
	
	public static double acrePe2 (double entrada) {
		return entrada*43560;
	}
	
	public static void main(String[] args) {
		System.out.println(Exercicio1.pe2Centimetro2(10));
		
	}
}


