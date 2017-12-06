import java.io.*;
import java.nio.file.attribute.DosFileAttributes;

public class TestDataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		try {
			dos.writeInt(100);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		DataInputStream dis = new DataInputStream(bais);
 		try {
			System.out.println(dis.readInt());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
