import java.util.Scanner;


class Bonjour {    
static public void main(String args[]) {    
	// Partie D�claration         
	int age;        
	String nom;        
	double taille;        

	Scanner clavier = new Scanner(System.in);
	
	// Partie lecture de donn�es
    System.out.print("Quelle est votre nom?: ");    
    nom = clavier.nextLine();       
    System.out.print("Quelle est votre age?: ");        
    age = clavier.nextInt();       
    System.out.print("Quelle est votre taille?: ");        
    taille = clavier.nextDouble();       


    // Partie sortie des r�sultats        
    /* System.out.println("Bonjour "+nom);       
    System.out.print("Vous avez "+age+" ans");        
    System.out.println(" et vous mesurez "+taille+" metres");    */

    System.out.format("Bonjour %s %nVous avez %d ans", nom, age);        
    System.out.format(" et vous mesurez %.1f metres %n", taille);
	
	} 

};
