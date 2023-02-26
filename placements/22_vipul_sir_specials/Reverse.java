import java.util.*;
import java.lang.*;
class Reverse
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		int n =str.length();
		String reversed = "";
		char ch;
		
		for(int i =0;i<n;i++)
		{
			ch=str.charAt(i);
			reversed = ch + reversed;
		}
		System.out.println(reversed);
	}
}