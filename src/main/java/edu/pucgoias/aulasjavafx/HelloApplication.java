package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {
    @Override
    public void start(Stage palco) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        StackPane raiz = new StackPane();
        Label lblMensagem = new Label();

        lblMensagem.setText("Iniciando com JavaFX!");
        raiz.getChildren().add(lblMensagem);

        Scene cena = new Scene(raiz, 250, 100);
        palco.setTitle("Learning JavaFX");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch();
    }
}