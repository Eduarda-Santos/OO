package ifpr.pgua.eic.tads.modelos;

import java.nio.file.ReadOnlyFileSystemException;

public class ContaPoupanca extends Conta {
    
    private double txRendimento;

    public ContaPoupanca(int numeroDaConta, int agencia, 
                         String senha, boolean ativa, 
                        double saldo, Pessoa pessoa,
                        double txRendimento) {
        super(numeroDaConta, agencia, senha, ativa, saldo, pessoa);
        this.txRendimento = txRendimento;
    }
    
    public void render(){
        double rendimento = saldo*txRendimento;
        saldo += rendimento;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"CONTA POUPANÇA "+txRendimento;
    }
}
