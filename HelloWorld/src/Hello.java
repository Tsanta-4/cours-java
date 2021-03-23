public class Hello {
	public static void main(String[] args) {
		Point p = new Point(3,5);
		p.affiche();
		PointCol pc = new PointCol(4, 8, (byte)2);
		p = pc;	// p de type Point, reference un objet de type PointCol;
		p.affiche();
		p = new Point(5, 7);	// p reference a nouveau un objet de type Point;
		p.affiche();
		System.out.print("\nVoici une liste de Points de tout type:");
		Point[] tabPts = new Point[4];
		tabPts[0] = new Point(0,2);
		tabPts[1] = new PointCol(1, 5, (byte)3);
		tabPts[2] = new PointCol(2,8,(byte)9);
		tabPts[3] = new Point(1,2);
		
		for (int i = 0; i < tabPts.length; i++) {
			tabPts[i].affiche();
		}
		System.out.print("\n\n---------Surdefinition et polymorphisme----------------");
		int n = 45;
		float f = 1.5f;
		Point a = new Point(0,0);
		PointCol b = new PointCol(1,1,(byte)7);
		Util.f(f, a);
		Util.f(n, b);
		Util.f(f, b);
		System.out.print("\n----------Comparaison--------------------");
		Point pp = new PointCol(8, 8, (byte)0);
		Point ppp = new PointCol(8, 8, (byte)1);
		System.out.print("\ncomp = " + pp.identique(ppp));
		System.out.println("---------------------------");
		int j = 0;
		float i = 0;
		
		i = ++j;
		System.out.println(i);
	}

}
