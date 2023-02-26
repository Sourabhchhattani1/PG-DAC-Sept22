import java.util.*;
import java.lang.*;
class Perm
{
	static String swap(String s,int i, int j)
	{
		char temp;
		char[] arr = s.toCharArray();
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}
	static void perm(String str,int l, int r)
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for(int i=l;i<=r;i++)
			{
				str = swap(str,l,i);
				perm(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		int n =str.length();
		System.out.println("The permutations are : ");
		perm(str,0,n-1);
	}
}