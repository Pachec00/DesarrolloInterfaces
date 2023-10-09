package ejemploApp;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pantalla3 extends View {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public pantalla3(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("3");
		lblNewLabel.setBounds(202, 5, 46, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ir a pantalla 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla1();
			}
		});
		btnNewButton.setBounds(150, 181, 89, 23);
		add(btnNewButton);

	}
}
