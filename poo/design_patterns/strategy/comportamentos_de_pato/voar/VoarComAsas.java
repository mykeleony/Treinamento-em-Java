package design_patterns.strategy.comportamentos_de_pato.voar;

public class VoarComAsas implements CapacidadeDeVoar {

    @Override
    public void voar() {
        System.out.println("Estou voando!");
    }
}
