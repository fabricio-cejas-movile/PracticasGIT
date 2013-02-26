package com.practicas.git.enums;

public enum ValoresCualquiera {
	
	ANT("no se nada", 1234, 123L),
	HTEL("lolo", 198, 45L);
	
	private String a_;
	private Integer b_;
	private Long c_;
	
	ValoresCualquiera(String a, Integer b, Long c){
		a_=a;
		b_=b;
		c_=c;
	}

	public String getA_() {
		return a_;
	}

	public Integer getB_() {
		return b_;
	}

	public Long getC_() {
		return c_;
	}
	
	
}
