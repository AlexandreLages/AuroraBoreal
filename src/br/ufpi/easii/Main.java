package br.ufpi.easii;
import java.awt.EventQueue;

import br.ufpi.easii.view.TelaCompilador;
import br.ufpi.easii.view.TelaInicializacao;

public class Main {
	
	static TelaInicializacao frame;
	static TelaCompilador frame2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					new Thread(thread1).start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			try {
				frame = new TelaInicializacao();
				frame.setVisible(true);
				//Thread.sleep(3000);
				frame.setVisible(false);
				frame2 = new TelaCompilador();
				frame2.setVisible(true);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	};
}
