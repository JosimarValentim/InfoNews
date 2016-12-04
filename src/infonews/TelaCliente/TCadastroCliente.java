package infonews.TelaCliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import infonews.cliente.Cliente;
import infonews.contato.Contato;
import infonews.endereco.Endereco;
import infonews.fachada.Fachada;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TCadastroCliente extends JInternalFrame {
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfTelefone;
	private JTextField tfTipoContato;
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
					TCadastroCliente frame = new TCadastroCliente();
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
	public TCadastroCliente() {
		setBackground(Color.WHITE);
		setFrameIcon(new ImageIcon(TCadastroCliente.class.getResource("/icones/novoooo.png")));
		setTitle("Cadastro do Cliente");
		setClosable(true);
		getContentPane().setBackground(Color.WHITE);
		
		
		JLabel lblNome = new JLabel("Nome:");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		
		tfCpf = new JTextField();
		tfCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		
		JLabel lblTipoDeContato = new JLabel("Tipo de Contato:");
		
		tfTipoContato = new JTextField();
		tfTipoContato.setColumns(10);
		
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
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TCadastroCliente.class.getResource("/icones/outroo.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCadastrar)
							.addGap(18)
							.addComponent(btnLimpar)
							.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNome)
									.addGap(8))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblCpf)
										.addComponent(lblTelefone)
										.addComponent(lblCep)
										.addComponent(lblRua)
										.addComponent(lblNmero))
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfNome, 293, 293, 293)
								.addComponent(tfRua, 293, 293, 293)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
										.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblBairro)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(tfBairro))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblTipoDeContato)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(tfTipoContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
									.addComponent(lblCidade)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))))
					.addGap(79))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCpf)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(lblNome)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(tfTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoDeContato)
						.addComponent(tfTipoContato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCep)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(tfCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblBairro)
							.addComponent(tfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRua)
						.addComponent(tfRua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmero)
						.addComponent(tfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCidade))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCadastrar)
								.addComponent(btnLimpar))
							.addContainerGap(84, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label)
							.addContainerGap())))
		);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 470, 454);
		

	}
	public void cadastrarCliente(){
		
		Fachada fachada = Fachada.getInstance();
		
		Endereco endereco = new Endereco(1, tfCep.getText(), tfRua.getText(), tfBairro.getText(), tfNumero.getText(), tfCidade.getText());

		fachada.cadastrarEndereco(endereco);
		
		ArrayList<Endereco> listaEndereco = fachada.listarEndereco();
		
		int indice = 0;
		
		for(int i=0;i<listaEndereco.size();i++){
			if(listaEndereco.get(i).getRua().equals(endereco.getRua())){
				if(listaEndereco.get(i).getNumero().equalsIgnoreCase(endereco.getNumero())){
					indice = listaEndereco.get(i).getIdEndereco();			
				}
			}
		}
		
		Contato contato = new Contato(1, tfTelefone.getText(), tfTipoContato.getText());
		
		fachada.cadastrarContato(contato);
		
		ArrayList<Contato> listaContato = fachada.listarContato();
		
		int indiceContato = 0;
		
		for(int i=0;i<listaContato.size();i++){
			
			if(listaContato.get(i).getTelefone().equals(contato.getTelefone())){
				
				if(listaContato.get(i).getTipo().equalsIgnoreCase(contato.getTipo())){
					indiceContato = listaContato.get(i).getIdContato();	
				}
				
			}
		}
		
		Cliente cliente = new Cliente(1, tfNome.getText(), tfCpf.getText(), tfTipoContato.getText(), contato, endereco);
		cliente.setEndereco(fachada.procurarEndereco(indice));
		
		fachada.cadastraCliente(cliente);
		
		
		ArrayList<Cliente> lista = fachada.listaCliente();
		ArrayList<Contato> listar = fachada.listarContato();
		
		int indiceCliente = 0;
		
		for(int i=0; i<lista.size();i++){
			if(lista.get(i).getCpf().equalsIgnoreCase(cliente.getCpf())){
				indiceCliente = lista.get(i).getIdCliente();
			}
		
		}
		
		limpar()
		;}
	
	public void limpar(){
		
		tfNome.setText("");
		tfCpf.setText("");
		tfTelefone.setText("");
		tfTipoContato.setText("");
		tfCep.setText("");
		tfRua.setText("");
		tfBairro.setText("");
		tfNumero.setText("");
		tfCidade.setText("");
	}

}
