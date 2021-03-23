class PointCol extends Point{
	// Methodes
	public PointCol(int x, int y, byte couleur) {
		super(x, y);
		this.couleur = couleur;
		// TODO Auto-generated constructor stub
	}
	public void identifie() {
		System.out.print("\ncouleur : "+ this.couleur + " => ");
	}
	public void colore (byte couleur) {
		this.couleur = couleur;
	}
	public boolean identique(PointCol pt) {
		return (super.identique(pt) && couleur == pt.couleur);
	}
	public void affichec() {
		affiche();
		System.out.print("\tcouleur : " + couleur);
	}
	/*
	public void affiche() {
		super.affiche();
		System.out.print("\tcouleur : " + couleur);
	}
	*/
	// Attributs de la classe
	private byte couleur;
}
