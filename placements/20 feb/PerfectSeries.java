import java.util.*;

class PerfectSeries
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which to find : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(isPerfect(i))
				System.out.print(i+" ");
		}
	}
	static boolean isPerfect(int n)
	{
		int sum =0;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum = sum + i;
			
			i++;
		}
		
		
		if(sum == n)
			return true;
		else return false;
	}
}