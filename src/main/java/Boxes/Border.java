package Boxes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Border extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btnTop = new Button("Button Top");
        Button btnBottom = new Button("Button Bottom");
        Button btnLeft = new Button("Button Left");
        Button btnRight = new Button("Button Right");
        Button btnCenter = new Button("Button Center");

        btnTop.setMaxWidth(Double.MAX_VALUE);
        btnBottom.setMaxWidth(Double.MAX_VALUE);
        btnLeft.setMaxWidth(Double.MAX_VALUE);
        btnRight.setMaxWidth(Double.MAX_VALUE);
        btnCenter.setMaxWidth(Double.MAX_VALUE);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(btnTop);
        borderPane.setBottom(btnBottom);
        borderPane.setLeft(btnLeft);
        borderPane.setRight(btnRight);
        borderPane.setCenter(btnCenter);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
