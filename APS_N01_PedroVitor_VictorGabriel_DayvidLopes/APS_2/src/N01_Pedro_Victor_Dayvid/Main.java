package N01_Pedro_Victor_Dayvid;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    private static final int MAX_TENTATIVAS = 6;
    public static void main(String[] args) {
        while (true) {
        	Random random = new Random();
        	ListaDePalavras cadastroPalavras = new ListaDePalavras();
        	Placar placar = new Placar();
        	
            cadastroPalavras.cadastrarPalavras();

            ArrayList<String> palavras = cadastroPalavras.getPalavras();
        	
            String palavraSelecionada = palavras.get(random.nextInt(palavras.size()));
            char[] palavraOculta = new char[palavraSelecionada.length()];
            int tentativas = 0;
            boolean acertou = false;

            for (int i = 0; i < palavraOculta.length; i++) {
                palavraOculta[i] = '_';
            }

            while (tentativas < MAX_TENTATIVAS) {
                placar.exibirPlacar(tentativas);
                System.out.println("Palavra: " + String.valueOf(palavraOculta) + "\n");
                
                char letra = JOptionPane.showInputDialog("Chute uma letra:").toLowerCase().charAt(0);
                
                try {
                    if (!(Character.toString(letra)).matches("[a-zA-Z]+")) {
                        throw new IllegalArgumentException("Digite apenas palavras, sem números ou caracteres especiais");
                    }
                    
                    boolean acertouLetra = false;
                    for (int i = 0; i < palavraSelecionada.length(); i++) {
                    	if (palavraSelecionada.charAt(i) == letra) {
                    		palavraOculta[i] = letra;
                    		acertouLetra = true;
                    	}
                    }
                    
                    if (!acertouLetra) {
                    	tentativas++;
                    }
                    
                    if (String.valueOf(palavraOculta).equals(palavraSelecionada)) {
                    	acertou = true;
                    	break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }

            System.out.println("\nA palavra era: " + palavraSelecionada);
            if (acertou) {
                System.out.println("Parabéns, você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
            int jogarNovamente = JOptionPane.showConfirmDialog(null,"Jogar novamente?", "Jogar novamente?", JOptionPane.YES_NO_OPTION);
            if (jogarNovamente == 1) {
            	// 0=sim, 1=não, 2=cancelar
                break;
            }
        }
        
    }
}