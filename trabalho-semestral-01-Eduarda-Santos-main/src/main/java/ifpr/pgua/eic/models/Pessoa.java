package ifpr.pgua.eic.models;

import java.util.ArrayList;
import java.util.List;

public class Pessoa{
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private List<Pessoa> pessoas;

    public Pessoa(String cpf, String nome, String email, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        pessoas = new ArrayList<>();
    }

    public void adicionar(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

}