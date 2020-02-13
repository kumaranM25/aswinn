package com.practice.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		 Resource resource = new FileSystemResource("beans.xml");
//		 BeanFactory bf = new XmlBeanFactory(resource);
//		 Player player1 = (Player) bf.getBean("player1");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Player player = (Player) context.getBean("player1");
		System.out.println("Player Details:\n" + player);
	}

}
