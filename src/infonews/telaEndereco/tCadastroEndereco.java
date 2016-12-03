package infonews.telaEndereco;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import infonews.endereco.Endereco;
import infonews.fachada.Fachada;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tCadastroEndereco extends JInternalFrame {
	private JTextField tfCep;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfNumero;
	private JTextField tfCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tCadastroEndereco frame = new tCadastroEndereco();
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
	public tCadastroEndereco() {
		setClosable(true);
		setTitle("Endere\u00E7o");
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 603, 425);
		
		JLabel lblCep = new JLabel("Cep:");
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua:");
		
		tfRua = new JTextField();
		tfRua.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastraEndereco();				
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}

		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(tCadastroEndereco.class.getResource("/icones/INFO NEWS PROJETO2016.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCidade)
								.addComponent(lblNmero)
								.addComponent(lblBairro)
								.addComponent(lblCep)
								.addComponent(lblRua))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tfRua, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(100)
							.addComponent(btnCadastrar)
							.addGap(57)
							.addComponent(btnLimpar)))
					.addContainerGap(186, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(473, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(68))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCep)
						.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRua))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmero)
						.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCidade)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnLimpar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	public void cadastraEndereco() {
		
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
