package jeu_morpion;

public class JeuMorpion {

	private final static int VIDE = 0 ;
	private final static int ROND = 1 ;
	private final static int CROIX = 2 ;
	
	
	private int[][] grille;
	
	public void initialise() {
		grille = new int[3][3];
		for(int i=0; i<grille.length ; ++i) {
			for(int j=0; j<grille[i].length; ++j) {
				grille[i][j] = VIDE;
			}
		}
	}
	
	public boolean placerRond(int ligne, int colonne) {
		return placerCoup(ligne, colonne, ROND);
	}
	
	public boolean placerCroix(int ligne, int colonne) {
		return placerCoup(ligne, colonne, CROIX);
	}
	
	
	private boolean placerCoup(int ligne, int colonne, int coup) {
		if(ligne <0 || ligne >= grille.length || colonne <0 || colonne >= grille[ligne].length ) {
			
		}
		if(grille[ligne][colonne] == VIDE) {
			grille[ligne][colonne] = coup;
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
}
