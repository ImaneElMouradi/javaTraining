package semaine2_exo5_banques;

public class Compte {

		private double taux, solde;
		
		public Compte(double taux, double solde) {
			this.taux = taux;
			this.solde = solde;
		}
	
		
		public double getSolde() {
			return solde;
		}
		
		
		public void boucler() {
			// Cette méthode ajoute les intérêts au solde
			double interets = taux * solde;
			solde = solde + interets;
		}
		
		
		
}
