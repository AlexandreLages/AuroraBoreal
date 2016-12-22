import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

public class AreaDeDesenvolvimento extends JFrame {

	private JPanel contentPane;
	private int qntArquivos;
	private int indiceSelecionado;

	/**
	 * Create the frame.
	 */
	public AreaDeDesenvolvimento() {
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		indiceSelecionado = 0;
		qntArquivos = 1;
		setTitle("AuRoReaL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1350, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		MutableTreeNode rootNode = new DefaultMutableTreeNode("ProjetoPortugol");
		DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
		

		MutableTreeNode rootNode2 = new DefaultMutableTreeNode("Main");
		treeModel.insertNodeInto(rootNode2, rootNode, 0);

		

		contentPane.setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 213, 647);
		panel.setBorder(new TitledBorder(null, "Projetos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);

		JTree tree = new JTree(treeModel);
		tree.setBounds(10, 24, 193, 592);
		panel.add(tree);


		tree.setEditable(false);

		tree.setShowsRootHandles(true);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.menu);
		tabbedPane.setBounds(233, 39, 1119, 665);
		contentPane.add(tabbedPane);
		

		JPanel panelPrograma = new JPanel();
		tabbedPane.addTab("Main", null, panelPrograma, null);
		panelPrograma.setBackground(SystemColor.menu);
		panelPrograma.setLayout(null);
		

		JTextArea textFonte = new JTextArea();
		textFonte.setText("PROG Main;\r\n    INTEIRO N, I;\r\n     REPITA\r\n        IMPRIMA(\u201CDigite o Valor:\u201C);\r\n      LEIA(n);\r\n    ATE (n >0);\r\n   PARA i = 1 ATE N PASSO 2 FACA\r\n  IMPRIMA(i);\r\n FIM;\r\nFIM.");
		
		
		
		JPanel panelConsole = new JPanel();
		panelConsole.setLayout(null);
		panelConsole.setBorder(new TitledBorder(null, "Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelConsole.setBackground(SystemColor.menu);
		panelConsole.setBounds(6, 441, 1098, 188);
		panelPrograma.add(panelConsole);
		
		JTextArea textConsole = new JTextArea();
		
		panelConsole.add(textConsole);
		panelPrograma.add(textFonte);
		
		JScrollPane scrollPaneFonte = new JScrollPane(textFonte);
		scrollPaneFonte.setBounds(10, 11, 1089, 419);
		panelPrograma.add(scrollPaneFonte);
		
		
		JScrollPane scrollPaneConsole = new JScrollPane(textConsole);
		scrollPaneConsole.setBounds(10, 21, 1077, 164);
		panelConsole.add(scrollPaneConsole);
		
		
		

		JButton btnComplilar = new JButton("Complilar");
		btnComplilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel pane = (JPanel) tabbedPane.getComponent(indiceSelecionado);
				JScrollPane scrollPane =  (JScrollPane) pane.getComponent(1);
				JViewport viewport = (JViewport) scrollPane.getComponent(0);
				JTextArea areaPrograma = (JTextArea) viewport.getComponent(0);
				
				
				JPanel pane2 = (JPanel) pane.getComponent(0);
				JScrollPane scrollPane2 =  (JScrollPane) pane2.getComponent(0);
				JViewport viewport2 = (JViewport) scrollPane2.getComponent(0);
				JTextArea areaCompilacao = (JTextArea) viewport2.getComponent(0);
				areaCompilacao.setText(areaPrograma.getText());

			}
		});
		btnComplilar.setBounds(361, 10, 94, 23);
		contentPane.add(btnComplilar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(284, 11, 73, 23);
		contentPane.add(btnSalvar);
		
		tabbedPane.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JTabbedPane pane = (JTabbedPane) e.getSource();
				indiceSelecionado = pane.getSelectedIndex();
				
			}
		});
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode)
	                       tree.getLastSelectedPathComponent();
				if(rootNode.getIndex(node) != -1){
					indiceSelecionado = rootNode.getIndex(node);
					tabbedPane.setSelectedIndex(indiceSelecionado);
					
				}
				
			}
		});
			   
		JButton btnNovoArquivo = new JButton("Novo Arquivo");
		btnNovoArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(qntArquivos < 10){
					
				String nome = "";
				nome = JOptionPane.showInputDialog("Nome do arquivo");
				MutableTreeNode rootNodeAux = new DefaultMutableTreeNode(nome);
				treeModel.insertNodeInto(rootNodeAux, rootNode, qntArquivos);
				
				JPanel panelPrograma = new JPanel();
				tabbedPane.addTab(nome, null, panelPrograma, null);
				panelPrograma.setBackground(SystemColor.menu);
				panelPrograma.setLayout(null);
				

				JTextArea textFonte = new JTextArea();
				
				panelPrograma.add(textFonte);
				
				JPanel panelConsole = new JPanel();
				panelConsole.setLayout(null);
				panelConsole.setBorder(new TitledBorder(null, "Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelConsole.setBackground(SystemColor.menu);
				panelConsole.setBounds(6, 441, 1098, 188);
				panelPrograma.add(panelConsole);
				
				JTextArea textConsole = new JTextArea();
				
				panelConsole.add(textConsole);
				
				JScrollPane scrollPaneFonte = new JScrollPane(textFonte);
				scrollPaneFonte.setBounds(10, 11, 1089, 419);
				panelPrograma.add(scrollPaneFonte);
				
				
				JScrollPane scrollPaneConsole = new JScrollPane(textConsole);
				scrollPaneConsole.setBounds(10, 21, 1077, 164);
				panelConsole.add(scrollPaneConsole);
				
				qntArquivos++;
				}
			}
		});
		btnNovoArquivo.setBounds(10, 10, 111, 23);
		contentPane.add(btnNovoArquivo);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(461, 10, 73, 23);
		contentPane.add(btnSair);
		
		JButton btnCarregarArquivo = new JButton("Carregar Arquivo");
		btnCarregarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					//File file = new File(chooser.getSelectedFile().getAbsolutePath());
					try {
						
						FileReader arq = new FileReader(chooser.getSelectedFile().getAbsolutePath());
						BufferedReader lerArq = new BufferedReader(arq);
						 
					      String linha = lerArq.readLine(); // lê a primeira linha
					// a variável "linha" recebe o valor "null" quando o processo
					// de repetição atingir o final do arquivo texto
					      String texto = "";
					      while (linha != null) {
					    	 texto = texto  + linha +"\n";
					        linha = lerArq.readLine(); // lê da segunda até a última linha
					      }
					 
					      String nome = chooser.getSelectedFile().getAbsolutePath();
							MutableTreeNode rootNodeAux = new DefaultMutableTreeNode(nome);
							treeModel.insertNodeInto(rootNodeAux, rootNode, qntArquivos);
							
							JPanel panelPrograma = new JPanel();
							tabbedPane.addTab(nome, null, panelPrograma, null);
							panelPrograma.setBackground(SystemColor.menu);
							panelPrograma.setLayout(null);
							

							JTextArea textFonte = new JTextArea();
							textFonte.setText(texto);
							
							panelPrograma.add(textFonte);
							
							JPanel panelConsole = new JPanel();
							panelConsole.setLayout(null);
							panelConsole.setBorder(new TitledBorder(null, "Console", TitledBorder.LEADING, TitledBorder.TOP, null, null));
							panelConsole.setBackground(SystemColor.menu);
							panelConsole.setBounds(6, 441, 1098, 188);
							panelPrograma.add(panelConsole);
							
							JTextArea textConsole = new JTextArea();
							
							panelConsole.add(textConsole);
							
							JScrollPane scrollPaneFonte = new JScrollPane(textFonte);
							scrollPaneFonte.setBounds(10, 11, 1089, 419);
							panelPrograma.add(scrollPaneFonte);
							
							
							JScrollPane scrollPaneConsole = new JScrollPane(textConsole);
							scrollPaneConsole.setBounds(10, 21, 1077, 164);
							panelConsole.add(scrollPaneConsole);
							
							qntArquivos++;
					      
					      
					      arq.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		});
		btnCarregarArquivo.setBounds(131, 10, 143, 23);
		contentPane.add(btnCarregarArquivo);


	}
}
