import java.util.*;

class Swap3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();	//10
		int n2=sc.nextInt();	//20
		
		n1 = (n1 & n2) + (n1 | n2);
		n2 = n1 + (~n2) + 1;
		n1 = n1 + (~n2) + 1;
		
		System.out.println("n1 = "+n1+" n2 = "+n2);
		
		
		
	}
}