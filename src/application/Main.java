package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//--module-path /usr/lib/jvm/javafx-sdk-11.0.1/lib --add-modules=javafx.controls
//MAKE SURE TO ALWAYS ADD THAT


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
			//System.out.println("hello");
			Scene scene = new Scene(root,1000,800);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Tailor System");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application.launch(Main.class,args);
		//launch(args);
	}
}
