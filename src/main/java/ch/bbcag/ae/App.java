package ch.bbcag.ae;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane rootPane = new BorderPane();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(rootPane));
        primaryStage.show();
    }
}
