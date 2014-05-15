package br.com.caelum.almoco.dao;

public class Conta {

	private int saldo;

	public void deposita(int n) {
		this.saldo -= n;
	}

	public void saca(int n) {
		this.saldo += n;
	}

	public int getSaldo() {
		return saldo;
	}

}
