package TASK;
import java.util.*;
public class LeastCommonNumber {

	public static void main(String[] args) {

		int arr1[]= {7,9,1,2,5,6};
		int arr2[]= {10,6,4,0,1,9};
		int arr3[]= {9,4,6,7,1,3};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k=0;k<arr3.length;k++)
				{
					if(arr1[i]==arr2[j]&& arr1[i]==arr3[k])
					{
						System.out.println(arr1[i]);
						
					}
			    }
		}
	}
		}
		

}
