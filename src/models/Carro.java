package models;

public class Carro {
    private String marca;
    private String modelo;
    private String anoDeFabricacao;
    private int numeroDePortas;
    private int qtdPneus;
    private String chassi;
    private String combustivel;
    private String cor;

    public Carro (String marca, String modelo, String anoDeFabricacao, int numeroDePortas, int qtdPneus, String chassi, String combustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.numeroDePortas = numeroDePortas;
        this.qtdPneus = qtdPneus;
        this.chassi = chassi;
        this.combustivel = combustivel;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPneus() {
        return qtdPneus;
    }

    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }
}
