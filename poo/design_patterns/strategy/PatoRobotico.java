package design_patterns.strategy;

import design_patterns.strategy.comportamentos_de_pato.quackar.Grasnar;
import design_patterns.strategy.comportamentos_de_pato.voar.VoarComMotor;

public class PatoRobotico extends Pato {

    public PatoRobotico() {
        super("Prateado");
        capacidadeDeGrasnar = new Grasnar();
        capacidadeDeVoar = new VoarComMotor();
    }
    
    public void display() {
        System.out.println("Sou um pato futurista. Todos da minha espécie são da cor "+cor.toLowerCase()+".");
    }
}
