package ifpr.pgua.eic.telas;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Aluno;
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
public class JanelaListarAluno implements Initializable{


    @FXML
    private ListView<Aluno> ltvaluno;

    @FXML
    private TextArea taDetalhes;


    private Escola escola;

    public JanelaListarAluno(Escola escola){
        this.escola = escola;
    }



    //método utilizado para inicializar os componentes visuais.
    //É executado depois do construtor e antes da tela ser mostrada.
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        
        ltvaluno.getItems().clear();
        
        //inicialização do listview
        ltvaluno.getItems().addAll(escola.listaTodosAlunos());    
    }


    //Evento que ao clicar em um elemento do listview é executado.
    @FXML
    private void mostrarDetalhes(MouseEvent evento){
        Aluno aluno = ltvaluno.getSelectionModel().getSelectedItem();

        if(aluno != null){
            taDetalhes.clear();
            taDetalhes.appendText("CPF: "+aluno.getCpf()+"\n");
            taDetalhes.appendText("Nome: "+aluno.getNome()+"\n");
            taDetalhes.appendText("Telefone: "+aluno.getTelefone()+"\n");
            taDetalhes.appendText("E-mail: "+aluno.getEmail()+"\n");
            taDetalhes.appendText("Data da Matrícula: "+aluno.getDataMatricula()+"\n");
        }
    }


    //utilizado para voltar uma tela.
    @FXML
    private void voltar(){
        App.popScreen();
    }
    
}
