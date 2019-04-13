package coursera_sem1_exo2;

public class Assistant {
	
	//données
	private int ageLu, argentLu, resultat;
	
	public void lire(Papier billet) {
		System.out.println("[ASSISTANT] (je lis le papier )");
		
		ageLu = billet.lireAge();
		argentLu = billet.lireArgent();
		
	}
	
	public void calculer() {
		System.out.println("[ASSISTANT] (je calcule mentalement) ");
		
		resultat = ((ageLu*2 + 5)*50 + argentLu) - 365; 
		
	}
	
	
	public int annoncer() {
		System.out.println("[ASSISTANT] J'annonce: "+ resultat + " !");
		return resultat;
	}
	
	
	
	

}
