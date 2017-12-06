
public class TestIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = new String("ab");
//		String b = new String("ab");
//		String c = "ab";
//		String d = "a" + "b";
//		String e = "b";
//		String f = "a" + e;
//		System.out.println(b.intern() == b);
//		System.out.println(b.intern() == c);
//		System.out.println(b.intern() == d);
//		System.out.println(b.intern() == f);
//		System.out.println(b.intern() == a.intern());
		
		
		String string = new StringBuilder("计算机").append("软件").toString();
		System.out.println(string.intern() == string);
		System.out.println(string.intern() == "计算机软件");
		System.out.println(string == "计算机软件");
		String string2 = new String("计算机硬件");
		System.out.println(string2.intern() == string2);
	
		Integer integer = new Integer(1234);
		Integer integer2 = new Integer(3);
		Integer integer5 = 3;
		System.out.println(integer2 == integer5);
		Integer integer3 = 1222;
		Integer integer4 = 1222;
		System.out.println(integer3 == integer4);
	}

}
