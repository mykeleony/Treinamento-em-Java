package design_patterns.strategy.comportamentos_de_pato.voar;

public class VoarNaoDisponivel implements CapacidadeDeVoar {
    
    @Override
    public void voar() {
        System.out.println("Eu não consigo voar, bro.");
    }
}
