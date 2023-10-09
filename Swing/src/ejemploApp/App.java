package ejemploApp;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;
	
	private pantalla1 p1;
	private pantalla2 p2;
	private pantalla3 p3;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new pantalla1(this);
		p2 = new pantalla2(this);
		p3 = new pantalla3(this);
		
		irPantalla1();
	}
	
	public void irPantalla1() {
		frame.setContentPane(p1);
		frame.revalidate();
	}
	
	public void irPantalla2() {
		frame.setContentPane(p2);
		frame.revalidate();
	}
	
	public void irPantalla3() {
		frame.setContentPane(p3);
		frame.revalidate();
	}

}
