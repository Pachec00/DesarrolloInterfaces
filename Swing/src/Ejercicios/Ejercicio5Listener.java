package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Ejercicio5Listener implements ActionListener {

	private JLabel r;
	private Integer x;

	public Ejercicio5Listener(JLabel r) {

		this.r = r;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public JLabel getR() {
		return r;
	}

	public void setR(JLabel r) {
		this.r = r;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (r.getText().isEmpty()) {
			setX(0);
			String i = String.valueOf(getX());
			r.setText(i + e.getActionCommand());
		} else {
			setX(getX() + 1);
			String i = String.valueOf(getX());
			r.setText(i + e.getActionCommand());
		}

	}

}
