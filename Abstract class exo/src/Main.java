public class Main {
	public static void main (String[] args) {
		Float f = new Float(4.5f);
		Char c = new Char("Tsanta");
		Entier n = new Entier(33);
		
		f.affiche();
		c.affiche();
		n.affiche();
		System.out.println("Classe anonyme");
		A a;
		a = new A() {
			// Classe anonyme heritant float
			public void affiche() {
				System.out.print("Je suis un anonyme derive de A");
			}
		};
		a.affiche() ;
	}
}
