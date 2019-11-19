package com.joanmanera;

import javax.swing.JLabel;

public class Segundos implements Runnable {
	public Thread hilo;
	private int segundos;
	private JLabel label;
	
	public Segundos(JLabel label) {
		hilo = new Thread(this, "SegundosHilo");
		this.segundos = 0;
		this.label = label;
		hilo.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				if(segundos < 10) {
					label.setText("0"+String.valueOf(segundos++));
				} else {
					label.setText(String.valueOf(segundos++));
				}
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(segundos >= 60) {
				segundos = 0;
			}
		}
		
	}

}
