package oc_tp;

public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	
	// constructeur par d�faut 
	public Ville() {
		System.out.println("Cr�ation d'une ville !");
		nomVille="Inconnu";
		nomPays="Inconnu";
		nbreHabitants = 0 ;
	}
	
	
	//constructeur avec param�tres
	public Ville(String pNom, int pNbre, String pPays)
	  {
	    System.out.println("Cr�ation d'une ville avec des param�tres !");
	    nomVille = pNom;
	    nomPays = pPays;
	    nbreHabitants = pNbre;
	  }        


	  //Les variables et les constructeurs n'ont pas chang�
	          
	  //*************   ACCESSEURS *************
	    
	  //Retourne le nom de la ville
	  public String getNom()  {  
	    return nomVille;
	  }

	  //Retourne le nom du pays
	  public String getNomPays()
	  {
	    return nomPays;
	  }

	  // Retourne le nombre d'habitants
	  public int getNombreHabitants()
	  {
	    return nbreHabitants;
	  } 
	 
	  //*************   MUTATEURS   *************

	  //D�finit le nom de la ville
	  public void setNom(String pNom)
	  {
	    nomVille = pNom;
	  }

	  //D�finit le nom du pays
	  public void setNomPays(String pPays)
	  {
	    nomPays = pPays;
	  }

	  //D�finit le nombre d'habitants
	  public void setNombreHabitants(int nbre)
	  {
	    nbreHabitants = nbre;
	  }  
	}


