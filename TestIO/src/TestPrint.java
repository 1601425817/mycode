import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		try {
			FileWriter fw = new FileWriter("d:/TestPrint.txt");
			PrintWriter pw = new PrintWriter(fw);
			while((string = br.readLine()) != null)
			{
				if(string.equals("exit"))
					break;
				pw.write(string);
				pw.flush();
			}
			br.close();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
