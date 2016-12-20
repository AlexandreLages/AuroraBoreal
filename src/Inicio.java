import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Inicio extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public Inicio() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/carregando.gif")));
		label.setBounds(129, 232, 147, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/aurora.jpg")));
		lblNewLabel.setBounds(0, -27, 434, 288);
		contentPane.add(lblNewLabel);
		
		
		
		
	
		
		
	}
}
