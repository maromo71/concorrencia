package net.maromo.prjconta;

public class GerenciarConta {
	public static void main(String[] args) {
		//Instaciar uma conta para as transacoes.
		Conta conta = new Conta(1, "Joaquim");
		try {
			//Cinco transacoes para essa conta
			Transacao t1 = new Transacao(conta,	200, TipoTransacao.Depositar);
			Transacao t2 = new Transacao(conta,	200, TipoTransacao.Depositar);
			Transacao t3 = new Transacao(conta,	200, TipoTransacao.Depositar);
			Transacao t4 = new Transacao(conta, 200, TipoTransacao.Depositar);
			Transacao t5 = new Transacao(conta, 200, TipoTransacao.Depositar);
			Transacao t6 = new Transacao(conta, 0, TipoTransacao.ExibirSaldo);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t6.getName();
		} catch (Exception e) {
			System.out.println("Aconteceu o erro: " + e.getMessage());
		}
		
	}
}
