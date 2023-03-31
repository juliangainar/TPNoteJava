package classes;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;
import java.io.Serializable;
/**
 * Classe ModelGestionnaire qui gere les donnees concernant le programme
 * @author Iulian GAINAR
 *
 */
public class ModelGestionnaire implements Serializable {
	// parametres
	private List<Couleur> listeCouleurs = new ArrayList<>();
	private int indiceCouleurCourante;
	private String nomFichierSauvegarde;
	private SimpleObjectProperty<Color> changementCouleur;
    private SimpleStringProperty labelIndice;
	// constructeurs
	
	// accesseurs
	
	// methodes
}
