package ejemploApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class pantalla1 extends View {

	private static final long serialVersionUID = 1L;

	
	public pantalla1(App controller) {
		super(controller);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Ir a pantalla 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.irPantalla2();
			}
		});
		
		btnNewButton.setBounds(163, 165, 133, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("P1");
		lblNewLabel.setBounds(181, 11, 149, 14);
		add(lblNewLabel);

	}

}
