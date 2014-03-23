/**
 * 
 */
package com.practicas.git.threadsII;

/**
 * @author fabri_000
 *
 */
public class Hilo_1_Runneable implements Runnable {
	
	int numero;
	
	public Hilo_1_Runneable(){
		numero = 1;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println(numero++);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo_1_Runneable hilo = new Hilo_1_Runneable();
		
		for (int i = 0; i < 10; i ++){
			new Thread(hilo).start();
		}
	}

}
