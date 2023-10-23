package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PConsultarRegistro extends View {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PConsultarRegistro(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar");
		lblNewLabel.setBounds(205, 120, 46, 14);
		add(lblNewLabel);
		
		
	}

}
