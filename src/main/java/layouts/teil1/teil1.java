package layouts.teil1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class teil1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Title 1
        Text textTitle = new Text("Team Chat");
        textTitle.setFont(Font.font("Helvetica", FontPosture.REGULAR, 40));
        BorderPane.setMargin(textTitle, new Insets(0, 100, 25, 100));

        //Chat und vbox
        Text firstChat = new Text("Tschou zäme");
        VBox chat1 = new VBox(firstChat);
        Text secondChat = new Text("Ciao");
        VBox chat2 = new VBox(secondChat);
        Text thirdChat = new Text("Sit er aui zwäg?");
        VBox chat3 = new VBox(thirdChat);
        Text fourthChat = new Text("Ja eh, du?");
        VBox chat4 = new VBox(fourthChat);
        VBox chat = new VBox(chat1, chat2, chat3, chat4);
        chat.setMaxHeight(300);
        chat.setPadding(new Insets(0, 50, 0,20));

        //chat1.setStyle("-fx-background-color: #d1e8ff;");
        chat1.setBackground(new Background(new BackgroundFill(Color.web("#d1e8ff"), new CornerRadii(10), Insets.EMPTY)));
        chat2.setBackground(new Background(new BackgroundFill(Color.web("#d1e8ff"), new CornerRadii(10), Insets.EMPTY)));
        chat3.setBackground(new Background(new BackgroundFill(Color.web("#d1e8ff"), new CornerRadii(10), Insets.EMPTY)));
        chat4.setBackground(new Background(new BackgroundFill(Color.web("#d1e8ff"), new CornerRadii(10), Insets.EMPTY)));
        VBox.setMargin(chat, new Insets(20,20,20,20));
        VBox.setMargin(chat1, new Insets(10, 0, 10, 0));
        VBox.setMargin(chat2, new Insets(10, 0, 10, 0));
        VBox.setMargin(chat3, new Insets(10, 0, 10, 0));
        VBox.setMargin(chat4, new Insets(10, 0, 10, 0));
        chat2.setAlignment(Pos.CENTER_RIGHT);
        chat4.setAlignment(Pos.CENTER_RIGHT);

        //Textarea
        TextArea textarea = new TextArea();
        VBox TextArea = new VBox(textarea);
        VBox.setMargin(textarea, new Insets(100,20,20,20));

        //send Button
        Button senden = new Button("Senden");
        VBox.setMargin(senden, new Insets(0, 0, 0, 380));

        //Title1, Chat and Send Button
        VBox vBox = new VBox();
        vBox.getChildren().addAll(textTitle, chat, textarea, senden);

        //Chat space
        VBox.setMargin(firstChat, new Insets(10, 10, 10,10));
        VBox.setMargin(secondChat, new Insets(10, 10, 10, 0));
        VBox.setMargin(thirdChat, new Insets(10, 10, 10, 10));
        VBox.setMargin(fourthChat, new Insets(10, 10, 10, 10));

        //Border Pane
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(vBox);
        Scene scene = new Scene(borderPane, 500, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
