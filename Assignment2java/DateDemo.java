/*
2. Implement a class for “DateDemo”. Write member functions for (i) getting the previous day, (iv) getting the next 
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii) 
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are 
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user 
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day. 
*/

class DateDemo
{
		int day; 
		int month;
		int year,prevDay,nextDay;
		
		DateDemo()
		{
			System.out.println("0 arg cons called");
			day=01;
			month=01;
			year=1970;
		}
		DateDemo(int day)
		{
			this();		//calling 0 arg cons(first statement)
			System.out.println("1 arg called");
			this.day=day;
		}
		DateDemo(int day,int month)
		{
			this(day);
			System.out.println("2 arg called");
			this.month=month;
		}
		DateDemo(int day,int month,int year)
		{
			this(day,month);	//calling 2arg cons
			System.out.println("3 arg called");
			this.year=year;
		}
		void previousDay()
		{
			
			if(day==1)
			{
				prevDay=31-day;			//Consider 30 day Month  
			}
			else
			{
				prevDay=day-1;
			}
			System.out.println(prevDay+"/"+month+"/"+year);
		}
		void nextDay()
		{
			if(day==30)
			{
				nextDay = 1;
			}
			else
			{
				nextDay = day+1;
			}
			System.out.println(nextDay+"/"+month+"/"+year);
		}


		public static void main(String args[])
		{
			DateDemo d = new DateDemo(5,10);
			d.previousDay();
			d.nextDay();
			
		}
}