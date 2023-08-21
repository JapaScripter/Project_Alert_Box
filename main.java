// =====Import===== //
import javax.swing.JOptionPane;
import java.util.Scanner;
// =====Import===== //

	// =====Main===== //
class Main {	
  public static void main(final String[] args) {
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = ler.next();
		System.out.println("Sucesso! Aguarde output renderizar a tela.");
		
		JOptionPane.showConfirmDialog(null, "Seu nome é " + nome + "?");
	}
}
// =====Main===== //