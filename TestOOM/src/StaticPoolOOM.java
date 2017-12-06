import java.util.ArrayList;
import java.util.List;

public class StaticPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<String>();
		int  i = 0;
		while(true)
		{	
			myList.add(String.valueOf(i).intern());
		}
	}

}
