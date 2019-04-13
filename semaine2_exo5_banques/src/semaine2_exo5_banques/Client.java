package semaine2_exo5_banques;

public class Client {

	private String nom, ville;
	private Compte cpt1, cpt2;
	private boolean masculin;
	
	public Client(String nom, String ville, double taux1, double solde1, double taux2, double solde2, boolean masculin) {
		this.nom = nom;
		this.ville = ville;
		// compte priv�
		cpt1 = new Compte(taux1,solde1);
		// compte d'�pargne
		cpt2 = new Compte(taux2,solde2);
		
		
		this.masculin = masculin;
			
	}
	
	public void afficher() {
		// Cette m�thode affiche les donn�es du client
		if(masculin) {
			System.out.println("Client " + nom + " de " + ville);
		}else {
			System.out.println("Cliente " + nom + " de " + ville);
		}
				
		System.out.println("   Compte priv�:     " + cpt1.getSolde() + " francs");
		System.out.println("   Compte d'�pargne: " + cpt2.getSolde() + " francs");
	}
	
	public void boucler() {
		// Cette m�thode boucle les deux comptes du client
		cpt1.boucler();
		cpt2.boucler();
	}
		
}
