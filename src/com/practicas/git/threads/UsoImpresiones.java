package com.practicas.git.threads;

import java.util.ArrayList;

public class UsoImpresiones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Creacion de subprocesos");
		
		ArrayList<Thread> hilos = new ArrayList<Thread>();
		
		for (int i = 0; i < 20; i++){
			hilos.add(new Thread(new Impresiones("Tarea : " + i)));
		}
		
		System.out.println(hilos.size() + " Subprocesos creados");
		
		for (Thread hilo : hilos){
			hilo.start();
		}
		
		System.out.println("Terminaron de ejecutarse los subprocesos");
	}

}
