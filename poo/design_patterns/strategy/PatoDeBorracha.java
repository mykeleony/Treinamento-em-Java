package design_patterns.strategy;

import design_patterns.strategy.comportamentos_de_pato.quackar.Chiar;
import design_patterns.strategy.comportamentos_de_pato.voar.VoarComAsas;

public class PatoDeBorracha extends Pato {
    
    public PatoDeBorracha(String cor) {
        super(cor);
        capacidadeDeGrasnar = new Chiar();
        capacidadeDeVoar = new VoarComAsas();
    }

    @Override
    public void display() {
        System.out.println("Sou um pato de borracha da cor "+cor.toLowerCase()+".");
    }
}
