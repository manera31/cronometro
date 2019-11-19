package com.joanmanera;

import javax.swing.JLabel;

public class Horas implements Runnable{
	public Thread hilo;
	private int horas;
	private JLabel label;
	
	public Horas(JLabel label) {
		hilo = new Thread(this, "HorasHilo");
		this.horas = 0;
		this.label = label;
		hilo.start();
	}

	@Override
	public void run() {
		while(true) {
			try {
				if(horas < 10) {
					label.setText("0"+String.valueOf(horas++));
				} else {
					label.setText(String.valueOf(horas++));
				}
				Thread.sleep(3600000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(horas >= 24) {
				horas = 0;
			}
		}
		
	}
}
