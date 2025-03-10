module edu.pucgoias.aulasjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.pucgoias.aulasjavafx to javafx.fxml;
    exports edu.pucgoias.aulasjavafx;
}