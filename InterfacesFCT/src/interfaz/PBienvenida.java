package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PBienvenida extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PBienvenida() {
		setLayout(null);
		
		JLabel lblBienvenida = new JLabel("Hola");
		lblBienvenida.setBounds(208, 133, 46, 14);
		add(lblBienvenida);
		
	}
}
