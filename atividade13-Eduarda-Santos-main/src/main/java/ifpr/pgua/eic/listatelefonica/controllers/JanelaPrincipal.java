package ifpr.pgua.eic.listatelefonica.controllers;

import ifpr.pgua.eic.listatelefonica.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class JanelaPrincipal {
    @FXML
    private void carregaTelaCadastro(ActionEvent evento) {
        App.pushScreen("CADASTRO");
    }

    @FXML
    private void carregaTelaListar(ActionEvent evento) {
        App.pushScreen("LISTAR");
    }
}
