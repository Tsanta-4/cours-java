abstract public class Affichable {
	abstract public void affiche();
}

class Entier extends Affichable {
	// Methodes 
	public Entier (int n) {
		this.n = n;
	}
	public void affiche() {
		System.out.println("Ceci est un entier n = " + n);
	}
	// Attributs
	private int n;
}

class Float extends Affichable {
	// Methodes 
	public Float(float f) {
		this.f = f;
	}
	public void affiche() {
		System.out.println("Ceci est un float f = " + f);
	}
	// Attributs
	protected float f;
}

class Char extends Affichable {
	// Methodes
	public Char (String s) {
		this.s = s;
	}
	public void affiche() {
		System.out.println("Ceci est un String s = " + s);
	}
	// Attributs
	private String s;
}

class A {
	public void affiche() {
		System.out.println("Je suis un A");
	}
}