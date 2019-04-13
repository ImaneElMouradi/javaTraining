

class DataArtist {

	public static void main(String args[]) {
		 DataArtist.draw ("Picasso");    // 1ère méthode, draw(String)    
		 DataArtist.draw (1);            // 2e méthode, draw(Int)    
		 DataArtist.draw (3.1459);            // 3e méthode, draw(double)    
		 DataArtist.draw (2, 1.68);                // 4e méthode, draw (int, double)

		 char c='a';        
		 f(c);        
		 f(c, 1);        
		 f(c, 2,3,4);        
		 int[] monTableau = {5,6,7,8 };        
		 f(c, monTableau);

	}



	static void draw(String s) {        
		System.out.println("Ceci est une chaine: "+s);    
	}    

	static void draw(int i) {        
		System.out.println("Ceci est un entier: "+i);    
	}    
	static void draw(double f) {        
		System.out.println("Maintenant un double: "+f);    
	}    
	static void draw(int i, double f) {        
		System.out.format("Une entier %d et un double %f %n",i,f);    
	}

	public static void f(char c, int... p) {        
		System.out.println(c + " " + p.length);        
		for (int e:p) System.out.println("  " + e);    
	}

}








