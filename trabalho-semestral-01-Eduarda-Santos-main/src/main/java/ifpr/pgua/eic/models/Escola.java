package ifpr.pgua.eic.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Escola {
    private String nome;
    private String telefone;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Curso> cursos;
    File file;
    
    public Escola(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        
        pessoas = new ArrayList<>();
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Professor> listaTodosProfessores(){
        return professores;
    }

    public ArrayList<Aluno> listaTodosAlunos(){
        return alunos;
    }

    public ArrayList<Curso> listaTodosCursos(){
        return cursos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void carregarArquivo() {
        File arq = new File("professores.txt");
      
       if(arq.exists()){
           System.out.println("O arquivo existe...");
       }else{
           System.out.println("O arquivo não existe...");
       }
      
       File dir = new File("C:\\Users\\PROBOOK 640 G1\\Documents\\GitHub\\trabalho-semestral-01-Eduarda-Santos");
      
       if(dir.exists()){
           System.out.println("A pasta existe");
           System.out.println("Conteúdo:");
           String[] itens = dir.list();
          
           for(int i=0;i<itens.length;i++){
               System.out.println("\t"+itens[i]);
           }
       }else{
           System.out.println("A pasta não existe...");
        }
    }

    public void gerarProfessores() {
        Professor professor = new Professor("04417718820-20", "Eduarda", "eduarda2@gmail.com", "321456025", 1800.00);
        professor.adicionar(pessoas.get(0));

        professores.add(professor);
        //layout(professores);

    }

    public Professor buscarProfessor(String cpf){
        for(Professor professor:professores){
            if(professor.getCpf().equals(cpf)){
                return professor;
            }
        }
        return null;
    }

    public boolean cadastrarProfessor(String cpf, String nome, String telefone, String email, Double salario){
        if(buscarProfessor(cpf)==null){
            Professor professor = new Professor(cpf, nome, telefone, email, salario);

            professores.add(professor);

            return true;

        }

        return false;
    }

    public Aluno buscarAluno(String cpf){
        for(Aluno aluno:alunos){
            if(aluno.getCpf().equals(cpf)){
                return aluno;
            }
        }
        return null;
    }

    public boolean cadastrarAluno(String cpf, String nome, String telefone, String email, LocalDate dataMatricula){
        if(buscarAluno(cpf)==null){
            
            Aluno aluno = new Aluno(cpf, nome, telefone, email, dataMatricula);

            alunos.add(aluno);

            return true;

        }

        return false;
    }

    public Curso buscarCurso(String nome){
        for(Curso curso:cursos){
            if(curso.getNome().equals(nome)){
                return curso;
            }
        }
        return null;
    }

    public boolean cadastrarCurso(int codigo, String nome, int cargaHoraria){
        if(buscarCurso(nome)==null){
            Curso curso = new Curso(codigo, nome, cargaHoraria);

            cursos.add(curso);

            return true;

        }

        return false;
    }

    public void salvarDados() {
        try (FileWriter fout = new FileWriter("professores.txt");
                BufferedWriter bout = new BufferedWriter(fout)) {

            for (Professor professor : professores) {
                bout.write(professor.getCpf() + ";" + professor.getNome() + ";" + professor.getEmail() + ";" + professor.getTelefone() + ";" + professor.getSalario());
                bout.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar professores");
        }
        try (FileWriter fout = new FileWriter("professores.txt");
                BufferedWriter bout = new BufferedWriter(fout)) {

            for (Professor professor:professores) {
                bout.write(professor.getCpf() + ";");
                bout.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar professores");
        }

    }

    public void salvarJson(){
        Gson gson = new Gson();

        String json = gson.toJson(this);

        try(FileWriter out = new FileWriter("professores.txt")){
            out.write(json);
            out.close();
        }catch(IOException e){
            System.out.println("Erro ao salvar json");
        }

    }

    public void carregarJson(){
        Gson gson = new Gson();

        try(FileReader in=new FileReader("professores.txt");
            BufferedReader bin = new BufferedReader(in)) {
            
            String json =bin.readLine();
            Professor temp = gson.fromJson(json, Professor.class);
            
            this.professores = getProfessores();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public void carregarDados(){
        try (FileReader fin = new FileReader("professores.txt");
                BufferedReader bin = new BufferedReader(fin)) {
            
            String linha = bin.readLine();
            while(linha != null){
                String[] tokens = linha.split(";");
                String cpf = tokens[0];
                String nome = tokens[1];
                String telefone = tokens[2];
                String email = tokens[3];
                Double salario = Double.valueOf(tokens[4]);

                Professor professor = new Professor(cpf, nome, telefone, email, salario);

                professores.add(professor);

                linha = bin.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao carregar professores");
        }
        try (FileReader fin = new FileReader("professores.txt");
                BufferedReader bin = new BufferedReader(fin)) {

            String linha = bin.readLine();
            while(linha!=null){
                String[] tokens = linha.split(";");
                String cpf = tokens[0];
                String nome = tokens[1];
                String email = tokens[2];
                String telefone = tokens[3];
                Double salario = Double.valueOf(tokens[4]);

                Professor professor = new Professor(cpf, nome, telefone, email, salario);


                String[] cpfProfessor = tokens[1].split(",");
                for(String scpf:cpfProfessor){
                    professor = buscarProfessor(scpf);
                    professor.adicionar(professor);
                }

                professores.add(professor);

                linha = bin.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Erro ao carregar professores");
        }

    }

    @Override
    public String toString() {
        return "Escola [professores=" + professores + ", alunos=" + alunos + "]";
    }
}
