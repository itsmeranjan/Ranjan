package TASK;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		 
			    int[] data = { 9, 5, 1, 4, 3 };
			    InsertionSort is = new InsertionSort(data);
			    //is.insertionSort(data);
			    System.out.println("Sorted Array in Ascending Order: ");
			 System.out.println(Arrays.toString(data));
	}

	InsertionSort(int array[]) {
	    int size = array.length;

	    for (int i = 1; i< size; i++) {
	      int key = array[i];
	      int j = i - 1;

	      while (j >= 0 && key < array[j]) {
	        array[j + 1] = array[j];
	        --j;
	      }

	      array[j + 1] = key;
	    }
	  }
	}
	  

