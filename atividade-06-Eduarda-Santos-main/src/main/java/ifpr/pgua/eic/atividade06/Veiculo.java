import java.util.ArrayList;

public class Veiculo {

    private String placa;
    private String cor;
    private int ano;
    private String modelo;
    private String fabricante;
    private ArrayList<Veiculo> veiculos;
    int qtdeveiculos;

    public Veiculo(String placa, String cor, int ano, String modelo, String fabricante) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public Veiculo(String placa, String cor, int ano, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public void cadastrarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
        qtdeveiculos += 1;
    }

    public ArrayList<Veiculo> getVeiculo(){
        return veiculos;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }
    
    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public int getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getfabricante() {
        return fabricante;
    }

    public void setfabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    

    public String toString(){
        String str="";

        str = "Pessoa[placa:"+placa+", cor:"+cor+", ano:"+ano+", modelo:"+modelo+"]";
        
        return str;
    }

    public void buscarVeiculos(String opcao){
        if((getplaca()).equals(opcao)){
            toString();
        }
    }
}
