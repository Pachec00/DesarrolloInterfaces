package Ejercicio12;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 frame = new ventana1();
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
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Ventana 1");
		boton1.setBounds(17, 35, 106, 29);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Ventana 2");
		boton2.setBounds(161, 35, 117, 29);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("Ventana 3");
		boton3.setBounds(312, 35, 117, 29);
		contentPane.add(boton3);
		
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana2 v2 = new ventana2();
				v2.setVisible(true);

			}
		});

		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana3 v3 = new ventana3();
				v3.setVisible(true);
			}
		});
	}

}
