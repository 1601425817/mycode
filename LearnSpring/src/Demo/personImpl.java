package Demo;
import Interface.Person;
public class personImpl implements Person{
	private String name;
	private int age;
	public void show()
	{
		System.out.println("name "+name+" age "+age);
	}
	public personImpl()
	{
		
	}
	public personImpl(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return ""+name+age;
	}
}
