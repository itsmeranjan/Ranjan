package TASK;

public class Maximum {
	
	    
 public static void main (String[] arg) {
	        int a[][] = {{2,5,7,9},{3,6,8,1,10}};
	        int max=a[0][0];
	        int min=a[0][0];
	        
	        for (int i=0; i<a.length; i++) 
	        	
	        {
	            for (int j=0; j<a[i].length; j++) //coloum
	            {
	                if(a[i][j]>max)
	                {
	                    max=a[i][j];
	                   
	                }
	                else if(a[i][j]<min)
	                {
	                	 min=a[i][j];
	                }
	            }
	        }
	        System.out.println("maximum number is "+max);
	        System.out.println("minimum number is "+min);
     
	        }
	            
 }
       
