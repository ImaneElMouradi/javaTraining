package coursera_exercices_semaine1;

import java.lang.Math;

public class Cercle {
	
	//private final double PI = 3.14;
	private double rayon;
	private double x0;
	private double y0;
	
	public void setCentre(double x, double y) {
		x0 = x;
		y0 = y;
	}
	
	public void setRayon(double r) {
		rayon = r;
	}

	
	public double surface() {
		return Math.PI*Math.pow(rayon,2);
	}
	
	
	public boolean estInterieur(double x, double y) {
		if(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<rayon) {
			return true;
		}
		return false;
	}
		
}
