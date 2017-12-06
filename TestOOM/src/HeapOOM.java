
import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	public static class oom{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<oom> mylist = new ArrayList<oom>();
		while(true)
		{
			mylist.add(new oom());
		}
		
	}

}
