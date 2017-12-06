import java.io.FileReader;
import java.io.FileWriter;

public class TestFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fr = new FileReader("d:/TestFile.txt");
			fw = new FileWriter("d:/TestFile2.txt");
			int i = fr.read();
			do {
				fw.write(i);
				i = fr.read();
			} while (i != -1);
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
