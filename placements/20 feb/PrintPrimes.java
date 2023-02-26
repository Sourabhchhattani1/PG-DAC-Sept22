import java.util.*;

class PrintPrimes
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i ,count;
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
			   if(j%i==0)
			   {
					count++;        
			   }
			}
			if(count==2)
				   System.out.print(j+"  ");     
			
		}
	}
}