package org.tamer1an.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {  //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		
		triangle.draw();
	}
}
