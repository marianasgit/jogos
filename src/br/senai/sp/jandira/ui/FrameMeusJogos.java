package br.senai.sp.jandira.ui;

import java.util.Arrays;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.JogosRepository;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FrameMeusJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	private int posicao;
	private FabricanteRepository fabricantes = new FabricanteRepository();
	private DefaultComboBoxModel<String> comboModelFabricante = new DefaultComboBoxModel<String>();
	private JComboBox<String> comboFabricante = new JComboBox<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMeusJogos frame = new FrameMeusJogos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMeusJogos() {
		setBackground(new Color(0, 0, 128));
		setTitle("Gerenciador de Jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 417);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblTitulo.setForeground(Color.YELLOW);
		lblTitulo.setBounds(36, 45, 105, 23);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		txtTitulo.setBounds(141, 44, 184, 28);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblFabricante.setForeground(Color.YELLOW);
		lblFabricante.setBounds(57, 85, 80, 22);
		contentPane.add(lblFabricante);
		
		//DefaultComboBoxModel<String> comboModelFabricante = new DefaultComboBoxModel<String>();
		
		
		for (Fabricante fabricanteAtual : fabricantes.listarTodos()) {
			comboModelFabricante.addElement(fabricanteAtual.getNome());
		}
		
		//JComboBox comboFabricante = new JComboBox();
		comboFabricante.setBounds(141, 83, 184, 28);
		contentPane.add(comboFabricante);
		comboFabricante.setModel(comboModelFabricante);
		
		JCheckBox chckbxZerado = new JCheckBox("Este jogo foi zerado");
		chckbxZerado.setFont(new Font("Century Schoolbook", Font.PLAIN, 12));
		chckbxZerado.setBounds(141, 123, 184, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblConsole.setForeground(Color.YELLOW);
		lblConsole.setBounds(69, 159, 62, 14);
		contentPane.add(lblConsole);
		
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setBounds(141, 153, 184, 28);
		contentPane.add(comboConsole);
		comboConsole.setModel(comboModelConsole);
		
		for (Console descricao : Console.values()) {
			comboModelConsole.addElement(descricao.getDescricao());
		}
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblValor.setForeground(Color.YELLOW);
		lblValor.setBounds(24, 196, 105, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(143, 192, 182, 28);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Century Schoolbook", Font.BOLD, 13));
		lblObservacoes.setForeground(Color.YELLOW);
		lblObservacoes.setBounds(36, 250, 95, 14);
		contentPane.add(lblObservacoes);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(143, 241, 182, 59);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setForeground(new Color(255, 255, 255));
		lblMeusJogos.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		lblMeusJogos.setBounds(489, 19, 115, 20);
		contentPane.add(lblMeusJogos);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 255, 0));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setFont(new Font("Century Schoolbook", Font.PLAIN, 14));
		btnSalvar.setBounds(166, 315, 143, 34);
		contentPane.add(btnSalvar);
		
		JButton btnSetaEsquerda = new JButton("<");
		btnSetaEsquerda.setBackground(new Color(51, 204, 0));
		btnSetaEsquerda.setBounds(449, 344, 89, 23);
		contentPane.add(btnSetaEsquerda);
		
		JButton btnSetaDireita = new JButton(">");
		btnSetaDireita.setBackground(new Color(51, 204, 0));
		btnSetaDireita.setBounds(537, 344, 89, 23);
		contentPane.add(btnSetaDireita);
		
		JScrollPane scrollPaneMeusJogos = new JScrollPane();
		scrollPaneMeusJogos.setBounds(424, 38, 227, 311);
		contentPane.add(scrollPaneMeusJogos);
		
		JList listMeusJogos = new JList();
		scrollPaneMeusJogos.setViewportView(listMeusJogos);
		
		DefaultListModel<String> modelJogos = new DefaultListModel<String>();
		listMeusJogos.setModel(modelJogos);
		
		JLabel lblCadastrar = new JLabel("Cadastrar novo jogo:");
		lblCadastrar.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		lblCadastrar.setForeground(new Color(255, 255, 255));
		lblCadastrar.setBounds(154, 6, 158, 28);
		contentPane.add(lblCadastrar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mariana Gomes\\Downloads\\background jogos.jpg"));
		lblNewLabel.setBounds(0, 10, 673, 370);
		contentPane.add(lblNewLabel);
		
		chckbxZerado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				
				jogo.setJogoZerado(chckbxZerado.isSelected());
				
			}
		});
		
		
		
		JogosRepository jogos = new JogosRepository(3);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				jogo.setTitulo(txtTitulo.getText());
				jogo.setObservacao(txtObservacoes.getText());
				jogo.setConsole(determinarConsole(comboConsole.getSelectedIndex()));
				jogo.setJogoZerado(chckbxZerado.isSelected());
				jogo.setValor(txtValor.getText());
				jogo.setFabricante(determinarFabricante());
				
				jogos.gravar(jogo, posicao);
				
				modelJogos.addElement(jogo.getTitulo());
				
				posicao++;
				
				
			}
			
		});
		
		listMeusJogos.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = jogos.listarJogo(listMeusJogos.getSelectedIndex());
				txtTitulo.setText(jogo.getTitulo());
				txtObservacoes.setText(jogo.getObservacao());
				txtValor.setText(jogo.getValor());
				comboConsole.setSelectedIndex(jogo.getConsole().ordinal());
				chckbxZerado.setSelected(jogo.isJogoZerado());
				comboFabricante.setSelectedIndex(Arrays.asList(fabricantes.getFabricantes()).indexOf(jogo.getFabricante()));
				
			}
		});
		
		
		btnSetaEsquerda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listMeusJogos.setSelectedIndex(listMeusJogos.getSelectedIndex()-1);
			}
		});
		
		btnSetaDireita.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				listMeusJogos.setSelectedIndex(listMeusJogos.getSelectedIndex()+1);
			}
		});
		
	}
		private Console determinarConsole(int consoleSelecionado) {
			if (consoleSelecionado == 0) {
				return Console.PLAYSTATION4;
			} else if (consoleSelecionado == 1) {
				return Console.NINTENDOWII;
			} else if (consoleSelecionado == 2) {
				return Console.NINTENDOSWITCH;
			} else if (consoleSelecionado == 3) {
				return Console.XBOXONE;
			} else {
				return Console.NINTENDO3DS;

			}
		}
		
		private Fabricante determinarFabricante () {
			if (comboFabricante.getSelectedIndex() == 0) {
				return fabricantes.listarFabricante(0);
			} else if (comboFabricante.getSelectedIndex()== 1) {
				return fabricantes.listarFabricante(1);
			} else if (comboFabricante.getSelectedIndex() == 2) {
				return fabricantes.listarFabricante(2);
			} else if (comboFabricante.getSelectedIndex() == 3) {
				return fabricantes.listarFabricante(3);
			} else {
				return fabricantes.listarFabricante(4);

			}
		}
	}


