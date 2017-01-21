package br.ufpi.easii.view;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Irvayne Matheus\\Desktop\\workspace\\AuroraBoreal\\src\\img\\icon.png"));
		for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        if ("Nimbus".equals(info.getName())) {
	            try {
					UIManager.setLookAndFeel(info.getClassName());
					SwingUtilities.updateComponentTreeUI(this);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            break;
	        }
	    }
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
