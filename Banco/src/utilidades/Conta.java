package utilidades;

import java.util.Arrays;
import java.util.Calendar;

public class Conta {
	private int nroConta;
	private double saldo;
	private Correntista[] correntistas;
	
	private Calendar dataAbertura = Calendar.getInstance();
	
	//Construtor:
	public Conta(int nroConta, double saldo, Correntista[] correntistas) {
		this.nroConta = nroConta;
		this.saldo = saldo;
		this.correntistas = correntistas;
	}
	
	public void imprimeDados() {
		System.out.println("Conta [nroConta=" + nroConta + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", correntistas="
				+ Arrays.toString(correntistas) + "]");
	}
	
	public boolean fazDeposito (double valor) {
		if (valor <= 0 || valor > 100000)
			return false;
		
		saldo += valor;
		
		return true;
	}
	
	public boolean fazSaque (double valor) {
		if (valor <= 0 || valor > saldo)
			return false;
		
		saldo -= valor;
		
		return true;
	}
	
	public boolean fazTransferencia (Conta destino, double valor) {
		if (this.fazSaque(valor) == true) {
			destino.fazDeposito(valor);
			return true;
		}
		
		return false;
	}
	
	// Métodos acessadores e modificadores:
	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Correntista[] getCorrentistas() {
		return correntistas;
	}

	public void setCorrentistas(Correntista[] correntistas) {
		this.correntistas = correntistas;
	}
}
