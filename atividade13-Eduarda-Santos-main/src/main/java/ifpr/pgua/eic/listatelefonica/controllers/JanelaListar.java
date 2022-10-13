package ifpr.pgua.eic.listatelefonica.controllers;

import ifpr.pgua.eic.listatelefonica.App;
import ifpr.pgua.eic.listatelefonica.models.Contato;
import ifpr.pgua.eic.listatelefonica.models.ListaTelefonica;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

//Note que esta classe implementa a interface Initializable. Isso
//indica ao JavaFX que existem componentes que devem ser inicializados
//antes de mostrar a tela. No caso desta tela, significa povoar a lista
//de veículos.
public class JanelaListar {

    @FXML
    private ListView<Contato> ltvContatos;

    @FXML
    private TextArea taDetalhes;

    private ListaTelefonica contato;

    public JanelaListar(ListaTelefonica contato) {
        this.contato = contato;
    }

    // Evento que ao clicar em um elemento do listview é executado.
    @FXML
    private void mostrarDetalhes(MouseEvent evento) {
        Contato contato = ltvContatos.getSelectionModel().getSelectedItem();

        if (contato != null) {
            taDetalhes.clear();
            taDetalhes.appendText("Nome: " + contato.getNome() + "\n");
            taDetalhes.appendText("Telefone: " + contato.getTelefone() + "\n");
            taDetalhes.appendText("Email: " + contato.getEmail() + "\n");
        }
    }

    // utilizado para voltar uma tela.
    @FXML
    private void voltar() {
        App.popScreen();
    }

}
