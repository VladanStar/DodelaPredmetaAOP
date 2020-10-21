package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Profesor profesor = (Profesor) context.getBean("profesor");
		profesor.dodajPredmet("Programski jezici");
		profesor.dodajPredmet("Baze podataka");
		System.out.println(profesor.toString());
		
		((FileSystemXmlApplicationContext)context).close();

	}
}
