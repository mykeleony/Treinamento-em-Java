package design_patterns.strategy;

import design_patterns.strategy.comportamentos_de_pato.quackar.CapacidadeDeGrasnar;
import design_patterns.strategy.comportamentos_de_pato.voar.CapacidadeDeVoar;

public abstract class Pato {
    String cor;
    CapacidadeDeGrasnar capacidadeDeGrasnar;
    CapacidadeDeVoar capacidadeDeVoar;

    public Pato(String cor) {
        this.cor = cor;
    }

    abstract void display();    // Cada pato tem um visual diferente.

    public void nadar() {
        System.out.println("O pato está nadando!");
    }

    public void grasnar() {
        capacidadeDeGrasnar.quack();
    }

    public void voar() {
        capacidadeDeVoar.voar();
    }

    /* Métodos modificadores: */ 
    public void setCapacidadeDeGrasnar(CapacidadeDeGrasnar cdg) {
        capacidadeDeGrasnar = cdg;
    }

    public void setCapacidadeDeVoar(CapacidadeDeVoar cdv) {
        capacidadeDeVoar = cdv;
    }

    public static void main(String[] args) {
        Pato patoborrachudo = new PatoDeBorracha("Amarelo");

        patoborrachudo.display();
        patoborrachudo.grasnar();
        patoborrachudo.nadar();

        Pato marrecobranco = new PatoMarreco("Branco");

        marrecobranco.display();
        marrecobranco.grasnar();
        marrecobranco.nadar();

        Pato patoRobo = new PatoRobotico();
        
        patoRobo.display();
        patoRobo.grasnar();
        patoRobo.voar();
    }
}
