import java.util.ArrayList;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringCollection = new ArrayList<>();  
		stringCollection.add("ddd2");  
		stringCollection.add("aaa2");  
		stringCollection.add("bbb1");  
		stringCollection.add("aaa1");  
		stringCollection.add("bbb3");  
		stringCollection.add("ccc");  
		stringCollection.add("bbb2");  
		stringCollection.add("ddd1");  
		stringCollection  
	    .stream()  
	    .filter((s) -> s.startsWith("a"))  
	    .forEach((String s)->{s=s+"1";});  
		for (String string : stringCollection) {
			System.out.println(string);
		}
	}
}
