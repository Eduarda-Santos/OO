public class ContaBancaria{

    public int agencia;
    public double saldo;
    public String cliente;
    Scanner scan = new.Scanner();

    public static void sacar(String[] args){
        double saque;
        
        System.out.println("Quantidade que deseja sacar:");
        saque = scan.nextLine;
        saldo = saldo - saque;

    }

    public static void depositar(String[] args){
        double = depositar;

        System.out.println("Quantida que deseja depositar:");
        depositar = scan.nextLine;
        saldo = saldo + depositar;
    }

    public String toString(){
        String s;

        s = "Agencia: "+agencia"Saldo: "+saldo"Cliente: "+cliente;
        return s;
    }
}
public class Main{
    public static void (String[] args){

        String.out.println("Digite sua agência:");
        agencia = scan.nextLine;
        String.out.println("Digite seu saldo:");
        saldo = scan.nextLine;
        String.out.println("Digite seu nome:");
        cliente = scan.nextLine;

        
    }
}