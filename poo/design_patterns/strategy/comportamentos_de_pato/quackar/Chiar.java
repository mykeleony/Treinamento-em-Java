package design_patterns.strategy.comportamentos_de_pato.quackar;

public class Chiar implements CapacidadeDeGrasnar {
    
    @Override
    public void quack() {
        System.out.println("Sou um pato de mentira e faço barulho ao ser apertado!");
    }
}
