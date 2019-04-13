/**  Classe Java correspondant à une pile
 Une pile est un objet sur lequel on empile des éléments ( dans notre cas des caractères ) 4
 Une pile est un tableau et un sommet
 On n'a accès qu'au sommet du tableau dans une pile, on travaille avec le principe du LIFO */

public class Pile {
  //
  //  Déclarations des attributs de la pile
  //
  static final int MAX = 8;
  char t[];
  int top;
  //
  //  Programmation des opérations (méthodes) de la pile
  //
  public Pile() {
    // Initialise une pile vide
    t = new char[MAX];
    top = -1; //le sommet est à -1 puisque la pile (le tableau ) est vide
  }

  public void empiler(char c) throws ExceptionPileOverflow {
    // Empile le caractère donné en paramètre
    if (!estPleine())
      t[++top] = c;
    else
      throw new ExceptionPileOverflow();
    }

    public char sommet() throws ExceptionPileUnderflow {
      // Retourne le caractère au sommet de la pile, sinon '\0'
      if(!estVide())
        return t[top];
      else
       throw new ExceptionPileUnderflow();
    }


    public void depiler() throws ExceptionPileUnderflow {
      //    décapite la pile (retire le sommet )
      if(!estVide())
        top--;
      else
    	throw new ExceptionPileUnderflow();

    }


    public boolean estVide() {
      //    Teste si la pile est vide
      return (top < 0);
    }

    public boolean estPleine() {
      // teste si la pile est pleine
      return (top > MAX-1);
    }

  }; // class Pile
  
  
  class ExceptionPileUnderflow extends Throwable {}
  class ExceptionPileOverflow extends Throwable {}
  
