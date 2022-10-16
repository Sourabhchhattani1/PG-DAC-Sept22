/*
. Write a program to implement a class “student” with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above. 
*/

class Student
{
	String studentName;
	int marks1;
	int marks2;
	int marks3;
	double avg;
	
	Student()
	{
		
	}
	Student(String studentName , int marks1,int marks2,int marks3)
	{
		this.studentName=studentName;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	void average()
	{
		
		avg = ((marks1+marks2+marks3)/3);
	}
	void display()
	{
		
		System.out.println(studentName+" , "+avg);
	}
	public static void main(String args[])
	{
		Student s1 = new Student("Ram",10,10,10);
		
		s1.average();
		s1.display();
	}
	
	
	
}