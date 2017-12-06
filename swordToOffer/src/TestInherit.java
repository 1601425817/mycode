import java.lang.reflect.GenericDeclaration;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class A {
	private int a = 1 ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

public class TestInherit{

	public void Add(A a) {
		a.setA(2);
	}
	
	public static int gcd(int p,int q)
	{
		if(q==0) return p ;
		int r = p%q;
		System.out.println("r is "+r);
		return gcd(q,r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		TestInherit testInherit = new TestInherit();
		testInherit.Add(a);
		System.out.println(a.getA());
		System.out.println(gcd(4,6));
		int [][] aa = new int[3][];
		aa[1] = new int [5];
		aa[2] = new int [6];
		
	}

}
