package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    private Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        button = new Button();
        button.setText("HEllo world");

        Label label = new Label();
        label.setText("Hey how are yout");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label);

        URL url = this.getClass().getResource("sample.css");
        if (url == null) {
            System.out.println("Resource not found. Aborting.");
            System.exit(-1);
        }
        String css = url.toExternalForm();
        layout.getStylesheets().add(css);

        button.setOnAction(e -> primaryStage.setScene(new Scene(vBox, 300, 275)));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
