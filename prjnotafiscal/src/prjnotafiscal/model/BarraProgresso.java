package prjnotafiscal.model;

public class BarraProgresso implements Runnable {

	@Override
	public void run() {
		//Gerar uma Barra de Progressao
		for (int i = 0; i < 20000; i++) {
			if(i % 80 == 0) {
				System.out.println();
			}
			System.out.print("*");
		}
		
	}

}
