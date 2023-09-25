package Ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {

	private JFrame frame;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(136, 114, 86, 20);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton boton = new JButton("Sumar");
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if(txt.getText().isEmpty()) {
						txt.setText(String.valueOf("1"));
					}else {
						Integer x = Integer.parseInt(txt.getText());
						txt.setText(String.valueOf(x+1));
					}
				} catch (Exception e2) {
					txt.setText("");

					JOptionPane.showMessageDialog(null, "Hay un error", "Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		boton.setBounds(299, 113, 89, 23);
		frame.getContentPane().add(boton);
	}
}
