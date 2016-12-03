package infonews.TelaCliente;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TCadastroCliente extends JInternalFrame {

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
		setBounds(100, 100, 490, 459);
		

	}

}
