/*. Implement a class for a “Book”.
 Book contains a title (a String),
 a list of authors (array of authors),
 number of pages (an integer), price (floating point number),
 publisher (a String) etc. 
 Write suitable constructor and accessor/modifier methods.
 Implement a class for “Library”. 
 A library contains a list of books (array of Book).
Write add (to add a book) and remove (to delete a book) methods for library. 
Write a main() function to create a
“Library” and add five “Book” to library. Print the total price of all books. */


import java.util.*;
class Book
{
  String title;
  String authors[] = new String[2];
  String publisher;
  int pages;
  float price;
 
 
  
    void Add()
   {
     System.out.println("Enter the Book title: ");     	 
     Scanner sc = new Scanner(System.in);
	 this.title = sc.nextLine();
	 System.out.print("Enter the authors name one by one: ");
	 for(int i = 0;i<authors.length;i++)
	 this.authors[i] = sc.nextLine(); 	 
     System.out.println("Enter the Book publisher : ");
	 this.publisher = sc.nextLine();
	 System.out.print("Enter the number of pages : ");
	 this.pages = sc.nextInt();
	 System.out.print("Enter the Book's price : ");
	 this.price = sc.nextFloat();
	  
   
   }

       
   void Show()
   {
	   System.out.println("Title : "+title);
	   for(int i =0;i<authors.length;i++)
	   System.out.println("Authors : "+authors[i]);
	   
	   System.out.println("Publisher : "+publisher);
	   System.out.println("Pages : "+pages);
	   System.out.println("Price : "+price);
	}
	  
	  
	  Book Remove()
	  {
         return null;
		  
	  }

}
class Library
{
   public static void main(String args[])
   {
	   
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books  you want to enter :");
		int size = sc.nextInt();
		Book[] b1= new Book[size];
		
		
		for(int i=0;i<size;i++)
		{
		    	
			b1[i] = new Book();
			b1[i].Add();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println("\n\n\n");
			b1[i].Show();
		}
		
	    		  char ch = '\n';
		  do
		 {
		  System.out.println("want to remove the book (y/n)");
		  ch = sc.next().charAt(0);
          
		  System.out.println("Book number you want to remove");
		  int r = sc.nextInt();
		  if(ch == 'y' || ch == 'Y')
		  {
             			  
		    b1[r] = b1[r].Remove();
		    System.out.println("Book removed from the Liabrary.");
            			
		  }
		 }while(ch =='y');
		 
          		  
    }  
} 
