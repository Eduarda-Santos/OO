public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String documento;
    private String senha;
    private boolean ativa;
    private double saldo;

    public ContaCorrente(int numeroDaConta, int agencia, String documento, String senha, boolean ativa, double saldo){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.documento = documento;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;

    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setDocumento(String val){
        documento = val;
    }

    public String getDocumento(){
        return documento;
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
    
    public String toString() {
        return toString();
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }
}