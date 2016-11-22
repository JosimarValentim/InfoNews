package infonews.tela;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import infonews.fachada.Fachada;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JPanel {
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfIdCliente;
	private JTextField tfIdEndereco;
	private JTextField tfContato;
	private Fachada fachada = Fachada.obterInstancia();
	/**
	 * Create the panel.
	 */
	public CadastroCliente() {
		
		JLabel lblNome = new JLabel("Nome");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		
		JLabel lblIdCliente = new JLabel("ID Cliente");
		
		tfIdCliente = new JTextField();
		tfIdCliente.setColumns(10);
		
		JLabel lblIdEndereco = new JLabel("ID Endereco");
		
		tfIdEndereco = new JTextField();
		tfIdEndereco.setColumns(10);
		
		JLabel lblIdContato = new JLabel("ID Contato");
		
		tfContato = new JTextField();
		tfContato.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(fachada.listar());
		
		JButton btnGravar = new JButton("gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCpf)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIdCliente)
								.addComponent(tfIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIdEndereco)
								.addComponent(tfIdEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIdContato)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(236)
									.addComponent(tfContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(190)
					.addComponent(btnGravar))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(lblCpf))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdCliente)
						.addComponent(lblIdEndereco)
						.addComponent(lblIdContato))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfIdCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfIdEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(btnGravar)
					.addGap(18)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
