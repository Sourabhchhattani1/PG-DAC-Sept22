import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp = n;
		int num = 0;
		while(n!=0)
		{
			int digit = n%10;
			num = num*10+digit;
			n=n/10;
			
		}
		if(temp==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
	}
}