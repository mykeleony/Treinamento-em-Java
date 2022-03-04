package poo.interfaces.jogo_batalha_espacial;

public class NaveEspacial implements Bomba {
    private int pontosVida;
    private int dano;
    private double velocidade;
    private boolean atacaJogador;

    NaveEspacial(int pontosVida, int dano, double velocidade, boolean atacaJogador) {
        this.pontosVida = pontosVida;
        this.dano = dano;
        this.velocidade = velocidade;
        this.atacaJogador = atacaJogador;
    }

    @Override
    public int getPosicaoX() {
        return 0;
    }

    @Override
    public int getPosicaoY() {
        return 0;
    }

    @Override
    public void moveObjetoX() {
        System.out.println("A nave espacial está se movendo horizontalmente.");
    }

    @Override
    public void moveObjetoY() {
        System.out.println("A nave espacial está se movendo verticalmente.");
    }

    @Override
    public void explodir(int intensidade) {
        System.out.println("A nave espacial explodiu com intensidade "+intensidade);
    }

    @Override
    public void queima() {
        System.out.println("A nave espacial está atacando continuamente com o dano de queima.");
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isAtacaJogador() {
        return atacaJogador;
    }

    public void setAtacaJogador(boolean atacaJogador) {
        this.atacaJogador = atacaJogador;
    }
}
