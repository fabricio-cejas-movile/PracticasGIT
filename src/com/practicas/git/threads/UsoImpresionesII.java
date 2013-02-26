package com.practicas.git.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsoImpresionesII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Impresiones> prints = new ArrayList<Impresiones>();
		
		for (int i = 0; i < 10; i ++){
			prints.add(new Impresiones("tarea-" + i));
		}
		
		System.out.println("Tareas creadas. Iniciando Executor");
		
		ExecutorService executorProcess = Executors.newCachedThreadPool();
		
		for (Impresiones print : prints){
			
			executorProcess.execute(print);
		}
		
		executorProcess.shutdown();
		
		System.out.println("Tareas en ejecución, main termina");
	}

}
