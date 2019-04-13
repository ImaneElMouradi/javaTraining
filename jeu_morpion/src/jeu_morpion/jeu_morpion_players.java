package jeu_morpion;

public class jeu_morpion_players {

	public static void main(String[] args) {
		
		boolean valide;
		
		
		JeuMorpion jeu = new JeuMorpion();
		
		jeu.initialise();
		
		valide = jeu.placerRond(0,0);
		
		System.out.println(valide);
		
		valide = jeu.placerRond(0,0);
		
		System.out.println(valide);

	}

}
