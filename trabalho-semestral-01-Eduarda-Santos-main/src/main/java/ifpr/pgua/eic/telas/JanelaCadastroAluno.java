package ifpr.pgua.eic.telas;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;

import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Escola;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class JanelaCadastroAluno{
    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfEmail;

    @FXML
    private DatePicker sdataMatricula;

    private Escola escola;
    //LocalDate dataMatricula;
    
    public JanelaCadastroAluno(Escola escola){
        this.escola = escola;
    }

    @FXML
    private void cadastrar(){
        String cpf = tfCpf.getText();
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
        String email = tfEmail.getText();
        LocalDate dataMatricula = sdataMatricula.getValue();
        //String dataMatricula = TfdataMatricula.getText();
        //String dataMatricula = TfdataMatricula.getText();
        /*
        LocalDate TfdataMatricula = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = TfdataMatricula.format(formatter);
        LocalDate dataMatricula = LocalDate.parse(text, formatter);
        */
        //LocalDate dataMatricula = TfdataMatricula;

        if(escola.cadastrarAluno(cpf, nome, telefone, email, dataMatricula)){
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
        tfCpf.clear();
        tfNome.clear();
        tfEmail.clear();
        tfTelefone.clear();
        //TfDataMatricula.clear();
    }

    @FXML
    private void voltar(){
        App.popScreen();
    }
}
