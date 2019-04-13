package TP4;

public class Fenetre {
	private Rectangle rect;
	private String titre;
	
	
	
	public Rectangle getRect() {
		return rect;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void deplacer(int dx, int dy) {
		rect = new Rectangle();
		rect.getHg().setX(rect.getHg().getX()+dx);
		rect.getBd().setX(rect.getBd().getX()+dx);
		
		rect.getHg().setY(rect.getHg().getY()+dy);
		rect.getBd().setY(rect.getBd().getY()+dy);
		
	}
	
	/*public void agrandir() {
		
		
	}
	
	*/
	
	
	
}
