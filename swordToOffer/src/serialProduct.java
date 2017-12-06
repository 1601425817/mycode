import java.util.ArrayList;
public class serialProduct {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int length = array.length;
        int sIndex = 0;
        int bIndex = length - 1;
        while(sIndex < bIndex)
        {
        	System.out.println(" low "+array[sIndex]+" high "+array[bIndex]);
            if((array[sIndex]+array[bIndex]) == sum)
            {
                list.add(array[sIndex]);
                list.add(array[bIndex]);
                break;
            } else if((array[sIndex]+array[bIndex]) > sum){
                bIndex--;
            } else{
                sIndex++;
            }
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,7,11,15};
		ArrayList<Integer> arrayList = FindNumbersWithSum(array, 15);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
	}

}
