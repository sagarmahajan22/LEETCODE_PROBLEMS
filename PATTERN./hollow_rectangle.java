/*
print following pattern

****
*  *
*  *
****

*/


public static void main (String[] args) throws java.lang.Exception
{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
          if(i==1 | j==4 | j==1 | i==4)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
				
			}
			System.out.println();
		}
		
}
