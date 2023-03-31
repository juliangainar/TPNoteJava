package application;
import classes.*; 

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * 
 * @author Iulian GAINAR
 * Classe qui gere les interactions entre la vue et l'utilisateur et le modele
 */
public class Controleur {
	// chargement des elements FXML
	@FXML
	private Button boutonSauvegarder;
	@FXML
	private Button boutonAjouter;
	@FXML
	private Button boutonSupprimer;
	@FXML
	private Label labelNom;
	@FXML
	private Label labelRouge;
	@FXML
	private Label labelVert;
	@FXML
	private Label labelBleu;
	
	// affichage des informations des couleurs dans les labels
	//ModelGestionnaire gest = new ModelGestionnaire("");
	
}
