package TASK;
import java.util.Arrays;

class BubbleSort {

 
  static void bubbleSort(int array[]) {
    int size = array.length;
    
   
    for (int i = 1; i < size ; i++)
    
      
      for (int j = 0; j < size -1 ; j++)

       
        if (array[j] >array[j +1]) {

          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    
    
    BubbleSort.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}