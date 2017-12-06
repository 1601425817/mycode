import java.util.ArrayList;


public class UrgulyNumber {
	public static int GetUglyNumber_Solution(int index) {
		if(index <= 0)
			return 0;
		if(index == 1)
			return 1;
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		int count = 1;
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		while(arrayList.size() < index)
		{
			int m2 = arrayList.get(i2) * 2;
			int m3 = arrayList.get(i3) * 3;
			int m5 = arrayList.get(i5) * 5;
			int min = Math.min(m2, Math.min(m3, m5));
			if(!arrayList.contains(min))
				arrayList.add(min);
			if(min == m2)
				i2++;
			if(min == m3)
				i3++;
			if(min == m5)
				i5++;
			System.out.println("i2 "+i2+" m2 "+m2+" i3 "+i3+" m3 "+m3+" i5 "+i5+" m5 "+m5+" min "+min);
		}
		return arrayList.get(index-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(7));
	}

}
