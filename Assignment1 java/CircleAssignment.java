/*Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
 Then calculate and print the area and circumference of the circle.*/
 import java.util.Scanner;
 
 class CircleAssignment
 {
	 double getArea(double r)
	 {
		 return 3.14*r*r; 
	 }
	 static double getCircumfrence(double r)
	 {
		 return 2*3.14*r;
	 }
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the radius of circle : ");
		 double r = sc.nextDouble();
		 CircleAssignment c1 = new CircleAssignment();
		 System.out.println(c1.getArea(r));
		 System.out.println(getCircumfrence(r));
		 
	 }
 }