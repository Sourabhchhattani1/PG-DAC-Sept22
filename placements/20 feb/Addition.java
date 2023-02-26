import java.util.*;

class Addition
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x=sc.nextInt();	
		System.out.println("Enter second number");
		int y=sc.nextInt();	
		
		while(y!=0)
		{
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		System.out.println("Sum is : "+x);
	}
}
		
