class Souris {

    public static final int ESPERANCE_VIE_DEFAUT = 36;

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    private int poids, age=0, esperanceVie=ESPERANCE_VIE_DEFAUT;
    private String couleur;
    private boolean clonee=false;
    
    public Souris(int poids, String couleur, int age, int esperanceVie) {
    	
    	this.poids = poids;
    	this.couleur = couleur;
    	this.age = age;
    	this.esperanceVie = esperanceVie;
    	System.out.println("Une nouvelle souris !");
    	
    }
    
    public Souris(int poids, String couleur, int age) {
    	
    	this.poids = poids;
    	this.couleur = couleur;
    	this.age = age;
    	System.out.println("Une nouvelle souris !");    	
    }
    public Souris( int poids, String couleur) {
    	
    	this.poids = poids;
    	this.couleur = couleur;
    	System.out.println("Une nouvelle souris !");    	
    }
    
    public Souris(Souris souris) {
    	
    	this.poids = souris.getPoids();
    	this.age = souris.getAge();
    	this.couleur = souris.getCouleur();
    	this.esperanceVie = (int)(souris.getEsperance()*4)/5;
    	
    	
    	this.clonee = true;
    	System.out.println("Clonage d'une souris !");    	
    	
    }
    
    public String toString( ) {
    	if(clonee) {
    		return String.format("Une souris %s, clonee, de %d mois et pesant %d grammes", couleur, age, poids);
    		
    	}
    	return String.format("Une souris %s de %d mois et pesant %d grammes", couleur, age, poids);
    }
    
    public void vieillir() {
    	if(clonee) {
    		age += 1 ;
    	}
    	if(age> (int)(ESPERANCE_VIE_DEFAUT/2)  ){
    		
    		couleur = "verte";
    	}
    }
    
    public void evolue() {
    	
    	age = esperanceVie;
    	if(clonee) {
    		couleur = "verte";
    	}
    	
    	
    }
    	
    
    
    
    public int getPoids() {
    	return poids;
    }
    public int getAge( ) {
    	return age;
    }
    public String getCouleur() {
    	return couleur;
    }
    public int getEsperance() {
    	return esperanceVie;
    }
    public boolean getClonee() {
    	return clonee;
    }
}

/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

public class Labo {

    public static void main(String[] args) {
        Souris s1 = new Souris(50, "blanche", 2);
        Souris s2 = new Souris(45, "grise");
        Souris s3 = new Souris(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
