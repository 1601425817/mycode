import java.util.ArrayList;
import java.util.*;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();Object object = null;
		arrayList.add("123");
		arrayList.add("456");
		arrayList.add("789");
		Iterator iterator = arrayList.iterator();
		
		while (iterator.hasNext()) {
			object = iterator.next();
			iterator.remove();
			System.out.println(object);
		}
		
		System.out.println(arrayList);
		
	}

}
