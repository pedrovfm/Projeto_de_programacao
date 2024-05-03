package N01_Pedro_Victor_Dayvid;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaDePalavras {
	private ArrayList<String> palavras = new ArrayList<String>();
	
	public void cadastrarPalavras() {
		while (true) {
			String palavra = JOptionPane.showInputDialog("Digite uma palavra para o jogo:");
			if (palavra == null) {
				break;
			}
			
			try {
				if (!palavra.matches("[a-zA-Z]+")) {
					throw new IllegalArgumentException("Digite apenas palavras, sem números ou caracteres especiais");
				}
				palavras.add(palavra.toLowerCase());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
	
	public ArrayList<String> getPalavras() {
		return this.palavras;
	}
	
}