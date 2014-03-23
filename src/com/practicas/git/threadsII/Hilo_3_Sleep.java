package com.practicas.git.threadsII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author fabri_000
 * 
 */
public class Hilo_3_Sleep {

	private static final Map<String, String> mensajes = new HashMap<String, String>();

	static {
		mensajes.put("1", "12");
		mensajes.put("2", "123");
		mensajes.put("3", "1234");
		mensajes.put("4", "12345");
	}

	public static void main(String[] args) throws InterruptedException {
		Iterator<String> mensajesIterator = mensajes.values().iterator();

		while (mensajesIterator.hasNext()) {
			// Thread.sleep(4000);
			System.out.println(mensajesIterator.next());
		}

		Iterator<Entry<String, String>> mensajesIterator2 = mensajes.entrySet().iterator();

		while (mensajesIterator2.hasNext()) {
			Entry<String, String> keyValue = mensajesIterator2.next();
			System.out.println(keyValue.getKey() + " - " + keyValue.getValue());
		}
	}

}
