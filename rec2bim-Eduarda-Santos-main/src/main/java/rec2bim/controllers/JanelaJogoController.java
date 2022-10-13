package rec2bim.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import rec2bim.models.Jogo;
import src.main.java.App;


public class JanelaJogoController {

    @FXML
    private TextField tfMax;

    private Jogo jogo;

    public JanelaJogoController(Jogo jogo){
        this.jogo = jogo;
    }

    @FXML
    private void maximo() {
        String maximo = tfMax.getText();        
        int max = Integer.valueOf(maximo);
        
        if(max > 0){
            jogo.setMax(max);
        }
        
    }

    @FXML
    private void iniciar(){
        
        jogo.iniciar();

    }

    @FXML
    private TextField tfVal;

    @FXML
    private void tentar(){        
        String valor = tfVal.getText();
        int val = Integer.valueOf(valor);

        int tentativa = jogo.tentar(val);

        switch (tentativa) {
            case -1:
            System.out.printf("Chutou para baixo!");
                
            case 1:
            System.out.printf("Chutou para cima!");

            case 0:
            System.out.printf("Acertou!" + jogo.getTentativas());
            break;
                
        }
    }

}
