import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

class Node implements Comparable<Node>{

	private int value;
	public  Node(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.value - o.value;
	}
	
	@Override
	public String toString()
	{
		return String.valueOf(value);
	}
}
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Node> nodes = new TreeSet<>();
		Node node = new Node(3);
		nodes.add(new Node(3));
		nodes.add(new Node(5));
		nodes.add(new Node(4));
		System.out.println(nodes);
		HashSet<Node> nodes2 = new HashSet();
		nodes2.add(new Node(3));
		nodes2.add(new Node(5));
		nodes2.add(new Node(4));
		System.out.println(nodes2);
		ListIterator<Node> iterator = (ListIterator<Node>) nodes.iterator();
		iterator.add(new Node(1));
		while(iterator.hasNext())
		{
			Node node2 = iterator.next();
			System.out.println(node2);
		}
	}

}
