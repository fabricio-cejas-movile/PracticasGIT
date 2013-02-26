package com.practicas.git.spring;

import java.util.Properties;

public class ShowingProps {
	
	private Properties properties;
	
	public ShowingProps(LoadProperties properties){
		this.properties = properties.getProperties();
	}
	
	public void ShowProperties(){
		System.out.println(properties.getProperty("saludo.init"));
		System.out.println(properties.getProperty("saludo.end"));
		System.out.println(properties.getProperty("valor.integer"));
		System.out.println(properties.getProperty("valor.string"));
	}
}
