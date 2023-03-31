package testsUnitaires;
import classes.Couleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Classe de test pour la classe Couleur
 * @author Iulian GAINAR
 *
 */
class TestCouleur {
	Couleur maCouleur = new Couleur("TestCouleur",1,2,3);
	@Test
	void testNomCouleur() {
		// test sur le nom de la couleur
				if(maCouleur.getNom() != "TestCouleur") {
					System.out.println("Test echoue");
				}else {
					System.out.println("Test reussi");
				}
	}
	@Test
	void testR() {
		// test sur le nom de la couleur
				if(maCouleur.getR() != 1) {
					System.out.println("Test echoue");
				}else {
					System.out.println("Test reussi");
				}
	}
	@Test
	void testG() {
		// test sur le nom de la couleur
				if(maCouleur.getG() != 2) {
					System.out.println("Test echoue");
				}else {
					System.out.println("Test reussi");
				}
	}
	@Test
	void testB() {
		// test sur le nom de la couleur
				if(maCouleur.getB() != 3) {
					System.out.println("Test echoue");
				}else {
					System.out.println("Test reussi");
				}
	}


}
