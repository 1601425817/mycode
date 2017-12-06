
public class CountInverse {
	static int[] temp;
	public static int InversePairs(int [] array) {
		if(array.length == 0 || array.length == 1)
			return 0;
	    int count = 0;
		temp = new int[array.length];
		count = MergeSort(array, 0, array.length - 1);
		count %= 1000000007;
		return count;
    }
	public static int MergeSort(int[] input, int low, int high) {
		if(high <= low)
			return 0;
		int result = 0;
		int mid = low + (high-low) /2;
		result += MergeSort(input, low, mid);
		result %= 1000000007;
		result += MergeSort(input, mid+1, high);
		result %= 1000000007;
		result += Merge(input, low, high);
		result %= 1000000007;
		return result;
	}
	public static int Merge(int[] input, int low, int high) {
		int result = 0;
		int mid = low + (high-low) /2;
		for(int i = low; i <= high; i++)
		{
			temp[i] = input[i];
		}
		int i = low;
		int j = mid+1;
		for(int k = low; k <= high; k++)
		{
			if(i > mid)
				input[k] = temp[j++];
			else if(j > high)
				input[k] = temp[i++];
			else if(temp[i] > temp[j])
			{
				input[k] = temp[i++];
				result += (high - j + 1);
			}
			else
				input[k] = temp[j++];
		}
		System.out.println("result"+result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
		System.out.println(InversePairs(array));
		for (int i : array) {
			System.out.print(i+" ");
		}
	}

}
