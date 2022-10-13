package rec2bim.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import src.main.java.App;

public class JanelaPrincipal {

    @FXML
    private void carregaTelaJogo(ActionEvent evento) {
        App.pushScreen("JOGO");
    }

}
