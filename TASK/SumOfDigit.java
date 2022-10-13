package TASK;

public class SumOfDigit {
	
	    public static void main(String[] args) {

	        int a[] = { 9, 8, 7, 6 };
	        int j = 1;
	        int b = 0;
	        for (int i = 0; i < a.length; i++) {
	            b = b + (int) (Math.pow(a[i], j));
	            j++;
	        }
	        System.out.println(b);
	        int c = 0;

	        while (b > 0) {
	            int rem = b % 10;

	            c = c + rem;
	            b = c;	           
	            b = b / 10;

	          

	        } 
	        

	        System.out.println(c);

	    }

	}

