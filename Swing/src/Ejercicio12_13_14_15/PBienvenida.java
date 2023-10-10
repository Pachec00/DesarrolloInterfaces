package Ejercicio12_13_14_15;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PBienvenida extends View {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PBienvenida(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a mi aplicacion");
		lblNewLabel.setBounds(124, 32, 189, 14);
		add(lblNewLabel);
		
		JButton bEntrar = new JButton("Entrar");
		bEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla1(null);
			}
		});
		bEntrar.setBounds(154, 145, 89, 23);
		add(bEntrar);
	}
}
