package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage palco) throws Exception {
        VBox raiz = new VBox(10);
        raiz.setAlignment(Pos.CENTER);

        Label rotuloDem = new Label("Deixe seu comentário");
        rotuloDem.setTooltip(new Tooltip(
                "Formulário para entrada de comentários"
        ));

        TextField campoTexto = new TextField("Informe seu nome");
        campoTexto.setTooltip(new Tooltip(
                "Este campo suporta apenas uma linha"
        ));

        TextArea areaTexto = new TextArea("Entre com seu comentário\n" +
                "Este campo suporta várias linhas");
        areaTexto.setTooltip(new Tooltip(
                "Campo de texto para entrada de múltiplas linhas"
        ));

        Separator separadorHor = new Separator();
        Separator separadorVer = new Separator(Orientation.VERTICAL);
        Slider deslizante = new Slider();
        deslizante.setShowTickLabels(true);
        deslizante.setShowTickMarks(true);
        Label valoresSlide = new Label();

        deslizante.setOnDragDetected(evento -> {
            System.out.println("Arrastando");
            valoresSlide.setText("Arrastando");
            deslizante.startFullDrag();
        });

        deslizante.
                setTooltip(new Tooltip(
                        "O controle deslizante tem um valor numérico de acordo com sua posição"
                ));

        raiz.getChildren().addAll(rotuloDem, campoTexto, areaTexto,
                separadorVer, separadorHor, deslizante, valoresSlide);

        Scene cena = new Scene(raiz, 300, 400);
        palco.setTitle("Controles Básicos 1");
        palco.setScene(cena);
        palco.show();
    }
}