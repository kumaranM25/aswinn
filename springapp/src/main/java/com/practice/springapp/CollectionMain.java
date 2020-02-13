package com.practice.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
//		 Resource resource = new FileSystemResource("beans.xml");
//		 BeanFactory bf = new XmlBeanFactory(resource);
//		 Player player1 = (Player) bf.getBean("player");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CollectionDI cdi = (CollectionDI) context.getBean("collectionDI");
		cdi.display();
	}
}
