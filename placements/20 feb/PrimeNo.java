import java.util.*;

class PrimeNo
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean isprime = false;
		for(int i=2;i <= n/2;i++)
		{
			if(n%i == 0)
			{
				isprime = true;
				break;
			}
			
		}
		if(isprime == false)
			System.out.println("Is a prime no");
		else
			System.out.println("Is not a prime no");
		
	}
}