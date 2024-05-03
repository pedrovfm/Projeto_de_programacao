package N01_Pedro_Victor_Dayvid;

public class Placar {
	public void exibirPlacar(int tentativas) {
	    switch (tentativas) {
	        case 5:
	            System.out.println("  O");
	            break;
	        case 4:
	            System.out.println("  O");
	            System.out.println("  |");
	            break;
	        case 3:
	            System.out.println("  O");
	            System.out.println(" /|");
	            break;
	        case 2:
	            System.out.println("  O");
	            System.out.println(" /|\\");
	            break;
	        case 1:
	            System.out.println("  O");
	            System.out.println(" /|\\");
	            System.out.println(" /");
	            break;
	        case 0:
	            System.out.println("  O");
	            System.out.println(" /|\\");
	            System.out.println(" / \\");
	            break;
	    }
	}
}
