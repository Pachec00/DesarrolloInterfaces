package programa;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana extends JFrame {

	public void iniciar() {

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		//contenedor
		Container c = getContentPane();
		JPanel jp = new JPanel();
		
		//creo el layout
		GridLayout grid = new GridLayout(4, 2);
		setLayout(grid);
		
		GridLayout griJp = new GridLayout(1,2);
		jp.setLayout(griJp);
		
		c.add(jp);
		
		for ( int i = 1; i<= 7; i++) {
			JButton boton = new JButton();
			c.add(boton);
			boton.setText("" + i);
		}
		
		for ( int i = 1; i<= 2; i++) {
			JButton boton = new JButton();
			jp.add(boton);
			boton.setText("" + i);
		}

		setVisible(true);
	}

}
