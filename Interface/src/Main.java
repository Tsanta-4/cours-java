/// Ici on apprend à faire un interface
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Données
		Affichable[] tab;
		tab = new Affichable[2];
		tab[0] = new Entier(8);
		tab[1] = new Floattant(23.3f);
		for (int i = 0; i < tab.length; i++) {
			tab[i].affiche();
		}
	}

}
