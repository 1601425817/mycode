
public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer aBuffer = new StringBuffer("A");
		StringBuffer buffer = new StringBuffer("B");
		operator(aBuffer, buffer);
		System.out.println(aBuffer+" "+buffer);
	}
	public static void operator(StringBuffer a,StringBuffer b)
	{
		b = a;
	}

}
