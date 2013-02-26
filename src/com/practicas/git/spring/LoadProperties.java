package com.practicas.git.spring;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
	
	private Properties properties;
	
	public LoadProperties(Properties properties){
		
		this.properties = properties;
		
		InputStream in = this.getClass().getResourceAsStream("/com/practicas/git/spring/resources.properties");
		
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Properties getProperties(){
		return properties;
	}
	
}
