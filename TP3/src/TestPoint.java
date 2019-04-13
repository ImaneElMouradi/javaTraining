/**
 * 
 * 
 * @author DELL XPS
 * Cette classe permet de tester toutes les methodes de la classe Point
 *
 */
public class TestPoint {
	static public void main(String args[]){

		
		        Point point = new Point();  
		        
		        point.setX (3);        
		        point.setY (4);        
		        System.out.println( point.getX() );        
		        System.out.println( point.getY() );    
		        
		        /* p.reset();
		        System.out.println( p.getX() );        
		        System.out.println( p.getY() ); */
		        
		        
		        
		        Point p1 = new Point(1,2);
		        Point p2 = new Point(2,3);

		        System.out.println(p1.distance(p2));  
		        // or
		        System.out.println(distance(p1,p2));
		        
		        
		        
		        
		        Point p = new Point(1,1);
		        Point q = new Point(1,1);
		        Point a = p;
		        
		        
		        System.out.println(p.equals(q));
		        System.out.println(p.equals(a));
		        
		        
		        Point z = new Point (2,5);    
		        System.out.println(z.toString());    // imprime (2,5)

		        
	} 
	
	public static double distance(Point a, Point b) {
		double d;
		
		d = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
		
		return d;
	}
}
