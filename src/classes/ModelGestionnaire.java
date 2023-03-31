package classes;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/**
 * Classe ModelGestionnaire qui gere les donnees concernant le programme
 * @author Iulian GAINAR
 *
 */
public class ModelGestionnaire implements Serializable {
	// parametres
	private List<Couleur> couleurs;
	private int indiceCouleurCourante;
	private String nomFichierSauvegarde;
	private SimpleObjectProperty<Color> changementCouleur;
    
	// constructeurs
    /**
     * Constructeur de la classe ModelGestionnaire avec 1 parametre
     * @author Iulian GAINAR
     * @param nomFichierSauvegarde
     */
	public ModelGestionnaire(String nomFichierSauvegarde) {
		this.couleurs = new ArrayList<>();
		// on initialise sur la premiere couleur de la collection
		this.indiceCouleurCourante = 0; 
		this.nomFichierSauvegarde = nomFichierSauvegarde;
		//this.changementCouleur = new SimpleObjectProperty<>(couleurs.get(indiceCouleurCourante));
		
		
		// chargement du fichier de sauvegarde
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichierSauvegarde))) {
			// on charge les donnees depuis le fichier
            ModelGestionnaire model = (ModelGestionnaire) ois.readObject(); // on lit l'objet
            couleurs = model.getCouleurs(); // on sauvegarde la liste de ses couleurs dans le model
            this.indiceCouleurCourante = model.getIndiceCouleurCourante(); // on modifie l'indice de la couleur courante a celle de l'objet
            //this.changementCouleur.set(couleurs.get(indiceCouleurCourante));
        } catch (IOException | ClassNotFoundException e) {
        	// sinon on lance une exception
            e.printStackTrace();
        }
	}
	// accesseurs
	public List<Couleur> getCouleurs() {
        return this.couleurs;
    }

    public void setCouleurs(List<Couleur> couleurs) {
        this.couleurs = couleurs;
    }

    public int getIndiceCouleurCourante() {
        return this.indiceCouleurCourante;
    }

    public void setIndiceCouleurCourante(int indiceCouleurCourante) {
        this.indiceCouleurCourante = indiceCouleurCourante;
        //changementCouleur.set(couleurs.get(indiceCouleurCourante));
    }

    public String getNomFichierSauvegarde() {
        return this.nomFichierSauvegarde;
    }

    public SimpleObjectProperty<Color> getchangementCouleur() {
        return this.changementCouleur;
    }

	// methodes
}
