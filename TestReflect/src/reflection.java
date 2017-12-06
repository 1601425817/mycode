import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.ws.soap.MTOM;

public class reflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		String string = "T";
		Class class1 = Class.forName(string);
		Object object = class1.newInstance();
		System.out.println(object);
		Method[] methods = class1.getMethods();
		for (Method method : methods) {
			if(method.getName().equals("getValue"))
			{
				System.out.println("prepare to exe getValue");
				System.out.println("value="+method.invoke(object));
			}
		}
	}

}

class T
{
	public int i = 1;
	static {
		System.out.println("我被加载了");
	}
	public int getValue() {
		return i;
	}
}