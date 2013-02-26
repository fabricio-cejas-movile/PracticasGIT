package com.practicas.git.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestingSpring {
	
	private static LoadProperties propertie;
	
	private static ShowingProps shows;
	
	public ShowingProps getShows() {
		return shows;
	}
	public void setShows(ShowingProps shows) {
		TestingSpring.shows = shows;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/applicationContext.xml"));
		 
        propertie = (LoadProperties)factory.getBean("resources");
        
        String numero = propertie.getProperties().getProperty("valor.integer");
        
        System.out.println(numero);
        
        ShowingProps show = (ShowingProps)factory.getBean("shower");
        
        show.ShowProperties();
	}

}
