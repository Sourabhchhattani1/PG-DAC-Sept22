/*Write a program to find the simple interest. 
Take the principle amount, 
rate of interest and time from user using Scanner class.*/
import java.util.Scanner;

class SimpleInterest
{
	static void interest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Principal amount =");
		int p = sc.nextInt();
		System.out.println("Rate of interest =");
		int r = sc.nextInt();
		System.out.println("Time =");
		int t = sc.nextInt();
		
		double interest = ((p*r*t)/100);
		System.out.println(interest);
		
	}
	public static void main(String args[])
	{
		interest();
	}
}