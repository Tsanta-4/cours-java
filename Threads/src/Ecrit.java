class Ecrit extends Thread {
	// Methodes et constructor
	public Ecrit (String texte, int nb, long attente) {
		this.texte = texte;
		this.nb = nb;
		this.attente = attente;
	}
	public void run () {
		try {
			for (int i = 0; i < nb; i++) {
				System.out.print(texte);
				sleep(attente);
			}
		}
		catch (InterruptedException e) {}
	}
	
	// Les attributs
	private String texte;
	private long attente;
	private int nb;
}
