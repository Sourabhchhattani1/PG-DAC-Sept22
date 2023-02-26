import java.util.*;
class SecondMin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 numbers : ");
		for(int i =0;i<5;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j = 1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("Second minmum number is : "+arr[1]);
	}
}