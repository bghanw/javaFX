package HandVBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;



public class HandVBox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox(20);
        hbox.setPadding(new Insets(20));
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        //HBox.setMargin(btn2, new Insets(0, 50, 0, 0)); // top, right, bottom, left
        HBox.setHgrow(btn1, Priority.ALWAYS);
        //btn1.setMaxWidth(200);
        btn1.setMaxWidth(Double.MAX_VALUE);
        hbox.getChildren().addAll(btn1,btn2, btn3);
        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
