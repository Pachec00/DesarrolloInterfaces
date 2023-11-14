package examen.ejercicio1.gui;
import javax.swing.JScrollPane;

public class Consultar extends View {

	
	private static final long serialVersionUID = 1L;

	public Consultar(App controller) {
		super(controller);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 52, 442, 285);
		add(scrollPane);
		
		
	}
}
