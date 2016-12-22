import java.awt.EventQueue;

public class Main {
	
	static Inicio frame;
	static AreaDeDesenvolvimento frame2;
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
		//	try {
//				frame = new Inicio();
//				frame.setVisible(true);
//				Thread.sleep(1000);
//				frame.setVisible(false);
				frame2 = new AreaDeDesenvolvimento();
				frame2.setVisible(true);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
			
		}
		
		
	};
}
