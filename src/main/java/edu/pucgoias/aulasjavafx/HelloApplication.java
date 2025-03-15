package edu.pucgoias.aulasjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class HelloApplication extends Application{

    @Override
    public void start(Stage palco) throws Exception {
        palco.setTitle("Cadastro de Usuário");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Label lblUsername = new Label("Username:");
        TextField txtUsername = new TextField();
        Label lblNome = new Label("Nome:");
        TextField txtNome = new TextField();
        Label lblDataNascimento = new Label("Data de Nascimento:");
        DatePicker datePicker = new DatePicker();
        Label lblCEP = new Label("CEP:");
        TextField txtCEP = new TextField();
        Label lblPais = new Label("País:");
        TextField txtPais = new TextField();
        Label lblCpf = new Label("CPF:");
        TextField txtCpf = new TextField();
        Label lblSenha = new Label("Senha:");
        PasswordField txtSenha = new PasswordField();
        Label lblObservacoes = new Label("Observações:");
        TextArea txtObservacoes = new TextArea();
        Button btnEnviar = new Button("Enviar");
        Label lblMensagem = new Label();
        Button btnCancelar = new Button("Cancelar");
        btnEnviar.setOnAction(e -> {
            if (validarCampos(txtUsername, txtNome, txtCEP, txtPais, txtCpf, txtSenha, lblMensagem)) {
                lblMensagem.setText("Cadastro realizado com sucesso!");
            }
        });
        btnCancelar.setOnAction(e -> {
            txtUsername.clear();
            txtNome.clear();
            datePicker.setValue(null);
            txtCEP.clear();
            txtPais.clear();
            txtCpf.clear();
            txtSenha.clear();
            txtObservacoes.clear();
            lblMensagem.setText("");
        });
        grid.add(lblUsername, 0, 0);
        grid.add(txtUsername, 1, 0);
        grid.add(lblNome, 0, 1);
        grid.add(txtNome, 1, 1);
        grid.add(lblDataNascimento, 0, 2);
        grid.add(datePicker, 1, 2);
        grid.add(lblCEP, 0, 3);
        grid.add(txtCEP, 1, 3);
        grid.add(lblPais, 0, 4);
        grid.add(txtPais, 1, 4);
        grid.add(lblCpf, 0, 5);
        grid.add(txtCpf, 1, 5);
        grid.add(lblSenha, 0, 6);
        grid.add(txtSenha, 1, 6);
        grid.add(lblObservacoes, 0, 7);
        grid.add(txtObservacoes, 1, 7);
        grid.add(btnEnviar, 0, 8);
        grid.add(btnCancelar, 1, 8);
        grid.add(lblMensagem, 0, 9, 2, 1);
        Scene scene = new Scene(grid, 700, 500);
        palco.setScene(scene);
        palco.show();
    }
    private boolean validarCampos(TextField username, TextField nome, TextField cep, TextField pais, TextField cpf, PasswordField senha, Label mensagem) {
        if (username.getText().isEmpty() || nome.getText().isEmpty() || cep.getText().isEmpty() || pais.getText().isEmpty() || cpf.getText().isEmpty() || senha.getText().isEmpty()) {
            mensagem.setText("Todos os campos obrigatórios devem ser preenchidos.");
            return false;
        }
        if (!cep.getText().matches("\\d{8}")) {
            mensagem.setText("CEP deve conter 8 dígitos.");
            return false;
        }
        if (!cpf.getText().matches("\\d{11}")){
            mensagem.setText("CPF deve conter 11 dígitos.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        launch(args);
    }
    }