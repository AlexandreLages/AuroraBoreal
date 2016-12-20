import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AreaDeDesenvolvimento extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public AreaDeDesenvolvimento() {
		setTitle("AuRoReaL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1000, 531);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		MutableTreeNode rootNode = new DefaultMutableTreeNode("ProjetoPortugol");
		DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);

		MutableTreeNode rootNode2 = new DefaultMutableTreeNode("Main");
		treeModel.insertNodeInto(rootNode2, rootNode, 0);

		MutableTreeNode rootNode3 = new DefaultMutableTreeNode("Gramatica");
		treeModel.insertNodeInto(rootNode3, rootNode, 0);

		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 213, 442);
		panel.setBorder(new TitledBorder(null, "Projetos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		JTree tree = new JTree(treeModel);
		tree.setBounds(10, 24, 193, 407);
		panel.add(tree);


		tree.setEditable(false);

		tree.setShowsRootHandles(true);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		tabbedPane.setBounds(233, 39, 741, 344);
		contentPane.add(tabbedPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Main", null, panel_1, null);
		panel_1.setBackground(SystemColor.menu);
		panel_1.setLayout(null);

		JTextArea txtrProgMainInteiro = new JTextArea();
		txtrProgMainInteiro.setText("PROG Main;\r\n    INTEIRO N, I;\r\n     REPITA\r\n        IMPRIMA(\u201CDigite o Valor:\u201C);\r\n      LEIA(n);\r\n    ATE (n >0);\r\n   PARA i = 1 ATE N PASSO 2 FACA\r\n  IMPRIMA(i);\r\n FIM;\r\nFIM.");
		txtrProgMainInteiro.setBounds(10, 11, 709, 294);
		panel_1.add(txtrProgMainInteiro);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Gramatica", null, panel_2, null);
		panel_2.setBackground(SystemColor.menu);
		panel_2.setLayout(null);

		JTextArea txtrProgGramaticaInteiro = new JTextArea();
		txtrProgGramaticaInteiro.setText("PROG Gramatica;\r\n    \r\n IMPRIMA(\"Hello Word\");\r\n \r\nFIM.");
		txtrProgGramaticaInteiro.setBounds(10, 11, 709, 294);
		panel_2.add(txtrProgGramaticaInteiro);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new TitledBorder(null, "Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(233, 398, 741, 83);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 21, 721, 51);
		panel_3.add(textArea_2);



		JButton btnComplilar = new JButton("Complilar");
		btnComplilar.setBounds(233, 10, 89, 23);
		contentPane.add(btnComplilar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(131, 10, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnNovoArquivo = new JButton("Novo Arquivo");
		btnNovoArquivo.setBounds(10, 10, 111, 23);
		contentPane.add(btnNovoArquivo);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(332, 10, 89, 23);
		contentPane.add(btnSair);


	}
}
