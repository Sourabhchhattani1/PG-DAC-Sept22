/*Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class.
 Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
 import java.util.*;
 
 class Percentage
 {
	 int m1,m2,m3,m4,m5;
	 
	 void getDetails()
	 {
		
		 Scanner sc = new Scanner(System.in);
		 this.m1 = sc.nextInt();
		 this.m2 = sc.nextInt();
		 this.m3 = sc.nextInt();
		 this.m4 = sc.nextInt();
		 this.m5 = sc.nextInt();
	 }
	 void sum()
	 {
		 int sum = m1+m2+m3+m4+m5;
		 System.out.println("[ sum = "+sum+" ] ");
	 }
	 void percentage()
	 {
		 double per = ((m1+m2+m3+m4+m5)/5);
		 System.out.println("[ percentage = "+per+" % ]");
	 }
	 public static void main(String args[])
	 {
		 System.out.println("Please enter marks of 5 subjects :");
		 
		 Percentage p1 = new Percentage();
		 p1.getDetails();
		 p1.sum();
		 p1.percentage();
		 
	 }
 }
 
 