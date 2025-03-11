package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 300);

        TextField txtName = new TextField();
        txtName.setPromptText("Adicione o nome");
        pane.getChildren().add(txtName);

        PasswordField txtPass = new PasswordField();
        txtPass.setPromptText("Adicione a senha");
        pane.getChildren().add(txtPass);

        Button btnEnter = new Button("Entrar");
        pane.getChildren().add(btnEnter);

        Scene scene = new Scene(pane, 400, 300);
        stage.setTitle("Formulário 01");
        stage.setScene(scene);
        stage.show();

        txtName.setLayoutX((pane.getWidth() - txtName.getWidth()) / 2);
        txtName.setLayoutY(50);

        txtPass.setLayoutX((pane.getWidth() - txtPass.getWidth()) / 2);
        txtPass.setLayoutY(100);

        btnEnter.setLayoutX((pane.getWidth() - btnEnter.getWidth()) / 2);
        btnEnter.setLayoutY(150);
    }
}