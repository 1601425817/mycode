import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;

public class TestBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = null;
		try {
			fw = new FileWriter("d:/TestBuffer.txt");
			bw = new BufferedWriter(fw);
			for(int i = 0; i < 10; i++)
			{
				double random = Math.random();
				str = String.valueOf(random);
				bw.write(str);
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			fr = new FileReader("d:/TestBuffer.txt");
			br = new BufferedReader(fr);
			str = br.readLine();
			do {
				System.out.println(str);
				str = br.readLine();
			} while (str != null);
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
