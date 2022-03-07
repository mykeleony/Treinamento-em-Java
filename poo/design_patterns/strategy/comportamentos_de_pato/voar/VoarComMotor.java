package design_patterns.strategy.comportamentos_de_pato.voar;

// Implementa a forma de voar de um pato robô:
public class VoarComMotor implements CapacidadeDeVoar {

    @Override
    public void voar() {
        System.out.println("Estou voando com um foguete!");
    }
    
}
