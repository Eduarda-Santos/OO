package src.main.java;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import rec2bim.controllers.JanelaJogoController;
import rec2bim.controllers.JanelaPrincipal;
import rec2bim.models.Jogo;
import rec2bim.utils.BaseAppNavigator;
import rec2bim.utils.ScreenRegistryFXML;

import java.io.IOException;




/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private Jogo jogo;

    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();

        
        jogo = new Jogo();
    }

    @Override
    public void stop() throws Exception {
        // TODO Auto-generated method stub
        super.stop();

    }

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "Jogo";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, "principal.fxml", o->new JanelaPrincipal()));
        registraTela("JOGO", new ScreenRegistryFXML(App.class, "janela_jogo.fxml", o->new JanelaJogoController(jogo)));
        
    }

}