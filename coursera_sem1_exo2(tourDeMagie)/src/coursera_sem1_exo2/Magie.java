package coursera_sem1_exo2;

public class Magie {

	public static void main(String[] args) {
		//l'histoire générale !
		
		Spectateur spect = new Spectateur();
		spect.arriver();
		
		Magicien mag = new Magicien();
		Assistant assist = new Assistant();
		
		mag.tourDeMagie(assist, spect);
		

	}

}
