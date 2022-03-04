package poo.interfaces.jogo_batalha_espacial;

public interface ObjetoEspacial {
    abstract int getPosicaoX();
    abstract int getPosicaoY();
    abstract void moveObjetoX();
    abstract void moveObjetoY();
    abstract void explodir(int intensidade);
}
