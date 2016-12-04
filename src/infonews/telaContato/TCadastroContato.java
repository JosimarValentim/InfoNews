package infonews.telaContato;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import infonews.cliente.Cliente;
import infonews.contato.Contato;
import infonews.endereco.Endereco;
import infonews.fachada.Fachada;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TCadastroContato extends JInternalFrame {
	private JTextField tfTelefone;
	private JTextField tfTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TCadastroContato frame = new TCadastroContato();
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
	public TCadastroContato() {
		setFrameIcon(new ImageIcon(TCadastroContato.class.getResource("/icones/novoooo.png")));
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Contato");
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Telefone:");
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		tfTipo = new JTextField();
		tfTipo.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastraContato();
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
		
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TCadastroContato.class.getResource("/icones/INFO NEWS PROJETO2016.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(314, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(30))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(267, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(60)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(8)
					.addComponent(label)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	public void cadastraContato(){
		
		Fachada fachada = Fachada.getInstance();
		
		Contato contato = new Contato(1, tfTelefone.getText(), tfTipo.getText());
		
		fachada.cadastrarContato(contato);
		
		ArrayList<Contato> listaContato = fachada.listarContato();
		listaContato.add(contato);
	}
	public void limpar(){
		
		tfTelefone.setText("");
		tfTipo.setText("");		
		
	}
}
