/******************************************************************************
Star Pattern 1

* 

* * 

* * * 

* * * * 

* * * * *   

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int rows=5, cols=5;
		
		for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
