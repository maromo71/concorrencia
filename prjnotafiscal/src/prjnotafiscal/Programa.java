package prjnotafiscal;

import prjnotafiscal.model.BarraProgresso;
import prjnotafiscal.model.NotaFiscal;

public class Programa {

	public static void main(String[] args) {
		NotaFiscal nf1 = new NotaFiscal(1);
		NotaFiscal nf2 = new NotaFiscal(2);
		BarraProgresso bp = new BarraProgresso();
		
		//Colocar para ser executados em Threads distintas
		Thread tnf1 = new Thread(nf1);
		Thread tnf2 = new Thread(nf2);
		Thread tbp = new Thread(bp);
		
		tbp.start();
		try {
			tbp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tnf1.start();
		tnf2.start();
		
	}

}
