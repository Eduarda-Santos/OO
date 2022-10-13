package ifpr.pgua.eic.telas;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.App;
import ifpr.pgua.eic.models.Aluno;
import ifpr.pgua.eic.models.Curso;
import ifpr.pgua.eic.models.Escola;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

//Note que esta classe implementa a interface Initializable. Isso
//indica ao JavaFX que existem componentes que devem ser inicializados
//antes de mostrar a tela. No caso desta tela, significa povoar a lista
//de veículos.
public class JanelaMatricula implements Initializable{


    @FXML
    private ChoiceBox<Aluno> ltvaluno;

    @FXML
    private ChoiceBox<Curso> ltvcurso;


    @FXML
    private TextArea taDetalhes;


    private Escola escola;

    public JanelaMatricula(Escola escola){
        this.escola = escola;
    }



    //método utilizado para inicializar os componentes visuais.
    //É executado depois do construtor e antes da tela ser mostrada.
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        
        ltvaluno.getItems().clear();
        ltvcurso.getItems().clear();
        
        //inicialização do listview
        ltvaluno.getItems().addAll(escola.listaTodosAlunos());
        ltvcurso.getItems().addAll(escola.listaTodosCursos());      
    }


    //Evento que ao clicar em um elemento do listview é executado.
    @FXML
    private void Matricular(){
        Aluno aluno = ltvaluno.getSelectionModel().getSelectedItem();
        Curso curso = ltvcurso.getSelectionModel().getSelectedItem();

        if(curso != null){
            taDetalhes.clear();
            taDetalhes.appendText("Código: "+curso.getCodigo()+"\n");
        }

        if(aluno != null){
            taDetalhes.clear();
            taDetalhes.appendText("CPF: "+aluno.getCpf()+"\n");
        }
    }


    //utilizado para voltar uma tela.
    @FXML
    private void voltar(){
        App.popScreen();
    }
    
}
