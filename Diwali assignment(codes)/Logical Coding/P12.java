class P12{
	
	public static void main(String[] args){
		
		int n=6;
		char ch = 'A';
	
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				System.out.print(ch++ + " ");
			
			ch = 'A';
			System.out.println();
		}

	}
}