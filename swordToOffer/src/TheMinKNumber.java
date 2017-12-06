import java.util.ArrayList;
public class TheMinKNumber {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        int length = input.length;
        if(length == 0 || k == 0)
        	return results;
        int low = 0;
        int high = length - 1;
        int index = 0;
        while(true)
        {
            index = mysort(input, low, high);
            System.out.println("index is "+index);
            if(index == k)
                break;
            if(index > k)
            {
               high = index - 2;
            }
            if(index < k)
            {
                low = index+1;
                k = k - index;
            }
        }
        for(int i = 0; i < index; i++)
        {
            results.add(input[i]);
        }
        return results;
        
    }
    
    public static int mysort(int[] input, int low, int high)
    {
        int pivot = input[high];
        int i = low - 1;
        int j = high + 1;
       // System.out.println(low);
        while(i < j)
        {
            while(input[++i] < pivot);
            while(input[--j] > pivot);
            if(j < i)
                break;
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            
        }
        int temp = input[high];
        input[high] = input[i];
        input[i] = temp;
        for (int k : input) {
			System.out.print(k+" ");
		}
        System.out.println();
        System.out.println(i+1);
        return i+1;
    }
    
    public static void main(String[] args)
    {
    	int[] input = {1,2,3,4,5,6,7,8};//1,2,3,4,5,6,7,8
    	ArrayList<Integer> arrayList = GetLeastNumbers_Solution(input, 7);
    	System.out.println(arrayList);
    }
}