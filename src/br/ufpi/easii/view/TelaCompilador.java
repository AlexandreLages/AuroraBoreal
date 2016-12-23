package br.ufpi.easii.view;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

import br.ufpi.easii.controller.Compilador;
import br.ufpi.easii.model.Arquivo;

public class TelaCompilador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7599085553465052471L;
	private JPanel contentPane;
	private int qntArquivos;
	private int indiceSelecionado;
	private ArrayList<Arquivo> arquivos;

	/**
	 * Create the frame.
	 */
	public TelaCompilador() {
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		indiceSelecionado = 0;
		qntArquivos = 1;
		arquivos = new ArrayList<>();
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

		Arquivo ar = new Arquivo();
		ar.setNome("Main");
		
		arquivos.add(ar);

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
				JFileChooser chooser = new JFileChooser();
				JPanel pane = (JPanel) tabbedPane.getComponent(indiceSelecionado);
				JScrollPane scrollPane =  (JScrollPane) pane.getComponent(1);
				JViewport viewport = (JViewport) scrollPane.getComponent(0);
				JTextArea areaPrograma = (JTextArea) viewport.getComponent(0);
				
				arquivos.get(indiceSelecionado).setFonte(areaPrograma.getText());
				
				//caso o arquivo nao tenha sido salvo antes da compilacao
				if(arquivos.get(indiceSelecionado).getPath()==null){
					if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
						
						arquivos.get(indiceSelecionado).setPath(chooser.getSelectedFile().getAbsolutePath()+".txt");
						try {
							FileWriter arq = new FileWriter(arquivos.get(indiceSelecionado).getPath());
							PrintWriter gravarArq = new PrintWriter(arq);
							gravarArq.printf(arquivos.get(indiceSelecionado).getFonte());
							
								arq.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						//apos salvo o arquivo deve ser enviado para o metodo que realiza a compilacao
						String resposta;
						try {
							resposta = Compilador.compilar(arquivos.get(indiceSelecionado).getPath());
							JPanel pane2 = (JPanel) pane.getComponent(0);
							JScrollPane scrollPane2 =  (JScrollPane) pane2.getComponent(0);
							JViewport viewport2 = (JViewport) scrollPane2.getComponent(0);
							JTextArea areaCompilacao = (JTextArea) viewport2.getComponent(0);
							areaCompilacao.setText(resposta);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						 
						 
					}
				}else{
					//envio o path desse arquivo
					try {
						
						FileWriter arq = new FileWriter(arquivos.get(indiceSelecionado).getPath());
						PrintWriter gravarArq = new PrintWriter(arq);
						gravarArq.printf(arquivos.get(indiceSelecionado).getFonte());
						
							arq.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					String resposta;
					try {
						resposta = Compilador.compilar(arquivos.get(indiceSelecionado).getPath());
						 JPanel pane2 = (JPanel) pane.getComponent(0);
							JScrollPane scrollPane2 =  (JScrollPane) pane2.getComponent(0);
							JViewport viewport2 = (JViewport) scrollPane2.getComponent(0);
							JTextArea areaCompilacao = (JTextArea) viewport2.getComponent(0);
							areaCompilacao.setText(resposta);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 
					
				}
				
				

			}
		});
		btnComplilar.setBounds(361, 10, 94, 23);
		contentPane.add(btnComplilar);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arquivos.get(indiceSelecionado).getPath()==null){
				JFileChooser chooser = new JFileChooser();
				
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					JPanel pane = (JPanel) tabbedPane.getComponent(indiceSelecionado);
					JScrollPane scrollPane =  (JScrollPane) pane.getComponent(1);
					JViewport viewport = (JViewport) scrollPane.getComponent(0);
					JTextArea areaPrograma = (JTextArea) viewport.getComponent(0);
					
					arquivos.get(indiceSelecionado).setFonte(areaPrograma.getText());
					arquivos.get(indiceSelecionado).setPath(chooser.getSelectedFile().getAbsolutePath()+".txt");
					 try {
						FileWriter arq = new FileWriter(arquivos.get(indiceSelecionado).getPath());
						PrintWriter gravarArq = new PrintWriter(arq);
						gravarArq.printf(arquivos.get(indiceSelecionado).getFonte());
						arq.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					
				}
				//quando clica em salvar e o arquivo ja possui um path, ele e salvo nesse lugar
			}else{
				try {
					
					JPanel pane = (JPanel) tabbedPane.getComponent(indiceSelecionado);
					JScrollPane scrollPane =  (JScrollPane) pane.getComponent(1);
					JViewport viewport = (JViewport) scrollPane.getComponent(0);
					JTextArea areaPrograma = (JTextArea) viewport.getComponent(0);
					
					arquivos.get(indiceSelecionado).setFonte(areaPrograma.getText());
					
					FileWriter arq = new FileWriter(arquivos.get(indiceSelecionado).getPath());
					PrintWriter gravarArq = new PrintWriter(arq);
					gravarArq.printf(arquivos.get(indiceSelecionado).getFonte());
					arq.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		});
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
				Arquivo arq = new Arquivo();
				arq.setNome(nome);
				arquivos.add(arq);
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
					      	//apos carregar um arquivo cria o objeto e adiciona na lista
					      	Arquivo arqui = new Arquivo();
					      	arqui.setNome(nome);
					      	arqui.setFonte(texto);
					      	arqui.setPath(nome);
							arquivos.add(arqui);
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
