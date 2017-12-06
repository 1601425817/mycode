import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class  T implements java.io.Serializable{
	public int a = 1;
	public int b = 2;
	public int c = 3;
	public int d = 4;
	public T()
	{
		
	}
}
public class Serializable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t = new T();
		try {
			FileOutputStream fos = new FileOutputStream("d:/serializable.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			FileInputStream fis = new FileInputStream("d:/serializable.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			T a = (T)ois.readObject();
			System.out.println(a.a);
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
