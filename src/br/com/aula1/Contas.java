package br.com.aula1;

public class Contas {

	private String Titular;
	private String Agencia;
	private int numero;
	double saldo;

	public void saca(double saca) {
		saca -= valor;
	}

	public void deposita(double deposita) {
		deposita += valor;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public String getAgencia() {
		return Agencia;
	}

	public void setAgencia(String agencia) {
		Agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
