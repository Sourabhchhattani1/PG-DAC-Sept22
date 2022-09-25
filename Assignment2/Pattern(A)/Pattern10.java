public class Pattern10
{
		public static void main(String []args)
		{
			int alphabet = 64;
			
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(" ");	
				}
				for(int j=5;j>=i;j--)
				{
					System.out.print((char)(alphabet+j)+" ");
				}
				System.out.println();
			}
			
			
			
			
			
		}
}