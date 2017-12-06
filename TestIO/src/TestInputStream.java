import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream in = System.in;
		System.out.println("please enter");
		int i;
		try {
			while((i=in.read())!=-1)
			{
				System.out.println((char)i);
				
			}
			in.close();
			System.exit(-1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
