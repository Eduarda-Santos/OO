package ifpr.pgua.eic.telas;

import ifpr.pgua.eic.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class JanelaPrincipal {

    @FXML
    private void carregaTelaCadastroProfessor(ActionEvent evento) {
        App.pushScreen("CADASTRO PROFESSOR");
    }

    @FXML
    private void carregaTelaCadastroAluno(ActionEvent evento) {
        App.pushScreen("CADASTRO ALUNO");
    }

    @FXML
    private void carregaTelaCadastroCurso(ActionEvent evento) {
        App.pushScreen("CADASTRO CURSO");
    }

    @FXML
    private void carregaTelaListarAluno(ActionEvent evento) {
        App.pushScreen("LISTAR ALUNOS");
    }

    @FXML
    private void carregaTelaListarProfessor(ActionEvent evento) {
        App.pushScreen("LISTAR PROFESSORES");
    }

    @FXML
    private void carregaTelaListarCurso(ActionEvent evento) {
        App.pushScreen("LISTAR CURSOS");
    }

    @FXML
    private void carregaTelaMatricula(ActionEvent evento) {
        App.pushScreen("MATRICULA");
    }


}
