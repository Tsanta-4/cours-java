import java.util.Arrays;

/*
 * author @RATSIMBAZAFY Tiantsoa Tsantanirina
 * fevrier 2021
 * Les Threads
 */


public class main {
	public static void main(String[] args) {
		System.out.println("-----------Les Threads---------");
		/// Construction des 3 Threads que nous allons traiter
		
		Ecrit e1 = new Ecrit ("bonjour ", 10, 5);
		Ecrit e2 = new Ecrit ("bonsoir ", 12, 10);
		Ecrit e3 = new Ecrit ("\n", 5, 15);
		e1.start();
		e2.start();
		e3.start();
		Clavier.lireInt();
	}
}
