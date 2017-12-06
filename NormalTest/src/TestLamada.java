class person{
	public String name;
	public int age;
	public person() {
		// TODO Auto-generated constructor stub
	}
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

interface PeopleFactory<F extends person>{
	F getInstance();
}
public class TestLamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleFactory peopleFactory = person::new;
		person person = peopleFactory.getInstance();
		System.out.println(person.age);
	}

}
