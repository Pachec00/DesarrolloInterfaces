package Ejercicio12;

import javax.swing.JFrame;

public class Main extends JFrame{

	
	private static final long serialVersionUID = 109114910856887168L;
	
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	
	public Main() {
		super();
		setBounds(20,20,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1 = new Panel1(this);
		p2 = new Panel2(this);
		p3 = new Panel3(this);
		
		setContentPane(p1);
	}
	
	public void run() {
		setVisible(true);
	}
	

	
}
