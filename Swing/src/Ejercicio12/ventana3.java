package Ejercicio12;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ventana3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana3 frame = new ventana3();
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
	public ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1V3 = new JButton("Ventana 1");
		boton1V3.setBounds(17, 35, 106, 29);
		contentPane.add(boton1V3);
		
		JButton boton2V3 = new JButton("Ventana 2");
		boton2V3.setBounds(161, 35, 117, 29);
		contentPane.add(boton2V3);
		
		JButton boton3 = new JButton("Ventana 3");
		boton3.setBounds(312, 35, 117, 29);
		contentPane.add(boton3);
		
		
		boton2V3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana2 v2 = new ventana2();
				v2.setVisible(true);

			}
		});

		boton1V3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ventana1 v1 = new ventana1();
				v1.setVisible(true);
			}
		});
	}

}
