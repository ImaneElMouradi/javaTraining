package coursera_sem1_exo3;



//construction d'un point 

public class Point {
	
	private double x, y;
	
	public void init( double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	
	public double calculerDistance(Point p) {
		
		
		double x1 = this.x;
		double y1 = this.y;
		
		double x2 = p.getX();
		double y2 = p.getY();
		
		double distance = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1-y2,2));
		
		return distance;
		
	}
	
	

}
