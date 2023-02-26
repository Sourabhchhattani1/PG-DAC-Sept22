import java.util.*;

class PrintDigits
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();	
		while(n>0)
		{
			int temp = n%10;
			n=n/10;
			System.out.println(temp);
		}
		
		
		
	}
}