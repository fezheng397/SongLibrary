/**
 * Written by Marco Vlajnic and Felix Zheng 
 */

package songlibrary.app;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;

public class SongLib extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/songlibrary.view/Layout.fxml"));
		
		Parent root;
		
		try {
			root = loader.load();
		} catch (IOException e) {
			return;
		}
		
		Scene scene = new Scene(root, 1000, 800);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Song Library");
		primaryStage.setResizable(false);  
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

