package TP4;

class Robot extends Point {    
	int direction;       // direction actuelle 
	
	public Robot(){        
		super(0,0);        
		direction = 2;  // Est     
	}  
	
	public Robot(int x, int y, int d) {
		super(x,y);
		this.direction = d;
	}

	
	public void avancer() {        
		switch (direction) {            
			case 1: y++; break;          
			case 2: x++; break;            
			case 3: y--; break;            
			case 4: x--; break;            
			default:;        
			}    
	} 
	
	public void setDirection(int d) {
		this.direction = d;
	}

	
	public String toString() {
		return "(" + this.x + "," + this.y + ")" + ". De direction: " + this.direction;
	}
}
