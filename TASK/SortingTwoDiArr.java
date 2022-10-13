package TASK;

public class SortingTwoDiArr {
     static int max,min;
	public static void main(String args[])
		    {
			 int m[][] = { { 9, 8, 7, 1 },
                     { 7, 3, 0, 2 },
                     { 9, 5, 3, 12 },
                     { 6, 3, 1, 2 },
                     {10,12,14,16}};
      
		       
		        for (int i = 0; i < m.length; i++) {
		            for (int j = 0; j < m[i].length; j++) {
		 
		              for (int k = 0; k < m.length; k++) {
		                	for (int l=0;l<m[k].length;l++)
		                	{
		                    if (m[k][l] > m[i][j]) {
		 
		                       
		                        int t = m[i][j];
		                        m[i][j] = m[k][l];
		                        m[k][l] = t;
		                        
		                    }
		                }
		            }
		        }
		        }
		 
		        
		        for (int i = 0; i < m.length; i++) {
		            for (int j = 0; j < m[i].length; j++)
		                System.out.print(m[i][j] + " ");
		            System.out.println();
		        }
		 
		        for (int i=0; i<m.length; i++) 
		        	
		        {
		            for (int j=0; j<m[i].length; j++) //coloum
		            {
		                if(m[i][j]>max)
		                {
		                    max=m[i][j];
		                   
		                }
		                else if(m[i][j]<min)
		                {
		                	 min=m[i][j];
		                }
		            }
		        }
		        System.out.println("maximum number is"+max);
		        System.out.println("minimum number is"+min);
	     
		        }
		 
		    
		 
		   
		 
		        
		    }
		