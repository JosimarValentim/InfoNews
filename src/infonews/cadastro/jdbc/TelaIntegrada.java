package infonews.cadastro.jdbc;

import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import infonews.cliente.*;
import infonews.fachada.*;
import infonews.cadastro.util.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class TelaIntegrada extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfIdCliente;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfContato_id;
	private JTextField tfEndereco_IdEndereco;
	ResultSet rs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIntegrada frame = new TelaIntegrada();
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
	public TelaIntegrada() {
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 232, 232));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 50, 450, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pCadastra = new JPanel();
		pCadastra.setBounds(10, 11, 764, 251);
		panel.add(pCadastra);
		pCadastra.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(45, 10, 51, 14);
		pCadastra.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(43, 30, 469, 20);
		pCadastra.add(tfNome);
		tfNome.setColumns(50);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(572, 10, 37, 14);
		pCadastra.add(lblCpf);
		
		tfCpf = new JTextField();
		tfCpf.setBounds(572, 30, 109, 20);
		pCadastra.add(tfCpf);
		tfCpf.setColumns(11);
		
		JLabel IdCliente = new JLabel("ID CLIENTE:");
		IdCliente.setBounds(44, 61, 152, 14);
		pCadastra.add(IdCliente);
		
		tfIdCliente = new JTextField();
		tfIdCliente.setBounds(45, 80, 86, 20);
		pCadastra.add(tfIdCliente);
		tfIdCliente.setColumns(5);
		
		JLabel lblContato_id = new JLabel("ID CONTATO:");
		lblContato_id.setBounds(500, 61, 79, 14);
		pCadastra.add(lblContato_id);
		
		tfContato_id = new JTextField();
		tfContato_id.setBounds(500, 62, 100, 15);
		pCadastra.add(tfIdCliente);
		tfContato_id.setColumns(10);
		
		JLabel lblEndereco_IdEndereco = new JLabel("ID ENDERECO:");
		lblEndereco_IdEndereco.setBounds(221, 61, 79, 14);
		pCadastra.add(lblEndereco_IdEndereco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setIdCliente( Integer.parseInt(tfIdCliente.getText().substring(0, 8)));
				cliente.setNome(tfNome.getText());
					
				limparFlields();
				listar();
			}
		});;
		btnCadastrar.setBounds(309, 217, 109, 23);
		pCadastra.add(btnCadastrar);
		listar();
		
	}
	
	private void limparFlields(){
		tfNome.setText("");
		tfCpf.setText("");
		tfIdCliente.setText("");
	}
	
	private void listar() {
		rs = Fachada.obterInstancia().listar();
		try {
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
