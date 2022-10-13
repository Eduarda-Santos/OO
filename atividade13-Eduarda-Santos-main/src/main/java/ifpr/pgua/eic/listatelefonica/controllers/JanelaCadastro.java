package ifpr.pgua.eic.listatelefonica.controllers;

import ifpr.pgua.eic.listatelefonica.App;
import ifpr.pgua.eic.listatelefonica.models.ListaTelefonica;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class JanelaCadastro {
    @FXML
    private TextField Tfnome;

    @FXML
    private TextField Tftelefone;

    @FXML
    private TextField Tfemail;

    // private Contato contatos;
    private ListaTelefonica contatos;

    public JanelaCadastro(ListaTelefonica contatos) {
        this.contatos = contatos;
    }

    @FXML
    private void cadastrar() {
        String nome = Tfnome.getText();
        String telefone = Tftelefone.getText();
        String email = Tfemail.getText();

        if (contatos.adicionarContato(nome, telefone, email)) {
            Alert alert = new Alert(AlertType.INFORMATION, "Cadastro realizado");
            alert.showAndWait();
            limpar();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION, "Cadastro não realizado");
            alert.showAndWait();
        }
    }

    @FXML
    private void cancelar() {
        App.popScreen();
    }

    private void limpar() {
        Tfnome.clear();
        Tfemail.clear();
        Tftelefone.clear();
    }
}
