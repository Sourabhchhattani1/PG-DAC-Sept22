/*Write a program to convert temperature 
from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class. 
[ formula : C= 5*(f-32)/9 ]*/
import java.util.*;

class Temperature
{
	static void convertor()
	{
		System.out.println("Enter temperature in Fahrenhiet");
		Scanner sc=new Scanner(System.in);
		double temp = sc.nextDouble();
		double cels = ((5*(temp-32))/9);
		System.out.println("Temperature in Celsius = "+cels);
		
	}
	public static void main(String args[])
	{
		convertor();
	}
}