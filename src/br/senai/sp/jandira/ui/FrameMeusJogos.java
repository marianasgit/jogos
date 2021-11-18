package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class FrameMeusJogos extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	private JTextField txtMeusJogos;

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
		setTitle("Gerenciador de Jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setBounds(10, 24, 69, 14);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(83, 21, 86, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(20, 56, 60, 14);
		contentPane.add(lblFabricante);
		
		DefaultComboBoxModel<String> comboModelFabricante = new DefaultComboBoxModel<String>();
		
		FabricanteRepository fabricantes = new FabricanteRepository();
		
		for (Fabricante fabricanteAtual : fabricantes.listarTodos()) {
			comboModelFabricante.addElement(fabricanteAtual.getNome());
		}
		
		JComboBox comboFabricante = new JComboBox();
		comboFabricante.setBounds(83, 52, 86, 22);
		contentPane.add(comboFabricante);
		comboFabricante.setModel(comboModelFabricante);
		
		JCheckBox chckbxZerado = new JCheckBox("Zerado");
		chckbxZerado.setBounds(83, 84, 78, 23);
		contentPane.add(chckbxZerado);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(33, 128, 46, 14);
		contentPane.add(lblConsole);
		
		DefaultComboBoxModel<String> comboModelConsole = new DefaultComboBoxModel<String>();
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setBounds(83, 124, 86, 22);
		contentPane.add(comboConsole);
		comboConsole.setModel(comboModelConsole);
		
		for (Console descricao : Console.values()) {
			comboModelConsole.addElement(descricao.getDescricao());
		}
		
		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setBounds(1, 169, 78, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(83, 166, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setBounds(10, 201, 69, 14);
		contentPane.add(lblObservacoes);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(83, 197, 86, 53);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);
		
		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setBounds(282, 24, 78, 14);
		contentPane.add(lblMeusJogos);
		
		txtMeusJogos = new JTextField();
		txtMeusJogos.setBounds(261, 52, 149, 203);
		contentPane.add(txtMeusJogos);
		txtMeusJogos.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(33, 288, 128, 23);
		contentPane.add(btnSalvar);
		
		JButton btnSetaEsquerda = new JButton("<");
		btnSetaEsquerda.setBounds(247, 288, 89, 23);
		contentPane.add(btnSetaEsquerda);
		
		JButton btnSetaDireita = new JButton(">");
		btnSetaDireita.setBounds(335, 288, 89, 23);
		contentPane.add(btnSetaDireita);
		
		chckbxZerado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jogo jogo = new Jogo();
				
				jogo.setJogoZerado(chckbxZerado.isSelected());
				
			}
		});
	}

	

}
