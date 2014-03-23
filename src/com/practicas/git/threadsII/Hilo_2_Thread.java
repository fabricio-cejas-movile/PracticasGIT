package com.practicas.git.threadsII;

public class Hilo_2_Thread extends Thread {
	
	public synchronized void run(){
		System.out.printf("Hilo : [%s] [ram : %f]%n", "1", Math.random());
	}
	
	public static void main(String[] args) {
		
		Hilo_2_Thread[] hilos = {new Hilo_2_Thread(), new Hilo_2_Thread(), new Hilo_2_Thread()};
		
		for(Hilo_2_Thread hilo : hilos){
			hilo.start();
		}
		
	}

}
