
public class TestClassLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A();
		System.out.println("------");
		new B();
		new C();
		new C();
	}

}
class A
{
	
}
class B
{
	
}
class C
{
	static {
		System.out.println("��̬����ֻ����һ��");
	}
}