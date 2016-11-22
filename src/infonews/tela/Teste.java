package infonews.tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import br.com.cadastro.entities.Cliente;
import br.com.cadastro.jdbc.FachadaJDBC;
import br.com.cadastro.util.ResultSetTable;
import javax.swing.JMenuBar;

public class Teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
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
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 50, 450, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pCadastra = new JPanel();
		pCadastra.setBounds(10, 0, 764, 251);
		panel.add(pCadastra);
		pCadastra.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 97, 21);
		pCadastra.add(menuBar);
		
		JButton btnNewButton = new JButton("New button");
		menuBar.add(btnNewButton);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(45, 10, 51, 14);
		pCadastra.add(lblNome);
		
		lblNome = new JTextField();
		lblNome.setBounds(43, 30, 469, 20);
		pCadastra.add(lblNome);
		lblNome.setColumns(50);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(572, 10, 37, 14);
		pCadastra.add(lblCpf);
		
		tfCpf = new JTextField();
		tfCpf.setBounds(572, 30, 109, 20);
		pCadastra.add(tfCpf);
		tfCpf.setColumns(11);
		
		JLabel lblDataDeNascimento = new JLabel("Data nasc. (aaaa-mm-dd)");
		lblDataDeNascimento.setBounds(44, 61, 152, 14);
		pCadastra.add(lblDataDeNascimento);
		
		tfNasc = new JTextField();
		tfNasc.setBounds(45, 80, 86, 20);
		pCadastra.add(tfNasc);
		tfNasc.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(527, 61, 51, 14);
		pCadastra.add(lblSexo);
		
		final JRadioButton rdbtnMasculino = new JRadioButton("masculino");
		rdbtnMasculino.setBounds(523, 79, 86, 23);
		rdbtnMasculino.setSelected(true);
		pCadastra.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("feminino");
		rdbtnFeminino.setBounds(611, 79, 77, 23);
		pCadastra.add(rdbtnFeminino);
		
		ButtonGroup rbSexo = new ButtonGroup();
		rbSexo.add(rdbtnMasculino);
		rbSexo.add(rdbtnFeminino);
		
		JLabel lblInteresses = new JLabel("Interesses");
		lblInteresses.setBounds(221, 61, 79, 14);
		pCadastra.add(lblInteresses);
		
		final JCheckBox chckbxMsica = new JCheckBox("m\u00FAsica");
		chckbxMsica.setBounds(221, 79, 75, 23);
		pCadastra.add(chckbxMsica);
		
		final JCheckBox chckbxTurismo = new JCheckBox("turismo");
		chckbxTurismo.setBounds(311, 79, 76, 23);
		pCadastra.add(chckbxTurismo);
		
		final JCheckBox chckbxTecnologia = new JCheckBox("tecnologia");
		chckbxTecnologia.setBounds(415, 79, 87, 23);
		pCadastra.add(chckbxTecnologia);
		
		plistar = new JPanel();
		plistar.setBounds(10, 262, 754, 279);
		panel.add(plistar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setCpf( Integer.parseInt(tfCpf.getText().substring(0, 8)));
				cliente.setNome(lblNome.getText());
				if(!"".equals(tfNasc.getText())){
					cliente.setDatanascimento(java.sql.Date.valueOf(tfNasc.getText()));
				}
				boolean radio;  
				radio =  rdbtnMasculino.isSelected();
				cliente.setSexo((byte) (radio ? 0 : 1));
				String interesses = "";
				if (chckbxMsica.isSelected()) {
					interesses += "Música ";
				}
				
				if (chckbxTecnologia.isSelected()) {
					interesses += "Tecnologia ";
				}
				
				if (chckbxTurismo.isSelected()) {
					interesses += "Turismo";
				}
				
				cliente.setInteresses(interesses);
				FachadaJDBC.obterInstancia().cadastrar(cliente);
				limparFlields();
				listar();
			}
		});
		btnCadastrar.setBounds(309, 217, 109, 23);
		pCadastra.add(btnCadastrar);
		listar();
		
	}
	
	private void limparFlields(){
		lblNome.setText("");
		tfCpf.setText("");
		tfNasc.setText("");
	}
	
	private void listar() {
		plistar.removeAll();
		rs = FachadaJDBC.obterInstancia().listar();
		try {
			plistar.setLayout(null);
			ResultSetTable rst = new ResultSetTable(rs);
			rst.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  
			rst.setPreferredScrollableViewportSize(new Dimension(240,140));  
	        JScrollPane scrollPane = new JScrollPane(rst);
	        scrollPane.setSize(734, 274);
	        scrollPane.setLocation(10, 5);
	        plistar.add(scrollPane);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	}

}
