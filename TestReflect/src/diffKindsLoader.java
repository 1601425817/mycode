import java.awt.image.DataBufferDouble;

public class diffKindsLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Object.class.getClassLoader());
		System.out.println(DataBufferDouble.class.getClassLoader());
		System.out.println(diffKindsLoader.class.getClassLoader().getClass().getName());
	}

}
