package testsUnitaires;
import classes.ModelGestionnaire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/**
 * Classe de test pour la classe ModelGestionnaire
 * @author Iulian GAINAR
 *
 */
class TestModelGestionnaire {
	
	ModelGestionnaire leModel = new ModelGestionnaire("test.txt");

	@Test
	void testCheminFichier() {
		
		// test sur le chemin du fichier
		if(leModel.getNomFichierSauvegarde() != "test.txt") {
			System.out.println("Test echoue");
		}else {
			System.out.println("Test reussi");
		}
		
	}
	@Test
	void testIndiceAuDebut() {
		// test sur l'initialisation a 0 de l'indice
				if(leModel.getIndiceCouleurCourante() != 0) {
					System.out.println("Test echoue");
				}else {
					System.out.println("Test reussi");
				}
	}

}
