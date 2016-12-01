package infonews.telaPrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import infonews.TelaCliente.TelaCadastroCliente;
import infonews.telaEndereco.TelaCadastroEndereco;
import infonews.telaProduto.TelaProduto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/icones/outroo.png")));
		frame.setBounds(100, 100, 892, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 403, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente tCadastroCliente = new TelaCadastroCliente();
				
				frame.setBounds(87, 103, 601, 356);
				frame.setContentPane(tCadastroCliente);
				frame.getContentPane().revalidate();
				frame.setVisible(true);
			
			}
		});
		mnCadastrar.add(mntmCliente);
		
		JMenuItem mntmEndereco = new JMenuItem("Endereco");
		mntmEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastroEndereco tCadastroEndereco = new TelaCadastroEndereco();
				
				frame.setBounds(87, 103, 601, 356);
				frame.setContentPane(tCadastroEndereco);
				frame.getContentPane().revalidate();
				frame.setVisible(true);
			}
		});
		mnCadastrar.add(mntmEndereco);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaProduto tProduto = new TelaProduto();
				
				frame.setBounds(87, 103, 601, 356);
				frame.setContentPane(tProduto);
				frame.getContentPane().revalidate();
				frame.setVisible(true);
			}
		});
		mnCadastrar.add(mntmProduto);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Contato");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnCadastrar.add(mntmNewMenuItem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/info news.png")));
		lblNewLabel.setBounds(144, 32, 709, 506);
		frame.getContentPane().add(lblNewLabel);
	}
}
