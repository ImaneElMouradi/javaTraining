package coursera_sem1_exo2;

public class Magicien {

	private int ageDevine, argentDevine;
	
	public void tourDeMagie(Assistant assist, Spectateur spect) {
		
		Papier billet = new Papier();
		System.out.println("[MAGICIEN] un petit tour de magie...");
		
		spect.ecrire(billet);
		assist.lire(billet);
		assist.calculer();
		
		calculer(assist.annoncer());
		annoncer();
				
	}
	
	
	private void calculer(int resultatRecu) {
		resultatRecu += 115;
		ageDevine = resultatRecu / 100;
		argentDevine = resultatRecu % 100;
		
	}
	
	private void annoncer() {
		System.out.println("[MAGICIEN] hm... je vois que vous êtes agé de "+ ageDevine + " ans ");
		System.out.println("  et que vous avez " + argentDevine + " francs suisses en poche! ");
	}
	
	
	
	
	
	
	
}