package Ejercicios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BotonPulsadoListener implements ActionListener {
	private JLabel resultado;
	
	

	public BotonPulsadoListener(JLabel resultado) {
		this.resultado = resultado;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		resultado.setText("Has pulsado el boton" + e.getActionCommand());
		
		

	}

}
