package com.practicas.git.memory;

import java.util.ArrayList;
import java.util.Date;

public class LiberandoMemoria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LiberandoMemoria test = new LiberandoMemoria();
		ArrayList<WapInfoBO> wi = test.testGarbageColector();
		
		System.out.println(wi.size());
		
	}
	
	public ArrayList<WapInfoBO> testGarbageColector(){
		
		ArrayList<WapInfoBO> wi = new ArrayList<WapInfoBO>();
		
		WapInfoBO wapInfo;
		
		for (int i = 0; i < 165000; i++){
			wapInfo = new WapInfoBO(1 +i, "pixel" + i, true, "status" + i, "pixelType" + i, 
					"uuid" + i, "ref" + i, "excep" + i, "phone" + i, new Date(), "sbssutatus" + i , new Long(i), 
					"carrier" + i, "url" + i, "page" + i, "oriegn" + i, "header" + i, "temativa" + i, "lp" + i, 
					"keyword" + i, "day" + i, "day inserted" + i, "operator" + i, "country" + i, "op" + i, "ua" + i );
			
			wi.add(wapInfo);
		}
		
		//Solicitamos a la 'JVM' el 'GC', para liverar memoria.
		this.getSolicitaGarbageColector(); 
		
		return wi;
	}
	
	public void getSolicitaGarbageColector(){

		try{ 
		System.out.println( "********** INICIO: 'LIMPIEZA GARBAGE COLECTOR' **********" );
		Runtime basurero = Runtime.getRuntime(); 
		System.out.println( "MEMORIA TOTAL 'JVM': " + basurero.totalMemory() );
		System.out.println( "MEMORIA [FREE] 'JVM' [ANTES]: " + basurero.freeMemory() );
		basurero.gc(); //Solicitando ... 
		System.out.println( "MEMORIA [FREE] 'JVM' [DESPUES]: " + basurero.freeMemory() );
		System.out.println( "********** FIN: 'LIMPIEZA GARBAGE COLECTOR' **********" );
		}
		catch( Exception e ){
		e.printStackTrace();
		} 
	}
		
}
