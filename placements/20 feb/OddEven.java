import java.util.*;

class OddEven
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to ckeck");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("It is an even number");
		else
			System.out.println("It is a odd number");
	}
}
