import java.time.ZoneId;
import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(1, "pcq");
		map.put(2, "liqi");
		map.put(3, "huzhen");
		Set s = map.entrySet();
		Iterator iterator = s.iterator();
		while (iterator.hasNext()) {
			Map.Entry o = (Map.Entry)iterator.next();
			iterator.remove();
			System.out.println("key:"+o.getKey()+" value:"+o.getValue());
			
			
		}
	}

}
