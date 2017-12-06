package Demo;

import Interface.HelloWorld;
import Interface.Person;

public class HelloWorldImpl implements HelloWorld{

	private Person person;
	public HelloWorldImpl () {
		
	}
	public void sayHello()
	{
		System.out.println("This is hello test"+person.toString());
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
