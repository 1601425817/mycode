import java.io.InputStream;
import java.nio.Buffer;

public class TestInputStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		byte[] Buffer = new byte[10];
		try {
			int length = in.read(Buffer, 0, 10);
			for (byte b : Buffer) {
				System.out.println((char)b);
			}
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
