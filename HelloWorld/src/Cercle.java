class Cercle {
	// Methodes
	
	/// Classe interne
	class Centre {
		public Centre(int x, int y) {
			this.x = x; this.y = y;
		}
		public void affiche() {
			System.out.println(x + ", " + y);
		}
		// Attributs pour la class interne
		private int x,y;
	}
	public void deplace(int dx, int dy) {
		centre.x += dx; centre.y += dy;
	}
	
	public Cercle(int x, int y, float r) {
		centre = new Centre(x, y);
		rayon = r;
	}
	public void affiche() {
		System.out.println("Cercle de centre " + "(" + centre.x + ", " + centre.y + ") " + "et de rayon r = " + rayon );
	}
	// Atributs
	private Centre centre;
	private double rayon;
}
