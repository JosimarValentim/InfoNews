package infonews.tela;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import infonews.tela.TelaCadastroCliente;
import infonews.cliente.*;


public class TelaMenu extends JPanel {
	private JFrame frame = new JFrame();

	/**
	 * Create the panel.
	 */
	public TelaMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastra = new JMenu("Cadastra");
		menuBar.add(mnCadastra);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroCliente tCadastroCliente = new TelaCadastroCliente();
				
			
				frame.setContentPane(tCadastroCliente);
				frame.getContentPane().revalidate();
				frame.setVisible(true);
			}
		});
		mnCadastra.add(mntmCliente);
		

	}

}
