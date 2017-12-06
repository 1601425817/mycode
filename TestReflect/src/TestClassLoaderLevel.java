
public class TestClassLoaderLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader classLoader = TestClassLoaderLevel.class.getClassLoader();
		while(classLoader!=null)
		{
			System.out.println(classLoader.getClass().getName());
			classLoader = classLoader.getParent();
		}
	}

}
