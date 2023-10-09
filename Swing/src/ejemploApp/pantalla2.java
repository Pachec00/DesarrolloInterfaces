package ejemploApp;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pantalla2 extends View {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public pantalla2(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2");
		lblNewLabel.setBounds(179, 35, 46, 14);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ir a pantalla 3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla3();
			}
		});
		btnNewButton.setBounds(136, 198, 89, 23);
		add(btnNewButton);

	}
}
