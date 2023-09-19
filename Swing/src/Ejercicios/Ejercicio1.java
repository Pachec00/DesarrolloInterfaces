package Ejercicios;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio1 extends JFrame{
	
	public void ejercicio1() {
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//contenedor
		Container c = getContentPane();
		JPanel jp = new JPanel();
		
		//layout
		GridLayout grid = new GridLayout(3, 2);
		setLayout(grid);
		
		GridLayout griJp = new GridLayout(2,2);
		jp.setLayout(griJp);
		
		c.add(jp);
		
		for ( int i = 1; i <= 6; i++) {
			if(i == 6) {
				for ( int j = 1; j <= 4; j++) {
					JLabel label = new JLabel();
					jp.add(label);
					label.setText("Texto" + i+j);
				}
				c.add(jp);
			}else {
				JLabel label = new JLabel();
				c.add(label);
				label.setText("Texto" + i);
			}
		}
		//hola
		
		
		setVisible(true);
	}
}
