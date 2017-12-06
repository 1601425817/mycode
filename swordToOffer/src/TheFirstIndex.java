import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TheFirstIndex {
	public static int FirstNotRepeatingChar(String str) {
		if(str.length() == 0)
			return 0;
		char[] chars = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < chars.length; i++)
		{
			if(!map.containsKey(chars[i]))
				map.put(chars[i], i);
			else
				map.put(chars[i], -1);
		}
		Set<Integer> set = (Set<Integer>) map.values();
		int min = Integer.MAX_VALUE;
		for (int temp : map.values()) {
			if(temp != -1 && temp < min)
				min = temp;
		}
		return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNotRepeatingChar("ababac"));
	}

}
