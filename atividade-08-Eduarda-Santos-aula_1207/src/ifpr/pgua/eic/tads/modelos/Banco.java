package ifpr.pgua.eic.tads.modelos;

import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private String telefone;
    private String cnpj;
    private String cpf;
    private int idade;
    private double salario;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<PessoaJuridica> pessoaj;
    private ArrayList<PessoaFisica> pessoaf;
    private ArrayList<Conta> contas;
    private int qtdePessoas;
    private int qtdeContas;
  

    public Banco(String nome, String telefone, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        pessoaj = new ArrayList<PessoaJuridica>();
        
        qtdePessoas = 0;
        contas = new ArrayList<>();
        qtdeContas = 0;

    }
    public Banco(String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
        pessoaf = new ArrayList<PessoaFisica>();
        
        qtdePessoas = 0;
        contas = new ArrayList<>();
        qtdeContas = 0;

    }

    public void render(){
        for(Conta c:contas){
            if(c instanceof ContaPoupanca){
                ContaPoupanca aux = (ContaPoupanca)c;
                aux.render();
            }
        }
    }
 
    private Pessoa buscarPessoa(String documento){
        for(int i=0;i<pessoas.size();i++){
            /*if(pessoas.get(i) instanceof PessoaFisica){
                PessoaFisica pf = (PessoaFisica) pessoas.get(i);
                if(pf.getCpf().equals(documento)){
                    return pessoas.get(i);
                }
            }
            if(pessoas.get(i) instanceof PessoaJuridica){
                PessoaJuridica pj = (PessoaJuridica) pessoas.get(i);
                if(pj.getCnpj().equals(documento)){
                    return pessoas.get(i);
                }
            }*/


            if(pessoas.get(i).getDocumento().equals(documento)){
                return pessoas.get(i);
            }
            
        }
        return null;
    }


    public PessoaFisica buscarPessoaFisica(String documento){
        return (PessoaFisica) buscarPessoa(documento);
    }

    public PessoaJuridica buscarPessoaJuridica(String documento){
        return (PessoaJuridica) buscarPessoa(documento);
    }


    public Conta buscarConta(int numero, int agencia){

        for(Conta conta:contas){
            if(conta.getNumeroDaConta()==numero && conta.getAgencia()==agencia){
                return conta;
            }
        }
        return null;
    }


    public boolean cadastrarPessoaFisica(PessoaFisica pessoas){
        if(buscarPessoaFisica(pessoas.getCpf())== null){
            this.pessoas.add(pessoas);
            qtdePessoas += 1;
            return true;
        }
        return false;
    }

    public boolean cadastrarPessoaJuridica(PessoaJuridica pessoas){
        if(buscarPessoaJuridica(pessoas.getCnpj())== null){
            this.pessoas.add(pessoas);
            qtdePessoas += 1;
            return true;
        }
        return false;
    }



    public ArrayList<PessoaFisica> getPessoasFisica(){
        ArrayList<PessoaFisica> lista = new ArrayList<>();

        for(Pessoa p:pessoaf){
            if(p instanceof PessoaFisica){
                lista.add((PessoaFisica)p);
            }
        }
        
        
        return lista;
    }

    public ArrayList<PessoaJuridica> getPessoasJuridica(){
        ArrayList<PessoaJuridica> lista = new ArrayList<>();

        for(Pessoa p:pessoaj){
            if(p instanceof PessoaJuridica){
                lista.add((PessoaJuridica)p);
            }
        }
        
        
        return lista;
    }


    private boolean cadastrarConta(Conta conta){
        if(buscarConta(conta.getNumeroDaConta(), conta.getAgencia())==null){
            this.contas.add(conta);
            qtdeContas += 1;
            return true;
        }

        return false;
    }

    public boolean cadastrarContaSimples(ContaSimples conta){
        return cadastrarConta(conta);
        
    }

    public boolean cadastrarContaEspecial(ContaEspecial conta){
        return cadastrarConta(conta);
        
    }

    public boolean cadastrarContaPoupanca(ContaPoupanca conta){
        return cadastrarConta(conta);
    }

    public ArrayList<ContaSimples> getContasSimples(){
        
        ArrayList<ContaSimples> lista = new ArrayList<>();

        for(Conta conta:contas){
            if(conta instanceof ContaSimples){
                ContaSimples cs = (ContaSimples)conta;
                lista.add(cs);
            }
        }
        
        return lista;
    }

    public ArrayList<ContaEspecial> getContasEspeciais(){
        ArrayList<ContaEspecial> lista = new ArrayList<>();

        for(Conta conta:contas){
            if(conta instanceof ContaEspecial){
                ContaEspecial cs = (ContaEspecial)conta;
                lista.add(cs);
            }
        }
        
        return lista;
    }

    public ArrayList<ContaPoupanca> getContasPoupancas(){
        ArrayList<ContaPoupanca> lista = new ArrayList<>();

        for(Conta conta:contas){
            if(conta instanceof ContaPoupanca){
                ContaPoupanca cs = (ContaPoupanca)conta;
                lista.add(cs);
            }
        }
        
        return lista;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
