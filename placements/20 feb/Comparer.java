import java.util.*;

class Comparer
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();	
		System.out.println("Enter second number");
		int b=sc.nextInt();	
		System.out.println("Enter third number");
		int c=sc.nextInt();	
		int g = Math.max(a,b);
		g=Math.max(g,c);
		
		int s = Math.min(a,b);
		s=Math.min(s,c);
		System.out.println("Greatest number is "+g);
		
		System.out.println("Smallest number is "+s);
		
		
	}
}