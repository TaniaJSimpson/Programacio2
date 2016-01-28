package tjs.CalculadoraJavaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;

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
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("4");
		button.setBounds(38, 113, 73, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("5");
		button_1.setBounds(115, 113, 73, 41);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("6");
		button_2.setBounds(191, 113, 73, 41);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(38, 153, 73, 41);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(115, 153, 73, 41);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(192, 153, 72, 41);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBounds(38, 72, 73, 41);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBounds(115, 72, 73, 41);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBounds(191, 72, 73, 41);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBounds(38, 194, 122, 41);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.setBounds(159, 194, 105, 41);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(266, 72, 73, 41);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(266, 113, 73, 81);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.setBounds(266, 194, 73, 41);
		frame.getContentPane().add(button_13);
		
		textField = new JTextField();
		textField.setBounds(38, 11, 301, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
