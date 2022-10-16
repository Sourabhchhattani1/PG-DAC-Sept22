/*
7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method. 
*/
import java.util.*;

class MathOperation
{
	int a;
	int b;
	
	static int add(int a, int b)
	{
			int sum = a+b;
			return sum;
	}
	static int subtract(int a,int b)
	{
		if(a>b)
		{
		int difference = a - b;
		return difference;
		}
		else
		{
		int difference = b-a;
		return difference;
		}
		
	}
	static int multiply(int a,int b)
	{
		int product = a*b;
		return product;
	}
	static double power(int a,int b)
	{
		double power = Math.pow(a,b);
		return power;
	}
}
class Demo
{
	public static void main(String args[])
	{
		System.out.println("Enter two numbers :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		MathOperation m1 = new MathOperation();		//1st approach
		System.out.println(m1.add(a,b));
		System.out.println(m1.subtract(a,b));
		System.out.println(m1.multiply(a,b));
		System.out.println(m1.power(a,b));
		//System.out.println(MathOperation.add(4,5));	//2nd approach
	}
}
