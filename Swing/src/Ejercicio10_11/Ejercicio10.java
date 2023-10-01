package Ejercicio10_11;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class Ejercicio10 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 window = new Ejercicio10();
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
	public Ejercicio10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt1 = new JTextField();
		txt1.setBounds(141, 18, 130, 26);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(141, 70, 130, 26);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);

		txt3 = new JTextField();
		txt3.setBounds(141, 138, 130, 26);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(33, 196, 52, 27);
		frame.getContentPane().add(comboBox);
		
		JRadioButton radio1 = new JRadioButton("Rojo");
		radio1.setBounds(303, 19, 141, 23);
		frame.getContentPane().add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Amarillo");
		radio2.setBounds(303, 71, 141, 23);
		frame.getContentPane().add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Azul");
		radio3.setBounds(303, 139, 141, 23);
		frame.getContentPane().add(radio3);
		
		JLabel aviso = new JLabel("");
		aviso.setBounds(280, 200, 61, 16);
		frame.getContentPane().add(aviso);
		

		KeyListener k1 = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 40 || e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				} else if (e.getKeyCode() == 38) {
					e.getComponent().transferFocusBackward();
				}
			}
		};
		
		FocusListener fc = new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(null);				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if ( comboBox.getSelectedItem().equals("rojo") || radio1.isSelected()) {
					e.getComponent().setBackground(Color.RED);
				}else if ( comboBox.getSelectedItem().equals("amarillo") || radio2.isSelected()) {
					e.getComponent().setBackground(Color.YELLOW);
				}else if ( comboBox.getSelectedItem().equals("azul") || radio3.isSelected()) {
					e.getComponent().setBackground(Color.BLUE);
				}
			}
		};
		
		comboBox.addItem("");
		comboBox.addItem("rojo");
		comboBox.addItem("amarillo");
		comboBox.addItem("azul");
		
		
		
		
		
		
		txt1.addFocusListener(fc);
		txt2.addFocusListener(fc);
		txt3.addFocusListener(fc);
		
		
		
		txt1.addKeyListener(k1);
		txt2.addKeyListener(k1);
		txt3.addKeyListener(k1);
		
		
	}
}
