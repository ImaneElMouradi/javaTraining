package coursera_sem1_exo2;

public class Papier {
	
	//donnees sur le papier
	private int age, argent;
	
	//ecrire un billet
	public void ecrire(int unAge, int unMontant) {
		age = unAge;
		argent = unMontant;
	}
	
	
	//lecture des donnees
	public int lireAge() { return age;}
	public int lireArgent() { return argent; }
	
	
	
	
	

}
