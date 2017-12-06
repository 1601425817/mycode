import java.util.PriorityQueue;
class num implements Comparable<num>{
	public int value;
	public num(int i)
	{
		this.value = i;
	}
	@Override
	public int compareTo(num o) {
		// TODO Auto-generated method stub
		String aString = String.valueOf(this.value);
		String bString = String.valueOf(o.value);
		return (aString+bString).compareTo(bString+aString);
	}
	
}
public class MixMinNumber {
	
	public static String PrintMinNumber(int [] numbers) {
		StringBuffer stringBuffer = new StringBuffer();
		PriorityQueue<num> priorityQueue = new PriorityQueue<>();
		for(int i = 0; i < numbers.length; i++)
		{
			priorityQueue.add(new num(numbers[i]));
		}
		while(!priorityQueue.isEmpty())
		{
			int value = priorityQueue.poll().value;
			stringBuffer.append(String.valueOf(value));
		}
		return stringBuffer.toString();
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,32,321};
		String string = PrintMinNumber(array);
		System.out.println(string);
	}

}
