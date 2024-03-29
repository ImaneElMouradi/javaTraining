package semaine2_exo7_segmentationDeMots;

import java.util.Scanner;

public class TokenizableString {

	
	private String contenu;
	private int from, len;
	
	
	public TokenizableString(String contenu) {
		this.contenu = contenu;
	}
	
	
	public boolean isSep(char c) {
		
		return (c == ' ');
	}
	
	public void tokenize() {
		System.out.println("Les mots de \"" + contenu + "\"sont : ");
		from = 0 ;
		len = 0;
		while(nextToken()) {
			System.out.println("'" + contenu.substring(from, from+len) + "'");
			from +=len;
		}
	}
	
	public boolean nextToken() {
		int taille = contenu.length();
		
		while((from < taille) && isSep(contenu.charAt(from)))
			++from;
		
		len = 0 ;
		for( int i =0; (( i < taille) && !isSep(contenu.charAt(i))); ++len, ++i);
		
		return (len!=0);
		
		
	}
	
}
