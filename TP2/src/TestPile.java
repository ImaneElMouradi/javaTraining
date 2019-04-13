// programme qui imprime une str inversée

import java.util.Scanner;

public class TestPile
{   
  static public void main (String args[])
  {
    Pile p = new Pile();
    char c;
    
    Scanner clavier = new Scanner(System.in);

    System.out.println("Entrer char (# = fin)");

    while ((c=clavier.next().charAt(0))!='#')
    {
    	try {
    		p.empiler (c);
    	    System.out.println("Entrer char (# = fin)");
    	}
    	catch(ExceptionPileOverflow e)  {
    		System.out.println("Pile pleine");
    		e.printStackTrace();
    	}
      
     
    }
          
    while (!p.estVide())
    {
    	try {
    		c = p.sommet();
    	    System.out.println(c);
    	    p.depiler();
    	}
    	catch(ExceptionPileUnderflow e) {
    		System.out.println("Pile vide");
    		e.printStackTrace();
    	}
    }

  }
}
