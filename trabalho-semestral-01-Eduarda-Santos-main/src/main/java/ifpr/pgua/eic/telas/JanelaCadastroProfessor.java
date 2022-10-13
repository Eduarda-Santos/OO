package ifpr.pgua.eic.telas;

import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Escola;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class JanelaCadastroProfessor{
    @FXML
    private TextField tfCpf;

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfTelefone;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfSalario;


    private Escola escola;
    
    public JanelaCadastroProfessor(Escola escola){
        this.escola = escola;
    }

    @FXML
    private void cadastrar(){
        String cpf = tfCpf.getText();
        String nome = tfNome.getText();
        String telefone = tfTelefone.getText();
        String email = tfEmail.getText();
        double salario = Double.parseDouble(tfSalario.getText()); 

        try{
            salario = Double.parseDouble(tfSalario.getText());
        }catch(NumberFormatException ex){}

        if(escola.cadastrarProfessor(cpf, nome, telefone, email, salario)){
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

    @FXML
    private void limpar(){
        tfCpf.clear();
        tfNome.clear();
        tfEmail.clear();
        tfTelefone.clear();
        tfSalario.clear();
    }

    @FXML
    private void voltar(){
        App.popScreen();
    }
}
