package TP4;

public class Rectangle {
	Point hg,bd ;    
	// Les coins haut � gauche et bas � droite 
	// Rectangle droit    
	public Rectangle(){    
		// rectangle par d�faut. Choisir son initialisation   
		hg = new Point(0,0);
		bd = new Point(0,0);
	}   
	
	
	public void setHg(Point hg) {
		this.hg = hg;
	}
	public void setBd(Point bd) {
		this.bd = bd;
	}
	
	
	public Point getHg() {
		return hg;
	}
	public Point getBd() {
		return bd;
	}

	

	public Rectangle(Point h, Point b){    
		// initialisation des coins � partir des param�tres    
		// donn�es    
		
		/*
		hg = new Point(h.getX(),h.getY());
		bd = new Point(b.getX(),b.getY());
		*/
		
		hg = new Point(h);
		bd = new Point(b);
	}  
	
	public void afficher(){    
		// Affiche les coordonn�es des coins    
		System.out.println(hg);
		System.out.println(bd);
	}     
	
	public int surface(){    
		// calcule de la surface 
		int s;
		s = (bd.getX()-hg.getX())*(hg.getY()-bd.getY());
		return s;
	}  
	
	public void zoom(int deltax, int deltay){    
		// Dilatation des coordonn�es. Delta donn�.  
		hg.setX(hg.getX()+deltax);
		bd.setX(bd.getY()+deltay);
	} 
	
		
	
	// autres m�thodes... 
		
}
		

	

