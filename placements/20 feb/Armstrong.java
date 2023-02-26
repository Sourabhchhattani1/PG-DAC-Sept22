import java.util.*;

class Armstrong
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp = n;
		int rem,digits=0;
		double res=0;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp =n;
		while(temp!=0)
		{
			rem = temp%10;
			res=res+(Math.pow(rem,digits));
			temp = temp/10;
		}
		if(n == res)
			System.out.println("Amrstrong Number");
		else
			System.out.println("Not an armstrong number");
	}
}