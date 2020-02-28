package tads.oo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random aleatorio =  new Random();
    }

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        int fichas, aposta, ususoma;
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


        }
    }
}
