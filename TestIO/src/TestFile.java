import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		FileInputStream fis = null;
		InputStream in = null;
		byte[] bytes = new byte[10];
		try {
			fos = new FileOutputStream("d:/TestFile.txt");
			in = System.in;
			int length = in.read(bytes, 0, 10);
			do {
				for (byte b : bytes) {
					fos.write(b);
				}
				length = in.read(bytes, 0, 10);
				if(length == 0)
					System.exit(-1);	
			} while (length != 0);
			fos.close();
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			fis = new FileInputStream("d:/TestFile.txt");
			int length = fis.read(bytes, 0, 10);
			for (byte b : bytes) {
				System.out.println((char)b);
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

}
