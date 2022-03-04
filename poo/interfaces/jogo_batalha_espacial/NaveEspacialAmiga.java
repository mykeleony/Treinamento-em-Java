package poo.interfaces.jogo_batalha_espacial;

public class NaveEspacialAmiga extends NaveEspacial {

    public NaveEspacialAmiga(int pontosVida, int dano, double velocidade, boolean atacaJogador) {
        super(pontosVida, dano, velocidade, atacaJogador);
        atacaJogador = false;
    }
}
