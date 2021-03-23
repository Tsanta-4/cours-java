public interface Affichable {
	public void affiche();
}
class Entier implements Affichable {
	/// Methodes
	public Entier(int n) {
		this.n = n;
	}
	public void affiche() {
		System.out.println("Ceci est un entier : " + n);
	}
	/// Attributs
	private int n;
}
class Floattant implements Affichable {
	/// Methodes 
	public Floattant (float f) {
		this.f = f;
	}
	public void affiche() {
		System.out.println("Ceci est un float : " + f);
	}
	/// Attributs;
	private float f;
}