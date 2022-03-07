package design_patterns.strategy;

import design_patterns.strategy.comportamentos_de_pato.quackar.Grasnar;
import design_patterns.strategy.comportamentos_de_pato.voar.VoarComAsas;

public class PatoMarreco extends Pato {

    public PatoMarreco(String cor) {
        super(cor);
        capacidadeDeGrasnar = new Grasnar();
        capacidadeDeVoar = new VoarComAsas();
    }
    
    @Override
    public void display() {
        System.out.println("Sou um pato marreco da cor "+cor.toLowerCase()+".");
    }
}
