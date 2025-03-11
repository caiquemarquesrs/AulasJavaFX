package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        pane.setPrefSize(400, 300);

        TextField txtName = new TextField();
        txtName.setPromptText("Adicione o nome");
        TextField txtPass = new TextField();
        txtPass.setPromptText("Adicione a senha");

        pane.getChildren().addAll(txtName, txtPass);

        Scene scene = new Scene(pane, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}