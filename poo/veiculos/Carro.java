package poo.veiculos;

public class Carro extends Veiculo {
    private int cilindradas;
    private boolean temAirbag;

    Carro(int anoF, String mod, String mar, int nRodas, int cilindradas, boolean airbags) {
        super(anoF, mod, mar, nRodas);
        nRodas = 4;
        this.cilindradas = cilindradas;
        this.temAirbag = airbags;
    }

    public String toString() {
        return "carro fabricado em "+getAnoFabricacao()+", com "+getNroRodas()+" rodas, da marca "+getMarca()+", modelo "+getModelo()+", de "+cilindradas+" cilindradas. Possui airbags: "+getTemAirbag();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean getTemAirbag() {
        return temAirbag;
    }

    public void setTemAirbag(boolean temAirbag) {
        this.temAirbag = temAirbag;
    }

    public static void main(String[] args) {
        Carro fordBigode = new Carro(1910, "Bigode", "Ford", 4, 2900, true);
        System.out.println("O veículo criado foi um "+fordBigode.toString());
    }
}
