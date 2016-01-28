package tjs.CalculadoraSwing;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class Caluladora2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caluladora2 window = new Caluladora2();
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
	public Caluladora2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Creació del frame
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);

		// JPanel pels botons
		JPanel mp = new JPanel();

		// JPanel pel text
		JPanel mp1 = new JPanel();

		// Quadre de text
		JTextField Mostrar = new JTextField();
		
		
		mp1.add(Mostrar);

		
		// Els botons
		JButton b4 = new JButton("4");
		b4.setBounds(38, 113, 73, 41);
		mp.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(115, 113, 73, 41);
		mp.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(191, 113, 73, 41);
		mp.add(b6);
		
		JButton b1 = new JButton("1");
		b1.setBounds(38, 153, 73, 41);
		mp.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(115, 153, 73, 41);
		mp.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setBounds(192, 153, 72, 41);
		mp.add(b3);
		
		JButton b7 = new JButton("7");
		b7.setBounds(38, 72, 73, 41);
		mp.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(115, 72, 73, 41);
		mp.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(191, 72, 73, 41);
		mp.add(b9);
		
		JButton b0 = new JButton("0");
		b0.setBounds(38, 194, 122, 41);
		mp.add(b0);
		
		JButton bPunt = new JButton(".");
		bPunt.setBounds(159, 194, 105, 41);
		mp.add(bPunt);
		
		JButton bMenys = new JButton("-");
		bMenys.setBounds(266, 72, 73, 41);
		mp.add(bMenys);
		
		JButton bMes = new JButton("+");
		bMes.setBounds(266, 113, 73, 81);
		mp.add(bMes);
		
		JButton bIgual = new JButton("=");
		bIgual.setBounds(266, 194, 73, 41);
		mp.add(bIgual);

		frame.getContentPane().add(mp1);
		frame.getContentPane().add(mp);


	}

}
