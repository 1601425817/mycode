package Test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import Demo.HelloWorldImpl;
import Demo.personImpl;

public class HelloWorldTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/resource/spring-context.xml");
	@Test
	public void testHello() {
		
		HelloWorldImpl hello = context.getBean("hello", HelloWorldImpl.class);
		hello.sayHello();
	}
	
	@Test
	public void testPerson() {
		personImpl person = context.getBean("person", personImpl.class);
		person.show();
		personImpl person2 = context.getBean("person2", personImpl.class);
		person2.show();
	}
}
