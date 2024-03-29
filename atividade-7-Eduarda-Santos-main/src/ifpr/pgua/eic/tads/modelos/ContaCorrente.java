package ifpr.pgua.eic.tads.modelos;

public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String senha;
    private boolean ativa;
    private double saldo;
    private Pessoa pessoa;
    private double limite;
    private double taxarend;


    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
                         boolean ativa, double saldo){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;
        this.pessoa = pessoa;

    }

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa pessoa,String senha,
                         boolean ativa){
        this(numeroDaConta, agencia, pessoa, senha, ativa, 0.0);
    }

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa pessoa){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.pessoa = pessoa;
        
        //this(numeroDaConta, agencia, "","",false,0.0);
    }

    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
                         boolean ativa, double saldo, double limite){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;
        this.pessoa = pessoa;
        this.limite = limite;

    }

    public class ContaCorrenteEspecial extends ContaCorrente{
        public ContaCorrenteEspecial(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
        boolean ativa, double saldo){
            super(numeroDaConta, agencia, pessoa, senha, ativa, saldo, limite);
        }
    }

    public class ContaPoupanca extends ContaCorrente{
        public ContaPoupanca(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
        boolean ativa, double saldo){
            super(numeroDaConta, agencia, pessoa, senha, ativa, saldo, taxarend);
        }
    }

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa pessoa,String senha, double limite, boolean ativa){
        this(numeroDaConta, agencia, pessoa, senha, ativa);
    }

    //escrita
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    //leitura
    public int getNumeroDaConta(){
        return numeroDaConta;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }    

    public boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
        
    }

    //sobrescrita de método
    public boolean depositar(){
        return depositar(100);
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo || valor <= saldo+limite){
            saldo = saldo - valor;
            return true;
        }else{
            return false;
        }
        
    }


    public String toString(){
        String str = "";

        str = "ContaCorrente[";
        str = str + "Numero da Conta:"+numeroDaConta;
        str = str + ",Agencia: "+agencia;
        str = str + ",Ativa: "+ativa;
        str = str + ",Saldo: "+saldo;
        str = str + ", Pessoa:"+pessoa;
        str = str + "]";

        return str;

    }

}