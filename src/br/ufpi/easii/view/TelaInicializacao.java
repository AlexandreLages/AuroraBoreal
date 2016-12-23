package br.ufpi.easii.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicializacao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4728738876484864002L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public TelaInicializacao() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/img/carregando.gif")));
		label.setBounds(129, 232, 147, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/img/aurora.jpg")));
		lblNewLabel.setBounds(0, -27, 434, 288);
		contentPane.add(lblNewLabel);
		
		
		
		
	
		
		
	}
}