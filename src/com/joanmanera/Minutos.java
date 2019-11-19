package com.joanmanera;

import javax.swing.JLabel;

public class Minutos implements Runnable{
	public Thread hilo;
	private int minutos;
	private JLabel label;
	
	public Minutos(JLabel label) {
		hilo = new Thread(this, "MinutosHilo");
		this.minutos = 0;
		this.label = label;
		hilo.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				if(minutos < 10) {
					label.setText("0"+String.valueOf(minutos++));
				} else {
					label.setText(String.valueOf(minutos++));
				}
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(minutos >= 60) {
				minutos = 0;
			}
		}
		
	}

}
