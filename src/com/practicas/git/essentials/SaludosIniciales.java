/**
 * 
 */
package com.practicas.git.essentials;

import java.util.Random;


/**
 * @author Rodrigo
 *
 */
public class SaludosIniciales {
	
	private static final String SALUDO_INICIAL = "Hola a todo el mundo!!!!!";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(SALUDO_INICIAL);
		
		Random r = new Random();
		for (int i = 0; i < 20; i++){
			System.out.println(r.nextInt());
		}
	}

}
