/******************************************************************************
* * * * *
*       *
*       *
* * * * *

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int rows=4, cols=5;
		
		//outer for loop 
		for(int i=1;i<=rows;i++)
		{
		    //inner loop 
		    for(int j=1;j<=cols;j++)
		    {
		        if(i==1 || j==1 || i==rows || j==cols)
		        {
		            System.out.print("* ");
		        }
		        
		        else 
		            System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}
