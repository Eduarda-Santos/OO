package tads.oo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int fichas, aposta, ususoma, soma, jogadas = 0, acertos = 0, quant = 0;
        String nome;

        System.out.println("Digite seu nome:");
        nome  = scan.nextLine();

        System.out.println("Quantidade de fichas:");
        fichas = scan.nextInt();

        while (fichas != 0){
            System.out.println("Quantida de fichas que deseja apostar:");
            aposta = scan.nextInt();

            System.out.println("Valor da soma:");
            ususoma = scan.nextInt();
            jogadas++;

            Random rand = new Random();
            int um = rand.nextInt(6);
            int dois = rand.nextInt(6);
            soma = um + dois;

            if(soma == ususoma){
                aposta = aposta * 2;
                fichas = fichas + aposta;
                System.out.println("Acertou! Você ganhou o dobro da sua aposta: "+fichas);
                acertos++;
            }
            if ((soma == ususoma -1) || (soma == ususoma +1)){
                aposta = aposta / 2;
                fichas = fichas + aposta;
                System.out.println("Chegou perto! Você ganhou a metade da sua aposta: "+fichas);
            }
            else{
                System.out.println("Perdeu! Zerou sua aposta");
                aposta = 0;
                fichas = fichas + aposta;
            }
            quant = quant + aposta;

        }
    }
}
