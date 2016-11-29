package infonews.tela;

import javax.swing.JPanel;




import javax.swing.border.TitledBorder;

import infonews.contato.Contato;
import infonews.endereco.Endereco;
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
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Color;

public class TelaCadastroCliente extends JPanel {
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfIdEndereco;
	private JTextField tfTelefone;
	private JTextField tfCep;
	private JTextField tfRua;
	private JTextField tfBairro;
	private JTextField tfNumero;
	private JTextField tfCidade;

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
		
		JLabel lblEndereco = new JLabel("Endereco");
		
		JLabel lblCep = new JLabel("Cep:");
		
		tfCep = new JTextField();
		tfCep.setColumns(10);
		
		JLabel lblRua = new JLabel("Rua:");
		
		tfRua = new JTextField();
		tfRua.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		
		tfCidade = new JTextField();
		tfCidade.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCadastra)
								.addComponent(lblEndereco)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblCpf)
								.addComponent(lblNome)
								.addComponent(lblTipoTelefone)
								.addComponent(lblBairro)
								.addComponent(lblCep))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNumero)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblCidade)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(37)
									.addComponent(tfIdEndereco, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRua)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfRua, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(18, Short.MAX_VALUE))
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(tfIdEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipoTelefone)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(lblEndereco)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRua)
						.addComponent(tfRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero)
						.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCadastra)
					.addGap(20))
		);
		
		setLayout(groupLayout);

	}
	private void cadastrarCliente() {
		
		Fachada fachada = Fachada.getInstance();
		Endereco endereco = new Endereco(1, tfCep.getText(), tfRua.getText(), tfBairro.getText(), tfNumero.getText(), tfCidade.getText());
		Cliente cliente = new Cliente(1, tfNome.getText(), tfCpf.getText(),tfTelefone.getText(),endereco);
		
		fachada.cadastraCliente(cliente);
		fachada.cadastrarEndereco(endereco);
		
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


