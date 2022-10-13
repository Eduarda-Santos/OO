package ifpr.pgua.eic.models;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    //private Professor professor;
    //private ArrayList<Aluno> alunos;

    //matricula e desmatricula aluno

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        //this.professor = professor;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nNome:" + getNome();
    }
}
