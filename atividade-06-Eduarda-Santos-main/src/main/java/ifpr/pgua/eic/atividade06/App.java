package ifpr.pgua.eic.atividade06;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static String menuGeral() {
        String str = "";

        str += "1 - Cadastrar Veículo\n";
        str += "2 - Buscar\n";
        str += "3 - Registrar\n";
        str += "0 - Listar\n";

        return str;

    }

    public static String menuResgistrar(){
        String str = "";

        str += "1 - Registrar entrada do veículo\n";
        str += "2 - Registrar saída do veículo\n";
        str += "0 - Voltar\n";

        return str;
    }

    public static String menuListar() {
        String str = "";

        str += "1 - Listar todos os veículos\n";
        str += "2 - Listar veículos estacionados\n";
        str += "0 - Sair\n";

        return str;
    }

    public static void main(String[] args) throws Exception {
        
        Veiculo veiculo = new Veiculo(placa, cor, ano, modelo);

        Scanner scan = new Scanner(System.in);
        int opcao;
        int resposta;
        boolean comp = false;
        String cpfresposta;

        String placa;
        String cor;
        int ano;
        String modelo;
        String fabricante;

        do {
            System.out.println(menuGeral());
            opcao = scan.nextInt();
            scan.nextLine();
            if (opcao == 1) {
                System.out.println(menuGeral());
                opcao = scan.nextInt();
                scan.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a placa:");
                        placa = scan.nextLine();
                        System.out.println("Digite a cor:");
                        cor = scan.nextLine();
                        System.out.println("Digite o ano:");
                        ano = scan.nextInt();
                        System.out.println("Digite o modelo:");
                        modelo = scan.nextLine();
                        System.out.println("Digite o fabricante:");
                        fabricante = scan.nextLine();

                        
                        if((veiculo.getplaca()).equals(placa)){
                            System.out.println("Placa já cadastrada!");
                            break;
                        }
                        else{
                            veiculo = new Veiculo(placa, cor, ano, modelo);
                            veiculo.cadastrarVeiculo(veiculo);
                            System.out.println("Cadastrada!");
                            break;
                        }

                    case 2:
                        System.out.println("Detalhes da pessoa");
                        if (veiculo != null) {
                            System.out.println(veiculo);
                        } else {
                            System.out.println("Veiculo não cadastrado!");
                        }
                        break;
                }
            } else if(opcao == 2){
                System.out.println("Digite o número da placa que deseja buscar:");
                opcao = scan.nextInt();
                scan.nextLine();
                
                buscarVeiculos(opcao);
            /*}else if(opcao == 3){
                System.out.println(menuBanco());
                opcao = scan.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Listar pessoas!");
                        ArrayList<Pessoa> lista = banco.getPessoas();
                        for(int i=0;i<lista.size();i++){
                            System.out.println(lista.get(i));
                        }
                    break;
                    case 2:
                        System.out.println("Listar contas!");
                        ArrayList<ContaCorrente> contas = banco.getContaCorrentes();
                        for(int i=0;i<contas.size();i++){
                            System.out.println(contas.get(i));
                        }
                    break; 
                }
            }*/

        } while (opcao != 0);
    }
}

