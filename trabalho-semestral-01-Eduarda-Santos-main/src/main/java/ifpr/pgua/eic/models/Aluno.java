package ifpr.pgua.eic.models;
import java.time.LocalDate;

public class Aluno extends Pessoa{
    private LocalDate dataMatricula;

    public Aluno(String cpf, String nome, String email, String telefone, LocalDate dataMatricula) {
        super(cpf, nome, email, telefone);
        this.dataMatricula = dataMatricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "\nNome:" + getNome();
    }
}
