package org.tamer1an.test1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static AbstractApplicationContext context;

	public static void main(String[] args) {  //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

		context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
//		Triangle triangle = (Triangle) context.getBean("triangle");		
//		triangle.draw();
		Shape shape = (Shape) context.getBean("circle");		
		shape.draw();
	}
}
