import java.util.*;

public class EPAM{
	public static void main(String[] args){
		
		int[] arr = {1, 2, 3, 4, 5, 6, 8};

		long start = System.currentTimeMillis();
		System.out.println("Result: " + find(arr));
		System.out.println("Time: " + (System.currentTimeMillis() - start));

		start = System.currentTimeMillis();
		System.out.println("Result: " + find2(arr));
		System.out.println("Time: " + (System.currentTimeMillis() - start));	
	}

	
	public static int find(int[] arr){
		int sum = 0;
		for(int i = 1; i <= arr.length + 1; i++)
			sum += i;

		int factSum = 0;
		for(int i = 0; i < arr.length; i++)
			factSum += arr[i];

		//System.out.println("SUM: " + sum + ", FACT: " + factSum);
		return sum - factSum;
	}


	public static int find2(int[] arr){
		int found = 0;
		for(int i = 1; i <= arr.length + 1; i++){
			boolean missing = true;
			for(int j = 0; j < arr.length; j++)
				if(i == arr[j]) { missing = false; break; }
			if(missing) return i;
		}
		return found;
	}
}
