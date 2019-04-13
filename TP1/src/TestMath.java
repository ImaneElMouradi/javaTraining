import java.lang.Math; 


class TestMath { 

	static public void main(String args[]) { 

		System.out.println("e = " + Math.E);        
		System.out.println("pi = " + Math.PI); 

		int largeur = 3, longueur = 4; 

		double w = Math.pow(largeur,2) + Math.pow(longueur,2);        
		double hypotenuse = Math.sqrt(w);  

		System.out.println("Hypoténuse = " + hypotenuse);   //... il vaut mieux écrire largeur * largeur  que  pow (largeur,2)  of course ;-)    
	}
		

}
