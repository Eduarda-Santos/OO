package ifpr.pgua.eic.telas;

import java.net.URL;
import java.util.ResourceBundle;
import ifpr.pgua.eic.models.Professor;
import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Escola;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

//Note que esta classe implementa a interface Initializable. Isso
//indica ao JavaFX que existem componentes que devem ser inicializados
//antes de mostrar a tela. No caso desta tela, significa povoar a lista
//de veículos.
public class JanelaListarProfessor implements Initializable{


    @FXML
    private ListView<Professor> ltvprofessor;

    @FXML
    private TextArea taDetalhes;


    private Escola escola;

    public JanelaListarProfessor(Escola escola){
        this.escola = escola;
    }



    //método utilizado para inicializar os componentes visuais.
    //É executado depois do construtor e antes da tela ser mostrada.
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        
        ltvprofessor.getItems().clear();
        
        //inicialização do listview
        ltvprofessor.getItems().addAll(escola.listaTodosProfessores());
    }


    //Evento que ao clicar em um elemento do listview é executado.
    @FXML
    private void mostrarDetalhes(MouseEvent evento){
        Professor professor = ltvprofessor.getSelectionModel().getSelectedItem();

        if(professor != null){
            taDetalhes.clear();
            taDetalhes.appendText("CPF: "+professor.getCpf()+"\n");
            taDetalhes.appendText("Nome: "+professor.getNome()+"\n");
            taDetalhes.appendText("Telefone: "+professor.getTelefone()+"\n");
            taDetalhes.appendText("E-mail: "+professor.getEmail()+"\n");
            taDetalhes.appendText("Data da Matrícula: "+professor.getSalario()+"\n");
        }
    }

    @FXML
    private void voltar(){
        App.popScreen();
    }
}
