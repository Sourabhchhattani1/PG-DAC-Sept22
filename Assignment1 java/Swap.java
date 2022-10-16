/*Write a program to swap two numbers without using third variable.*/
import java.util.*;

class Swap
{
	static void swap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to swap");
		int a = sc.nextInt();	//10
		int b = sc.nextInt();	//20
		System.out.println("Numbers before swapping => a = "+a+", b = "+b);
		a=a+b;	//30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20
		System.out.println("Numbers after swapping => a = "+a+", b = "+b);
		
		
	}
	public static void main(String args[])
	{
		swap();
		
	}
}