package com.practicas.git.threadsII;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hilo_4_Interrupt implements Runnable {

	private static final Map<String, String> mensajes = new HashMap<String, String>();

	static {
		mensajes.put("1", "12");
		mensajes.put("2", "123");
		mensajes.put("3", "1234");
		mensajes.put("4", "12345");
	}

	@Override
	public void run() {
		Iterator<String> mensajesIterator = mensajes.values().iterator();

		while (mensajesIterator.hasNext()) {

			try {
				Thread.sleep(1000);
				System.out.println(mensajesIterator.next());

				if (Thread.interrupted()) {
					throw new InterruptedByTimeoutException();
				}
			} catch (Exception e) {
				System.out.println("hilo Interrumpido");
			} finally {
				System.out.println("termino hilo");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo_4_Interrupt hilo = new Hilo_4_Interrupt();

		for (int i = 0; i < 50; i++) {
			new Thread(hilo).start();
		}
	}

}
