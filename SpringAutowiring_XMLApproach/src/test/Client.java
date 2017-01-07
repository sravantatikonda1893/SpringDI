package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) 
	{
ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_byName.xml");
//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_byType.xml");
//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_constructor.xml");
//ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_autodetect.xml");
Car c=(Car)ap.getBean("c");
c.printData();		
	}

}
