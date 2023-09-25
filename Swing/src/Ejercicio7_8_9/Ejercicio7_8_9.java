package Ejercicio7_8_9;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class Ejercicio7_8_9 {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7_8_9 window = new Ejercicio7_8_9();
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
	public Ejercicio7_8_9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt1 = new JTextField();
		txt1.setBounds(309, 45, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(309, 114, 86, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);

		txt3 = new JTextField();
		txt3.setBounds(309, 199, 86, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);

		txt4 = new JTextField();
		txt4.setBounds(309, 278, 86, 20);
		frame.getContentPane().add(txt4);
		txt4.setColumns(10);

		KeyListener k1 = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

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
				e.getComponent().setBackground(Color.YELLOW);

			}
		};

		txt1.addFocusListener(fc);
		txt2.addFocusListener(fc);
		txt3.addFocusListener(fc);
		txt4.addFocusListener(fc);

		txt1.addKeyListener(k1);
		txt2.addKeyListener(k1);
		txt3.addKeyListener(k1);
		txt4.addKeyListener(k1);
	}

}
