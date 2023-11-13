package examen.ejercicio1.gui;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class PBienvenida extends View {

	private static final long serialVersionUID = 1L;

	public PBienvenida(App controller) {
		super(controller);
		setLayout(null);
		
		JLabel titulo = new JLabel("Bienvenido a Car Shop");
		titulo.setForeground(new Color(128, 0, 255));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Freestyle Script", Font.PLAIN, 80));
		titulo.setBounds(143, 57, 461, 82);
		add(titulo);
		
		JLabel lblNewLabel = new JLabel("Acepta los terminos y condiciones");
		lblNewLabel.setBounds(224, 217, 170, 34);
		add(lblNewLabel);
		
		JCheckBox check = new JCheckBox("");
		check.setBounds(419, 217, 97, 23);
		add(check);
		
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(307, 331, 89, 23);
		add(entrar);
		
		JButton salir = new JButton("Salir");
		salir.setBounds(602, 381, 89, 23);
		add(salir);
	}
}
