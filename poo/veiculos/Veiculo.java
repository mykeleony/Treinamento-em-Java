package poo.veiculos;

public class Veiculo {
    private int anoFabricacao, nroRodas;
    private String modelo;
    private String marca;

    Veiculo(int anoF, String mod, String mar, int nRodas) {
        anoFabricacao = anoF;
        modelo = mod;
        marca = mar;
        nroRodas = nRodas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNroRodas() {
        return nroRodas;
    }

    public void setNroRodas(int nroRodas) {
        this.nroRodas = nroRodas;
    }
}
