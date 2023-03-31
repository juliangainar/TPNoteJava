package classes;


/**
 * Classe couleur gerant les proprietes d'une couleur
 * @author Iulian GAINAR
 *
 */
public class Couleur {
	// parametres
	private String nom;
	private int r;
	private int g;
	private int b;
	
	// constructeurs
	/**
	 * Constructeur de la classe Couleur prenant 4 parametres
	 * @author Iulian GAINAR
	 * @param nom
	 * @param r
	 * @param g
	 * @param b
	 */
	public Couleur(String nom, int r, int g, int b) {
		this.nom = nom;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	// accesseurs
	public String getNom() {
		return this.nom;
	}
	
	public int getR() {
		return this.r;
	}
	public int getG() {
		return this.g;
	}
	public int getB() {
		return this.b;
	}
	
	public void setR(int r) {
		if(r > 0) {
			this.r = r;
		}
	}
	public void setG(int g) {
		if(g > 0) {
			this.g = g;
		}
	}
	public void setB(int b) {
		if(b > 0) {
			this.b = b;
		}
	}
	// methodes
	
	
}
