
public class Article {
	
	private String nom;
	private double prixUnitaire;
	private boolean solde;
	
	
	public Article(String nom, double prixUnitaire, boolean solde ) {
		
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.solde = solde;
		
	}
	
	
	
	public String getNom() {
		return nom;
	}
	
	public double getPrixU() {
		return prixUnitaire;
	}
	
	public boolean estEnSolde() {
		return solde;
	}
	
	
	
}
