package com.joanmanera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 440, 253);
		contentPane.add(panel);
		
		JLabel label1 = new JLabel("00");
		panel.add(label1);
		
		JLabel lblNewLabel = new JLabel(":");
		panel.add(lblNewLabel);
		
		JLabel label2 = new JLabel("00");
		panel.add(label2);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		panel.add(lblNewLabel_1);
		
		JLabel label3 = new JLabel("00");
		panel.add(label3);
		
		Segundos segundos = new Segundos(label3);
		Minutos minutos = new Minutos(label2);
		Horas horas = new Horas(label1);
	}

}

