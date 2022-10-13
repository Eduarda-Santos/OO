package ifpr.pgua.eic.models;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    private double salario;
    private List<Professor> professores;
    
    public Professor(String cpf, String nome, String email, String telefone, Double salario) {
        super(cpf, nome, email, telefone);
        this.salario = salario;
        professores = new ArrayList<>();
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    @Override
    public String toString() {
        return "\nNome:" + getNome();
    }
}
