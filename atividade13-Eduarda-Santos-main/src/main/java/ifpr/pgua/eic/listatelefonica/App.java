package ifpr.pgua.eic.listatelefonica;

import ifpr.pgua.eic.listatelefonica.controllers.JanelaCadastro;
import ifpr.pgua.eic.listatelefonica.controllers.JanelaPrincipal;
import ifpr.pgua.eic.listatelefonica.models.ListaTelefonica;
import ifpr.pgua.eic.listatelefonica.utils.BaseAppNavigator;
import ifpr.pgua.eic.listatelefonica.utils.ScreenRegistryFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    // Objeto centralizado para o estacionamento
    private ListaTelefonica contato;

    // método utilizado para inicializar os outros objetos
    @Override
    public void init() throws Exception {
        super.init();

        contato = new ListaTelefonica();
    }

    // indica qual é a tela inicial
    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    // título da aplicação
    @Override
    public String getAppTitle() {
        return "Contatos";
    }

    // registro de todas as telas da aplicação
    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(App.class, "principal.fxml", o -> new JanelaPrincipal()));
        registraTela("CADASTRO", new ScreenRegistryFXML(App.class, "cadastro.fxml", o -> new JanelaCadastro(contato)));
        registraTela("LISTAR", new ScreenRegistryFXML(App.class, "listar.fxml", o -> new JanelaListar(contato)));

    }

}