import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestInputStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bw = new BufferedReader(isr);
		String string = null;
		
		try {
			
			while (true) {
				
				string = bw.readLine();
				if(string.equalsIgnoreCase("exit"))
					break;
				else {
					System.out.println(string);
					string = bw.readLine();
				}
				bw.close();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

 	}

}
