package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;


/**
 * @author Iulian GAINAR
 *	Methode principale qui lance l'application
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("IHM.fxml")); // border pane par defaut
			Scene scene = new Scene(root,500,400); // modification en 500 x 400
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			// ajout du titre/
			primaryStage.setTitle("Gestionnaire de couleurs");
			// ajout de l'icone de 3iL
			primaryStage.getIcons().add(new Image("/resources/logo_3il.png"));
			// desactiver la taille modifiable
			primaryStage.setResizable(false);
			// modification de la couleur de fond
			scene.setFill(Color.LIGHTGREY);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
