class Point {
	/// Methodes
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void initialise (int abs, int ord) {
		x = abs;
		y = ord;
	}
	public boolean identique(Point pt) {
		return (x == pt.x && y == pt.y);
	}
	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public void affiche() {
		identifie();
		System.out.print("("+x+" , "+y+")");
	}
	
	public void identifie() {
		System.out.print("\nPoint =>\t");
	}
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	
	public boolean coincide (Point p) {
		return ((x == p.x) && (y == p.y));
	}
	public void permute(Point p) {
		Point tmp = new Point(0,0);
		tmp.x = p.x; tmp.y = p.y;
		p.x = x; p.y = y;
		x = tmp.x; y = tmp.y;
	}
	public Point symetrie() {
		Point sym = new Point(y,x);
		return sym;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	
	///Attribus
	private int x;
	private int y;
}

class Obj {
	public Obj() {
		System.out.print("++ creation objet Obj ; ");
		nb++;
		System.out.println("il y en a maintenant " + nb);
		
	}
	// Attribut
	private static long nb = 0;
}
