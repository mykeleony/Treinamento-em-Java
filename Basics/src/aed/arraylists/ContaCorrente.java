package aed.arraylists;

public class ContaCorrente {
    private int saldo;

    ContaCorrente(int saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "ContaCorrente [saldo=" + saldo + "]";
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
