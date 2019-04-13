package semaine2_exo5_banques;

public class Client {

	private String nom, ville;
	private Compte cpt1, cpt2;
	private boolean masculin;
	
	public Client(String nom, String ville, double taux1, double solde1, double taux2, double solde2, boolean masculin) {
		this.nom = nom;
		this.ville = ville;
		// compte privé
		cpt1 = new Compte(taux1,solde1);
		// compte d'épargne
		cpt2 = new Compte(taux2,solde2);
		
		
		this.masculin = masculin;
			
	}
	
	public void afficher() {
		// Cette méthode affiche les données du client
		if(masculin) {
			System.out.println("Client " + nom + " de " + ville);
		}else {
			System.out.println("Cliente " + nom + " de " + ville);
		}
				
		System.out.println("   Compte privé:     " + cpt1.getSolde() + " francs");
		System.out.println("   Compte d'épargne: " + cpt2.getSolde() + " francs");
	}
	
	public void boucler() {
		// Cette méthode boucle les deux comptes du client
		cpt1.boucler();
		cpt2.boucler();
	}
		
}
