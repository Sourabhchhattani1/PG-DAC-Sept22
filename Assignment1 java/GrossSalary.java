/*In a company an employee is paid as under: 
If his basic salary is less than Rs. 10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, 
then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user
 write a program to find his gross salary. 
 [ formula : GS= Basic + DA + HRA ]*/
 
 import java.util.*;
 class GrossSalary
 {
	 static void gross()
	 {
		 double hra;
		 double dra;
		 System.out.println("Enter basic salary");
		 Scanner sc = new Scanner(System.in);
		 long salary = sc.nextLong();
		 if(salary<10000)
		 {
			 hra = 0.1*salary;
			 dra = 0.9*salary;
			 
		 }
		 else
		 {
			 hra = 2000;
			 dra = 0.98*salary;
		 }
		 double gs = salary + hra + dra;
		 System.out.println(gs);
	 }
	 public static void main(String args[])
	 {
		 gross();
	 }
 }