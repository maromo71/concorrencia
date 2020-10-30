package net.maromo.prjconta;
public class Transacao extends Thread {
	private Conta conta;
	private double valor;
	private TipoTransacao tipo;
	public Transacao(Conta conta, double valorTransacao, TipoTransacao tipo) {
		this.conta = conta;
		this.valor = valorTransacao;
		this.tipo = tipo;
	}
	@Override
	public void run() {
		try {
			if (tipo == TipoTransacao.Depositar) {
				boolean ok = conta.depositar(valor);
				if (ok) {
					System.out.println("Depósito efetuado com sucesso, novo saldo: " + conta.getSaldo());
				}
			}
			if (tipo == TipoTransacao.Sacar) {
				boolean ok = conta.sacar(valor);
				if (ok) {
					System.out.println("Saque efetuado com sucesso, novo saldo: " +  conta.getSaldo());
				}
			}
			if (tipo == TipoTransacao.ExibirSaldo) {
				System.out.println("Saldo atual: " + conta.getSaldo());
			}
		} catch (Exception e) {
			System.out.println("Aconteceu o erro: " + e.getMessage());
		}
	}
}
