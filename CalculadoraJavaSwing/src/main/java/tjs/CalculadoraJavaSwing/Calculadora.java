package tjs.CalculadoraJavaSwing;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField Mostrar;

	public String acum = "";// VARIABLA QUE ACUMULA EL VALOR ENTRAT
	public double a; // VARIABLE QUE EMMAGATZEMA EL PRIMER VALOR ENTRAT

	public double op;// VARIABLA PER REALITZAR OPERACIONS
	public String c = "";// GUARDEM EL SIGNE DE L'OPERACIÓ PER DESPRÉS CRIDAR-LO EN LA CADICIÓ
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton B_4 = new JButton("4");
		B_4.setBounds(38, 125, 73, 41);

		JButton B_5 = new JButton("5");
		B_5.setBounds(115, 125, 73, 41);

		JButton B_6 = new JButton("6");
		B_6.setBounds(191, 125, 73, 41);

		JButton B_1 = new JButton("1");
		B_1.setBounds(38, 165, 73, 41);

		JButton B_2 = new JButton("2");
		B_2.setBounds(115, 165, 73, 41);

		JButton B_3 = new JButton("3");
		B_3.setBounds(191, 165, 72, 41);

		JButton B_7 = new JButton("7");
		B_7.setBounds(38, 84, 73, 41);

		JButton B_8 = new JButton("8");
		B_8.setBounds(115, 84, 73, 41);

		JButton B_9 = new JButton("9");
		B_9.setBounds(191, 84, 73, 41);

		JButton B_Punt = new JButton(".");
		B_Punt.setBounds(159, 209, 105, 41);

		JButton B_Menys = new JButton("-");
		B_Menys.setBounds(266, 125, 73, 41);

		JButton B_Mes = new JButton("+");
		B_Mes.setBounds(266, 165, 73, 41);

		JButton B_0 = new JButton("0");
		B_0.setBounds(38, 209, 117, 41);

		JButton B_Igual = new JButton("=");
		B_Igual.setBounds(266, 209, 73, 41);

		JButton B_CE = new JButton("CE");
		B_CE.setBounds(266, 84, 73, 41);

		Mostrar = new JTextField();
		Mostrar.setBounds(38, 26, 301, 58);
		Mostrar.setColumns(10);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(Mostrar);
		frame.getContentPane().add(B_2);
		frame.getContentPane().add(B_3);
		frame.getContentPane().add(B_4);
		frame.getContentPane().add(B_5);
		frame.getContentPane().add(B_1);
		frame.getContentPane().add(B_6);
		frame.getContentPane().add(B_7);
		frame.getContentPane().add(B_8);
		frame.getContentPane().add(B_9);
		frame.getContentPane().add(B_0);
		frame.getContentPane().add(B_Menys);
		frame.getContentPane().add(B_Mes);
		frame.getContentPane().add(B_Igual);
		frame.getContentPane().add(B_CE);
		frame.getContentPane().add(B_Punt);

		B_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				acum = Mostrar.getText() + "1";

				Mostrar.setText(acum);
			}
		});

		B_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "2";
				Mostrar.setText(acum);
			}
		});
		B_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "3";
				Mostrar.setText(acum);
			}
		});
		B_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "4";
				Mostrar.setText(acum);
			}
		});
		B_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "5";
				Mostrar.setText(acum);
			}
		});
		B_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "6";
				Mostrar.setText(acum);
			}
		});
		B_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "7";
				Mostrar.setText(acum);
			}
		});
		B_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "8";
				Mostrar.setText(acum);
			}
		});
		B_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "9";
				Mostrar.setText(acum);
			}
		});
		B_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + "0";
				Mostrar.setText(acum);
			}
		});
		
		B_Punt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText() + ".";
				Mostrar.setText(acum);
			}
		});

		B_Mes.addActionListener(new ActionListener() {// BOTÓ +
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "+";

				Mostrar.setText("");
				
			}
		});

		B_Menys.addActionListener(new ActionListener() {// BOTÓ -
			public void actionPerformed(ActionEvent e) {
				acum = Mostrar.getText();
				a = (Double.parseDouble(acum));
				c = "-";
				Mostrar.setText("");
			}
		});
		B_CE.addActionListener(new ActionListener() {// BOTÓ QUE HO BORRA TOT
			public void actionPerformed(ActionEvent e) {
				acum = "";

				Mostrar.setText(acum);
			}
		});

		B_Igual.addActionListener(new ActionListener() {// BOTÓ IGUAL
			public void actionPerformed(ActionEvent e) {

				acum = Mostrar.getText();
				
				if(acum=="666.0"){
					Mostrar.setText("Error");
				}
				double b = (Double.parseDouble(acum));

				Calc obj = new Calc();

				if (c == "+") {

					Mostrar.setText(String.valueOf(obj.suma(a, b)));
				} else {
					if (c == "-") {
						Mostrar.setText(String.valueOf(obj.resta(a, b)));

					}

				}

			}

		});
		
		
		

	}
}
