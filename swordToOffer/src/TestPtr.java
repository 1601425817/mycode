class myo{
	int val = 0;
	myo next = null;
	public myo(int val) {
		this.val = val;
	}
}
public class TestPtr {
	
	public void fun1() {
		myo a = new myo(0);
		fun2(a);
		System.out.println(a.next.val);
	}
	public void fun2(myo a) {
		myo nMyo = new myo(2);
		a.next = nMyo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPtr testPtr = new TestPtr();
		testPtr.fun1();
	}
}
