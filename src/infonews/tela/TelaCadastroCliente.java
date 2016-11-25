package infonews.tela;

import javax.swing.JPanel;



import javax.swing.border.TitledBorder;

import infonews.contato.Contato;
import infonews.cliente.Cliente;
import infonews.fachada.Fachada;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JPanel {
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfIdContato;
	private JTextField tfIdEndereco;
	private JTextField tfTelefone;

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		setBorder(new TitledBorder(null, "Cadastrar Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setVerticalAlignment(SwingConstants.TOP);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		
		JLabel lblIdContato = new JLabel("ID Contato:");
		
		tfIdContato = new JTextField();
		tfIdContato.setColumns(10);
		
		JLabel lblIdEndereco = new JLabel("ID Endereco:");
		
		tfIdEndereco = new JTextField();
		tfIdEndereco.setColumns(10);
		
		JLabel lblTipoTelefone = new JLabel("Telefone:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fixo", "Celular", "Fax"}));
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JButton btnCadastra = new JButton("Cadastrar");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCpf)
						.addComponent(lblNome)
						.addComponent(lblIdEndereco)
						.addComponent(lblIdContato)
						.addComponent(btnCadastra)
						.addComponent(lblTipoTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(tfIdEndereco, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(tfIdContato, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfIdContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdContato))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdEndereco)
						.addComponent(tfIdEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoTelefone))
					.addGap(18)
					.addComponent(btnCadastra)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		
		setLayout(groupLayout);

	}
	private void cadastrarCliente() {
		
		Fachada fachada = Fachada.getInstance();
		
		Cliente cliente = new Cliente(tfNome.getText(), tfCpf.getText(),tfIdContato.getText(),tfIdEndereco.getText());
		
		fachada.cadastraCliente(cliente);
		
		ArrayList<Cliente> lista = fachada.listaCliente();
		
		int indiceCliente = 0;
		
		for(int i=0; i<lista.size();i++){
			if(lista.get(i).getCpf().equalsIgnoreCase(cliente.getCpf())){
				indiceCliente = lista.get(i).getIdCliente();
			}
		}
		
		limparCampos();	
	}
	private void limparCampos() {
		// TODO Auto-generated method stub
		
	}
		
}


