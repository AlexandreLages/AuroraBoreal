package br.ufpi.easii;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

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
				//Thread.sleep(5000);
				frame.setVisible(false);
				frame2 = new TelaCompilador();
				frame2.setVisible(true);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	};
}