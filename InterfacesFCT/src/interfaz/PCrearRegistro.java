package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PCrearRegistro extends View {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PCrearRegistro(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha");
		lblNewLabel.setBounds(77, 11, 46, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(77, 36, 96, 22);
		add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Horas");
		lblNewLabel_1.setBounds(77, 69, 46, 14);
		add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setBounds(77, 117, 200, 26);
		add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Tareas realizadas");
		lblNewLabel_2.setBounds(77, 186, 96, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(77, 213, 200, 64);
		add(textField);
		textField.setColumns(10);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.setBounds(351, 234, 89, 23);
		add(aceptar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(351, 266, 89, 23);
		add(cancelar);
		
	}
}
