import java.util.HashSet;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student = new student("PCQ", 20);
		student student2 = new student("LIQI", 21);
		student student3 = new student("PCQ", 20);
		Set set = new HashSet();
		set.add(student);
		set.add(student2);
		set.add(student3);
		System.out.println(set);	
	}

}
class student implements Comparable{
	
	public String name;
	public int age;
	
	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age;
	}
	
	public boolean equals(Object obj)
	{
		student student = (student) obj;
		return (this.name.equals(student.name)) && (this.age == student.age);
		
	}
	
	public int hashCode()
	{
		return (name+age).hashCode();
	}
	
	public int compareTo(Object obj)
	{
		student student = (student)obj;
		return this.name.compareTo(student.name);
	}
	
}