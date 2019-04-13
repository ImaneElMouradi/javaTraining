package TP4;


/** * Classe Point du plan avec ses cordonnées x et y */ 
public class Point extends Object{    
	protected int x, y;    
	/**     
	 * * Methode qui affecte la valeur de son paramètre      
	 * * au Point this.     */    
	
	public Point() {
		this(0,0);
	}
	
	/*
	 * or 	public Point()}{
	 * 	 		this(0);
	 * 		}
	 * */
	
	public Point(int x) {
		this(x,0);
	}
	
	// or
	/*public Point(int x) {
		this.x = x;
		this.y = 0;
	}*/
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// constructeur copie
	public Point (Point p) {
		this.x = p.getX();
		this.y = p.getY();	
	} 
	
	
	
	public void setX(int x) {        
		this.x = x;    
	}   

	public void setY(int y) {        
		this.y = y;    
	}    
	
	public void deplacer(int dx, int dy) {	
		x+=dx;
		y+=dy;
	}
	
	public void reset() {
		x = 0;
		y=0;
	}
	
	public double distance(Point b) {
		double d;
		
		d = Math.sqrt((this.x-b.getX())*(this.x-b.getX())+(this.y-b.getY())*(this.y-b.getY()));
		
		return d;
	}

	/*public boolean equals(Point a){      
		
		return (this.x==a.x && this.y==a.y);  	
	}*/

	
	public int getX() {        
		return x;    
	}    
	
	public int getY() {        
		return y;    
	} 	
	
	
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}

