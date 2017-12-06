import java.util.ArrayList;
public class serialSum {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > lists = new ArrayList<>();
        if(sum < 2)
            return lists;
        int small = 1;
        int big = 2;
        int current = 0;
        while(small < (sum+1)/2)
        {
        	System.out.println("small "+small+" big "+big);
            current = (small + big ) * (big - small + 1) / 2;
            if(current == sum)
            {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = small; i <= big; i++)
                {
                    list.add(i);
                }
                lists.add(list);
                big++;
            } else if(current > sum)
            {
                small++;
            } else if(current < sum){
                big++;
            }
            
        }
        return lists;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists = FindContinuousSequence(100);
		for (ArrayList<Integer> arrayList : lists) {
			for (Integer integer : arrayList) {
				System.out.println(integer);
			}
		}
	}

}
