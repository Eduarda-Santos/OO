package ifpr.pgua.eic.telas;

import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Escola;
//import ifpr.pgua.eic.models.Professor;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class JanelaCadastroCurso{
    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfCargaHoraria;

    private Escola escola;
    
    public JanelaCadastroCurso(Escola escola){
        this.escola = escola;
    }

    @FXML
    private void cadastrar(){
        String scodigo = tfCodigo.getText();
        String nome = tfNome.getText();
        String scargaHoraria = tfCargaHoraria.getText();
        //String professor = TfProfessor.getText();

        int codigo = Integer.valueOf(scodigo);
        int cargaHoraria = Integer.valueOf(scargaHoraria);

        if(escola.cadastrarCurso(codigo, nome, cargaHoraria)){
            Alert alert = new Alert(AlertType.INFORMATION, "Cadastro realizado");
            alert.showAndWait();
            limpar();
        }else{
            Alert alert = new Alert(AlertType.INFORMATION, "Cadastro não realizado");
            alert.showAndWait();
        }
    }

    @FXML
    private void cancelar(){
        App.popScreen();
    }

    private void limpar(){
        tfCodigo.clear();
        tfNome.clear();
        tfCargaHoraria.clear();
        //TfProfessor.clear();
    }

    @FXML
    private void voltar(){
        App.popScreen();
    }
}
