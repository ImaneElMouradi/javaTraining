/* 
 * Une interface est une collection nomm�e 
 * de d�clarations  de m�thodes (sans les 
 *  impl�mentations). Une interface peut 
 *  aussi d�clarer des constantes.
 *   
 */

public interface MonInterface {
	public int x=2;
	public void f(); // methode non statique a implementer. Non static

// on ne pourra pas la definir ici 
// car une interface ne peut avoir  de methode static
}


