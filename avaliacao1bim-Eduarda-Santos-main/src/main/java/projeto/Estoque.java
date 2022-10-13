package projeto;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;
    int qtdeProdutos = 0;
    double total = 0;
    int maior = 0;

    public Estoque() {
        produtos = new ArrayList<Produto>();

    }

    public Produto buscarNomeProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }

        return null;
    }

    public Produto buscarPesoProduto(Integer peso) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getPeso() == peso) {
                return produtos.get(i);
            }
        }

        return null;
    }

    public boolean insereProduto(Produto produto) {
        if (buscarNomeProduto(produto.getNome()) == null) {
            if (buscarPesoProduto(produto.getPeso()) == null) {
                this.produtos.add(produto);
                qtdeProdutos += 1;
                return true;
            }
        }

        return false;

    }

    public void listarProdutos() {
        ArrayList<Produto> lista = getProdutos();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + " , " + lista.get(i));
        }
    }

    public double totalPesoEstoque() {
        ArrayList<Produto> lista = getProdutos();
        for (int i = 0; i < lista.size(); i++) {
            total = produtos.get(i).getPeso() + total;
        }

        return total;

    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}
