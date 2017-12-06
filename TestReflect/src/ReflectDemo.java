import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Queue;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.out.println(new order(1, 2).getAmount("Strategy"));
	}

}
class order{
	private int count;
	private int unitPrice;
	public order(int count, int unitPrice) {
		this.count = count;
		this.unitPrice = unitPrice;
	}
	public double getAmount(String strategy) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class class1 = Class.forName(strategy);
		Object object = class1.newInstance();
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.get(object));
		}
		return count * unitPrice;
	}
}

class Strategy{
	double i  = 0.5;
}