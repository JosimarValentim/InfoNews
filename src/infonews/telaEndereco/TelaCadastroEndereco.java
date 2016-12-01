package infonews.telaEndereco;

import javax.swing.JPanel;


import javax.swing.border.TitledBorder;

import infonews.fachada.Fachada;
import infonews.endereco.Endereco;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaCadastroEndereco extends JPanel {
	private JTextField tfNumero;
	private JTextField tfCidade;
	private JTextField tfBairro;
	private JTextField tfRua;
	private JTextField tfCep;

	/**
	 * Create the panel.
	 */
	public TelaCadastroEndereco() {
		setBackground(Color.WHITE);
		setBorder(new TitledBorder(null, "Cadstrar Endereco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(null);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(30, 34, 46, 14);
		add(lblCep);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setBounds(30, 62, 46, 14);
		add(lblRua);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(30, 92, 46, 14);
		add(lblBairro);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(30, 123, 46, 14);
		add(lblNmero);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(30, 158, 46, 14);
		add(lblCidade);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(92, 120, 86, 20);
		add(tfNumero);
		tfNumero.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setBounds(92, 155, 86, 20);
		add(tfCidade);
		tfCidade.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setBounds(92, 89, 86, 20);
		add(tfBairro);
		tfBairro.setColumns(10);
		
		tfRua = new JTextField();
		tfRua.setBounds(92, 59, 323, 20);
		add(tfRua);
		tfRua.setColumns(10);
		
		tfCep = new JTextField();
		tfCep.setBounds(92, 31, 86, 20);
		add(tfCep);
		tfCep.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarEndereco();
			}

		});
		btnCadastrar.setBounds(30, 214, 105, 23);
		add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();
			}
		});
		btnLimpar.setBounds(145, 214, 89, 23);
		add(btnLimpar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroEndereco.class.getResource("/icones/outroo.png")));
		lblNewLabel.setBounds(303, 201, 80, 69);
		add(lblNewLabel);
		
		

	}

	public void cadastrarEndereco() {
	
		Fachada fachada = new Fachada();
		
		Endereco endereco = new Endereco(1, tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfCep.getText(), tfRua.getText());
		
		fachada.atualizarEndereco(endereco);
		
		limpar();
	}
	
	public void limpar(){
		tfNumero.setText("");
		tfBairro.setText("");
		tfCidade.setText("");
		tfCep.setText("");
		tfRua.setText("");
	}

}
