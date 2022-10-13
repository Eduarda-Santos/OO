package projeto;

public class Produto {
    private String nome;
    private int peso;
    private double valor;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, int peso, int quantidade, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
        this.quantidade = quantidade;

    }

    public String toString() {
        String str = "";

        str = str + nome;
        str = str + peso;
        str = str + valor;
        str = str + quantidade;

        return str;
    }

}
