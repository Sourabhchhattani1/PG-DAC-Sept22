import java.util.*;

class PerfectNo
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum =0;
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum = sum + i;
			
			i++;
		}
		
		
		if(sum == n)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}
}