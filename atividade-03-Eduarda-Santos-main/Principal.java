import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args){

        ContaCorrente conta = new ContaCorrente(numeroDaConta, agencia, documento, senha, ativa, saldo);
        
        int cont = 0;
        
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("1 - Cadastrar uma nova conta corrente");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Mostrar Saldo");
            System.out.println("5 - Sair");
            System.out.println("Selecione uma opção:");
            
            int resposta = scan.nextInt();

            
            if(resposta == 1){
                System.out.println("Informe o numero da conta:");
                int numeroDaConta = scan.nextInt();
                conta.setNumeroDaConta(numeroDaConta);
                System.out.println("Informe a agencia:");
                int agencia = scan.nextInt();
                conta.setAgencia(agencia);
                System.out.println("Informe o documento:");
                int documento = scan.nextInt();
                conta.setDocumento(documento);
                System.out.println("Informe a senha:");
                int senha = scan.nextInt();
                conta.setSenha(senha);
                System.out.println("Informe o saldo:");
                int saldo = scan.nextInt();
                conta.setSaldo(saldo);
            }
            /*if(resposta == 2){
                System.out.println("Informe a quantidade que deseja sacar:");
                valor = scan.nextInt();
                if(conta.saldo >= valor){
                    conta.sacar(valor);
                }
                else{
                    System.out.println("Valor negativo!");
                }
            }
            if(resposta == 3){
                System.out.println("Informe a quantidade que deseja depositar:");
                valor = scan.nextInt();
                conta.depositar(valor);
                System.out.println(conta.saldo);
            }
            if(resposta == 4){
                System.out.println(conta.saldo);
            }
            if(resposta == 5){
                cont++;
            }
            */
        }while(cont == 0);
        
    }
}
