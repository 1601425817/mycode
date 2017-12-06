public class TestFloat implements Cloneable{
	int a;
	public TestFloat(int a)
	{
		this.a = a;
	}
	@Override public TestFloat clone()
	{
	
			System.out.println("132");
			try {
				return (TestFloat) super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	
	}
	public static void main(String[] args){
//		TestFloat testFloat = new TestFloat(1);
//		son son = new son(1, 2);
//			son son2= (son) son.clone();
//			System.out.println(son2);
//			System.out.println(son.inner == son2.inner);
		System.out.println(Float.compare(Float.NaN, Float.NaN));
	}
}
class inner implements Cloneable{
	int c;
	public inner()
	{
		c= 3;
	}
	@Override public inner clone() {
		try {
			return (inner) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}
class son extends TestFloat implements Cloneable{
	int b;
	inner inner;
	public son(int a, int b)
	{
		super(a);
		this.b = b;
		inner = new inner();
	}
	@Override public son clone()
	{
		son son =  (son) super.clone();
		son.inner = this.inner.clone();
		return son;
	
	}
	public String toString()
	{
		return "a"+a+"b"+b+"c"+inner.c;
	}
}
