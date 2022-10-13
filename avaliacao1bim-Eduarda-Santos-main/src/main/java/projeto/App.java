package projeto;

import java.util.ArrayList;

import projeto.Estoque;
import projeto.Produto;

public class App {
    Produto produto = null;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int quantidade = 1;
        int peso = 2;
        double valor = 3;
        double total;
        String nome = "computador";

        System.out.println(nome + "\n" + peso + "\n" + valor + "\n" + quantidade);

        if (peso < 0 || quantidade < 0 || valor < 0) {
            System.out.println("Não é possível cadastrar o produto");
        } else {
            Produto produto = new Produto(nome, peso, quantidade, valor);
        }

        System.out.println(nome + "\n" + peso + "\n" + valor + "\n" + quantidade);
        // estoque.insereProduto(produto);
        // totalPesoEstoque(total);
    }
}
