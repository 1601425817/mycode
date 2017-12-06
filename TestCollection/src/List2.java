import java.util.LinkedList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.offer("a");
		l.offer("b");
		l.offer("c");
		
		System.out.println(l);
		l.poll();
		System.out.println(l);
	}

}
