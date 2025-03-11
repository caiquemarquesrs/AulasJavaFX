package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    /*private final String IMG_URL =
            "https://www.itabirito.mg.leg.br/imagens/face.png/image";*/

    private final String IMG_URL =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpevfm2P0BtgC9LbXH1n2Xp-oR-iLX8xQTBg&s";

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(IMG_URL);
        ImageView viewImage = new ImageView(image);
        viewImage.setTranslateX(0);
        viewImage.setTranslateY(0);

        Text txtInfo = new Text("Logo X desenhado com JavaFX");
        txtInfo.setTranslateX(10);
        txtInfo.setTranslateY(15);

        Group components = new Group(); // 9
        components.getChildren().addAll(viewImage,
                txtInfo);
        Scene cena = new Scene(components, 250, 250);
        stage.setTitle("Imagens em JavaFX");
        stage.setScene(cena);
        stage.show();
    }
}