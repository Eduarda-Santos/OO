import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args){

        ContaCorrente conta;

        conta = new ContaCorrente();

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Cadastrar uma nova conta corrente");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("4 - Mostrar Saldo");
        System.out.println("Selecione uma opção:");
        int resposta = scan.nextInt();

        if(resposta == 1){
            System.out.println("Informe o numero da conta:");
            conta.numeroDaConta = scan.nextInt();
            System.out.println("Informe a agencia:");
            conta.agencia = scan.nextInt();
            System.out.println("Informe o numero da conta:");
            conta.numeroDaConta = scan.nextInt();
            

        }

        /*System.out.println("Numero:"+conta.numeroDaConta);
        System.out.println("Agenia:"+conta.agencia);
        System.out.println("Saldo:"+conta.saldo);
        System.out.println("Documento:"+conta.documento);
        System.out.println("Ativa:" +conta.ativa);
        System.out.println("Senha:"+conta.senha);*/

        //conta.depositar(100);
        //System.out.println("Saldo após depósito:"+conta.saldo);


        /* Metodo impedir
        int valor = 300;
        if(conta.saldo >= valor){
            conta.sacar(valor);
            System.out.println("Saldo após saque:"+conta.saldo);
        }
        else{
            System.out.println("Valor negativo!");
        }*/
        
    }
}
