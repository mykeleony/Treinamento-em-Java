package poo.interfaces.jogo_batalha_espacial;

// Subinterface:
public interface Bomba extends ObjetoEspacial {
    @Override
    default void explodir(int intensidade) {
        System.out.println("Bomba explodiu!");
    }

    @Override
    default int getPosicaoX() {
        return 0;
    }

    @Override
    default int getPosicaoY() {
        return 0;
    }

    @Override
    default void moveObjetoX() {
        System.out.println("Bomba voando horizontalmente.");
    }

    @Override
    default void moveObjetoY() {
        System.out.println("Bomba voando verticalmente.");
    }

    abstract void queima();
}
