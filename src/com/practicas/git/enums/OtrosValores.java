package com.practicas.git.enums;

public enum OtrosValores {
	
	OTRO, OTRA, ALGO;
	
	private Integer numero;
	
	static{
		OTRO.numero = Integer.valueOf("123");
		OTRA.numero = Integer.valueOf(432);
		ALGO.numero = 5678;
	}

	public Integer getNumero() {
		return numero;
	}
	
	
}
