package Ejercicio12;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 frame = new ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1V2 = new JButton("Ventana 1");
		boton1V2.setBounds(17, 35, 106, 29);
		contentPane.add(boton1V2);
		
		JButton boton2V2 = new JButton("Ventana 2");
		boton2V2.setBounds(161, 35, 117, 29);
		contentPane.add(boton2V2);
		
		JButton boton3V2 = new JButton("Ventana 3");
		boton3V2.setBounds(312, 35, 117, 29);
		contentPane.add(boton3V2);
		
		
		boton1V2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana1 v1 = new ventana1();
				v1.setVisible(true);
				

			}
		});

		boton3V2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana3 v3 = new ventana3();
				v3.setVisible(true);
			}
		});
	}

}
