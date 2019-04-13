package coursera_sem1_exo3;

public class Triangle {
	private Point p1 , p2, p3;
	private double longueur1, longueur2, longueur3;
	
	public void setSommets(Point point1, Point point2, Point point3) {
		p1 = point1;
		p2 = point2;
		p3 = point3;
		
		longueur1 = p1.calculerDistance(p2);
		longueur2 = p2.calculerDistance(p3);
		longueur3 = p3.calculerDistance(p1);	
	}
	
	public double calculerPerimetre(){
		return (longueur1 + longueur2 + longueur3);
	}
	
	public boolean testerIsocele() {
		return ( longueur1 == longueur2 || longueur2 == longueur3 || longueur3 == longueur1) ;
	}
	
	
	
	
}
