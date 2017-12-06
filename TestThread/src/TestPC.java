import java.util.LinkedList;
import java.util.Queue;

public class TestPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class producer implements Runnable{
	public void run()
	{
		
	}
}

class MyQueue extends LinkedList{
	public int size;
	public MyQueue()
	{
		this.size = 5;
	}
	public MyQueue(int size)
	{
		this.size = size;
	}
	public boolean offer(Object obj)
	{
		return super.offer(obj);
	}
	
	public Object peek()
	{
		return super.peek();
	}
	
	public synchronized Object poll ()
	{
		this.size++;
		return super.poll();		
	}
}