package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application
        implements EventHandler<ActionEvent> {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage palco) throws Exception {
        VBox raiz = new VBox(20);
        raiz.setAlignment(Pos.CENTER);
        raiz.setTranslateY(5);

        Button btnUm = new Button("Clique em mim! (Tratador externo)");
        Button btnDois = new Button("Clique em mim! (Expressão Lambda)");
        Button btnTres = new Button("Clique em mim! (Própria classe)");

        // usamos a classe TratadorEvento para cuidar dos eventos
        btnUm.setOnAction(new TratadorEvento());
        // Criando uma instância de uma classe anônima para tratar evento
        btnDois.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent evento) {
                System.out.println("Evento tratado por uma classe anônima!");
            }
        });
        // o botão 3 usa essa própria classe para tratar seus eventos
        btnTres.setOnAction(this);

        raiz.getChildren().addAll(btnUm, btnDois, btnTres);

        Scene cena = new Scene(raiz, 300, 200);
        palco.setTitle("Tratando eventos");
        palco.setScene(cena);
        palco.show();
    }

    /*
     * Como a própria classe TratamentoEventoComBotao implementa
     * a interface EventHandler, ela mesma pode responder a eventos do botão
     *
     */
    public void handle(ActionEvent evento) {
        System.out.println("Evento tratado na próxima classe!");
    }
}