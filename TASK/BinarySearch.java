package TASK;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = {11,6,9,1,4,6};  
		Arrays.sort(arr);
		       int key = 1;  
		       int last=arr.length-1;  
		       binarySearch(arr,0,last,key);  
		}

		private static void binarySearch(int[] arr, int i, int j, int key) {

		int mid = (i + j)/2;  
		  while( i <= j ){  
		     if ( arr[mid] < key ){  
		       i= mid + 1;    
		     }else if ( arr[mid] == key ){  
		       System.out.println("Element is found at index: " + mid);  
		       break;  
		     }else{  
		        j = mid - 1;  
		     }  
		     mid = (i + j)/2;  
		  }  
		  if ( i > j ){  
		     System.out.println("Element is not found!");  
		  }  
		}

		}

