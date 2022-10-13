package ifpr.pgua.eic;

import ifpr.pgua.eic.models.Escola;
import ifpr.pgua.eic.telas.JanelaCadastroAluno;
import ifpr.pgua.eic.telas.JanelaCadastroProfessor;
import ifpr.pgua.eic.telas.JanelaListarAluno;
import ifpr.pgua.eic.telas.JanelaListarCurso;
import ifpr.pgua.eic.telas.JanelaListarProfessor;
import ifpr.pgua.eic.telas.JanelaMatricula;
import ifpr.pgua.eic.telas.JanelaCadastroCurso;
import ifpr.pgua.eic.telas.JanelaPrincipal;
import ifpr.pgua.eic.utils.BaseAppNavigator;
import ifpr.pgua.eic.utils.ScreenRegistryFXML;

public class App extends BaseAppNavigator {
    private Escola escola;

    @Override
    public void init() throws Exception {
        super.init();

        escola = new Escola("01234567-89","Eduarda");
        //professor = new Professor("0", "eduarda", "eduarda@y", "415236789", 1000.00);
    }


    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "Trabalho OO";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, "fxml/principal.fxml", o->new JanelaPrincipal()));
        registraTela("CADASTRO PROFESSOR", new ScreenRegistryFXML(App.class, "fxml/cadastroProfessor.fxml", o->new JanelaCadastroProfessor(escola)));
        registraTela("CADASTRO ALUNO", new ScreenRegistryFXML(App.class, "fxml/cadastroAluno.fxml", o->new JanelaCadastroAluno(escola)));
        registraTela("CADASTRO CURSO", new ScreenRegistryFXML(App.class, "fxml/cadastroCurso.fxml", o->new JanelaCadastroCurso(escola)));
        registraTela("LISTAR ALUNOS", new ScreenRegistryFXML(App.class, "fxml/listarAluno.fxml", o->new JanelaListarAluno(escola)));
        registraTela("LISTAR PROFESSORES", new ScreenRegistryFXML(App.class, "fxml/listarProfessor.fxml", o->new JanelaListarProfessor(escola)));
        registraTela("LISTAR CURSOS", new ScreenRegistryFXML(App.class, "fxml/listarCurso.fxml", o->new JanelaListarCurso(escola)));
        registraTela("MATRICULA", new ScreenRegistryFXML(App.class, "fxml/matricula.fxml", o->new JanelaMatricula(escola)));
    }
}