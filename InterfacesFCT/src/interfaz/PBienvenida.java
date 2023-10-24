package interfaz;

import javax.swing.JLabel;

import modelo.Usuarios;

public class PBienvenida extends View {

	private static final long serialVersionUID = 1L;
	private JLabel lbl = new JLabel();

	/**
	 * Create the panel.
	 */
	public PBienvenida(App controller) {
		super(controller);
		setLayout(null);
		
		lbl.setBounds(208, 133, 140, 14);
		add(lbl);
		
	}
	
	public void actualizar(String nombre) {
		lbl.setText("Hola, "+ nombre);
	}
}
