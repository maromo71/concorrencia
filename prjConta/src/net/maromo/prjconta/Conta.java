package net.maromo.prjconta;
public class Conta {
	private int idConta;
	private String nome;
	private double saldo;
	
	public Conta(int idConta, String nome) {
		this.idConta = idConta;
		this.nome = nome;
	}
	public boolean depositar(double valor) throws IllegalArgumentException {
		synchronized (this) {
			if(valor < 0) {
				throw new IllegalArgumentException("Valor do deposito deve ser positivo");
			}
			saldo += valor;
			return true;
		}
	}
	public boolean sacar(double valor) {
		synchronized (this) {
			if(valor > saldo) {
				throw new IllegalArgumentException("Saldo insuficiente");
			}
			saldo -= valor;
			return true;	
		}
		
	}
	public double getSaldo() {
		synchronized (nome) {
			return saldo;
		}
	}

}
