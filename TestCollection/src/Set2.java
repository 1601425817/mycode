import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		student student = new student("a", 22);
		student student2 = new student("b", 21);
		student student3 = new student("c", 20);
		set.add(student);
		set.add(student2);
		set.add(student3);
		System.out.println(set);
		
	}

}
