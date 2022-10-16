/*Write a program to read the days (eg. 670 days) 
as integer value using Scanner class.
 Now convert the entered days into complete years, 
 months and days and print them.*/
 import java.util.*;
 class Year
 {
	 static void convertor()
	 {
		 System.out.println("Enter number of days");
		 Scanner sc = new Scanner(System.in);
		 int days = sc.nextInt();
		 int years = (days/365);
		 int months = (days%365);	
		 int m1 = (months/30);	
		 int day = (months%30);
		 
		 System.out.println(years + "years "+ m1 + "months "+day+"days");
	 }
	 public static void main(String args[])
	 {
		convertor(); 
	 }
 }