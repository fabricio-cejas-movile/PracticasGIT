package com.practicas.git.enums;

public class PracticEnums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(ValoresCualquiera.HTEL.getA_());
		
		for (OtrosValores otros : OtrosValores.values()){
			System.out.println(otros.getNumero());
		}

	}

}
