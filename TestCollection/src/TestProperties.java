import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("d:/TestProperties.txt"));
			System.out.println(properties);
			properties.setProperty("d", "789");
			properties.store(new FileOutputStream("d:/TestProperties.txt"), "test");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
