import java.util.*;

class Rev
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();	
		int num = 0;
		while(n!=0)
		{
			int digit = n%10;
			num = num*10+digit;
			n=n/10;
			
		}
		System.out.println(num);
		
		
	}
}