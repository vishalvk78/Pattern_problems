/******************************************************************************
*****
****
***
**
* 

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=5;
		
		//outer loop 
		for(int i=n;i>=1;i--)
		{
		    //inner loop
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	}
}
