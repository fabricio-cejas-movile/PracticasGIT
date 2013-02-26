package com.practicas.git.threads;

import java.util.Random;

public class Impresiones implements Runnable {
	
	private final Integer tiempoInatividad;
	private final String nombre;
	private final static Random generator = new Random();
	
	
	public Impresiones(String nombreTarea) {
		super();
		nombre = nombreTarea;
		tiempoInatividad = generator.nextInt(5000);
	}


	@Override
	public void run() {
		try {
			System.out.printf("El proceso %s estara incativo por %s seg. \n", nombre, tiempoInatividad);
			
			Thread.sleep(tiempoInatividad);
			
		}catch (InterruptedException e){
			System.out.printf("El subproceso %s termino de forma prematura debido a la exception: %s \n",nombre, e);
		}
		
		System.out.printf("El proceso %s termino su inactividad\n", nombre);

	}

}
