package application;
import java.awt.TextField;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

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
	private TextField labelNom;
	@FXML
	private TextField labelRouge;
	@FXML
	private TextField labelVert;
	@FXML
	private TextField labelBleu;
	@FXML
	private ListView listeCouleurs; 
	
	// affichage des informations des couleurs dans les labels
	//ModelGestionnaire gest = new ModelGestionnaire("");
	
	// tests sur les boutons
	/*
	 * Lorsque l'utilisateur appuie sur le bouton sauvergarder, on sauvegarde les informations de la collection dans le fichier
	 * @author Iulian GAINAR
	 * */
	@FXML
	private void buttonSauvegarder(ActionEvent evt) {
		if(evt.getSource() instanceof Button) {
			Button bt = (Button) evt.getSource();
			if(bt.isPressed()) {
				System.out.println("L'utilisateur veut sauvegarder");
			}
			
		}
	}
	
	/*
	 * Lorsque l'utilisateur appuie sur le bouton ajouter, on ajoute la couleur dans la liste des couleurs
	 * @author Iulian GAINAR
	 * */
	@FXML
	private void buttonAjouter(ActionEvent evt) {
		if(evt.getSource() instanceof Button) {
			Button bt = (Button) evt.getSource();
			if(bt.isPressed()) {
				System.out.println("L'utilisateur veut ajouter une couleur a la liste");
			}
			
		}
	}
	
	/*
	 * Lorsque l'utilisateur appuie sur le bouton supprimer, on supprime la couleur de la liste des couleurs
	 * @author Iulian GAINAR
	 * */
	@FXML
	private void buttonSupprimer(ActionEvent evt) {
		if(evt.getSource() instanceof Button) {
			Button bt = (Button) evt.getSource();
			if(bt.isPressed()) {
				System.out.println("L'utilisateur veut ajouter supprimer une couleur de la liste");
			}
			
		}
	}
	
	
	
}
